/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TiendaClase.TiendaClase.service;

import com.TiendaClase.TiendaClase.entity.Persona;
import java.util.List;

/**
 *
 * @author Cristofer
 */
public interface IPersonaService {
    public List<Persona> getAllPersona();
    public Persona getPersonaById(long id);
    public  void savePersona(Persona persona);
    public void delete (long id);
    
}
