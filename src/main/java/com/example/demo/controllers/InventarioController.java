package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.InventarioDTO;
import com.example.demo.services.InventarioService;

@RestController
@RequestMapping("/inventarios")
public class InventarioController {

    @Autowired 
    private InventarioService service;

    @PostMapping
    public InventarioDTO criar(@RequestBody InventarioDTO dto){
        return service.criar(dto);
    }

    @GetMapping
    public List<InventarioDTO> findAllList(){
        return service.findAllList();
    }

    @GetMapping("/users/{users}")
    public List<InventarioDTO> finByUsers(@PathVariable String users){
        return service.findByUsers(users);
    }
    
    @GetMapping("/sector/{sectors}")
    public List<InventarioDTO> findBySectors(@PathVariable String sectors) {
        return service.findBySectors(sectors);
    }

    @GetMapping("/hostnames/{hostnames}")
    public List<InventarioDTO>findByHostnames(@PathVariable String hostnames){
        return service.findByHostnames(hostnames);
    }

    @GetMapping("/pcInfos/{pcinfos}")
    public List<InventarioDTO>finByPcInfos(@PathVariable String pcInfos){
        return service.findByPcInfos(pcInfos);
    }

    @GetMapping("/otherEquips/{otherEquips}")
    public List<InventarioDTO>findByOtherEquips(@PathVariable String otherEquips){
        return service.findByOtherEquips(otherEquips);
    }



    

}
