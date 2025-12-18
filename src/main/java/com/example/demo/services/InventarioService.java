package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.InventarioDTO;
import com.example.demo.entities.Inventario;
import com.example.demo.mapper.InventarioMapper;
import com.example.demo.repositories.InventarioRepository;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository repo;

    @Autowired
    private InventarioMapper mapper;

    public InventarioDTO criar(InventarioDTO dto) {
        Inventario entity = mapper.toEntity(dto);
        Inventario salvo = repo.save(entity);
        return mapper.toDTO(salvo);
    }

    public List<InventarioDTO> findAllList() {
        return repo.findAll().stream().map(mapper::toDTO).toList();
    }

    public List<InventarioDTO> findByUsers(String users) {
        return repo.findByUsers(users)
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    public List<InventarioDTO> findBySectors(String sectors) {
        return repo.findBySectors(sectors)
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    public List<InventarioDTO> findByHostnames(String hostnames) {
        return repo.findByHostnames(hostnames)
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    public List<InventarioDTO> findByPcInfos(String pcInfos) {
        return repo.findByPcInfos(pcInfos)
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    public List<InventarioDTO> findByOtherEquips(String otherEquips) {
        return repo.findByOtherEquips(otherEquips)
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

}
