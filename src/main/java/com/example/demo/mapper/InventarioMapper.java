package com.example.demo.mapper;

import org.springframework.stereotype.Component;

import com.example.demo.dto.InventarioDTO;
import com.example.demo.entities.Inventario;


@Component
public class InventarioMapper {

    public Inventario toEntity(InventarioDTO dto){
        Inventario inv = new Inventario();
        inv.setUsers(dto.getUsers());
        inv.setHostnames(dto.getHostnames());
        inv.setSectors(dto.getSectors());
        inv.setOtherEquips(dto.getOtherEquips());
        inv.setPcInfos(dto.getPcInfos());   
        return inv; 
    }

    public InventarioDTO toDTO(Inventario inv){
        InventarioDTO dto = new InventarioDTO();
        dto.setUsers(inv.getUsers());
        dto.setSectors(inv.getSectors());
        dto.setHostnames(inv.getHostnames());
        dto.setPcInfos(inv.getPcInfos());
        dto.setOtherEquips(inv.getOtherEquips());
        return dto;
    }

}
