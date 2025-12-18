package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Inventario;


public interface InventarioRepository extends JpaRepository<Inventario, Long>{

    List<Inventario> findBySectors(String Sectors);
    List<Inventario> findByUsers(String Users);
    List<Inventario> findByHostnames(String hostnames);
    List<Inventario> findByPcInfos(String pcInfos);
    List<Inventario> findByOtherEquips(String otherEquips);

}
