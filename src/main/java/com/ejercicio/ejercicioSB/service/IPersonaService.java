package com.ejercicio.ejercicioSB.service;

import com.ejercicio.ejercicioSB.entity.Departamento;
import com.ejercicio.ejercicioSB.entity.Persona;
import com.ejercicio.ejercicioSB.model.PersonaResponse;

import java.util.List;

public interface IPersonaService {
    public List<Persona> readAll();
    public Persona readById(Integer id);
    public Persona create(Persona persona);
    public Persona update(Persona persona);
    public String delete(Persona persona);
    public String deleteById(Integer id);

    public List<PersonaResponse> readAllResponse();

}
