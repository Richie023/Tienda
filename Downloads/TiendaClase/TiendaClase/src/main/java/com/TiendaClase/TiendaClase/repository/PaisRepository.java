/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TiendaClase.TiendaClase.repository;
import com.TiendaClase.TiendaClase.entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cristofer
 * paisRepository
 */
@Repository
public interface PaisRepository extends CrudRepository<Pais,Long >{
    
    
}
