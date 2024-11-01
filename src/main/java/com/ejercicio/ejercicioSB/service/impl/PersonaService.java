package com.ejercicio.ejercicioSB.service.impl;

import com.ejercicio.ejercicioSB.entity.Persona;
import com.ejercicio.ejercicioSB.model.PersonaResponse;
import com.ejercicio.ejercicioSB.repository.PersonaRepository;
import com.ejercicio.ejercicioSB.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<PersonaResponse> readAll() {
        List<Persona> listaDePersonas = personaRepository.findAll();
        List<PersonaResponse> listaResultado = listaDePersonas.stream().map(s ->{
            PersonaResponse personaResponse = new PersonaResponse();
            personaResponse.setId(s.getId());
            personaResponse.setNombre(s.getNombre());
            personaResponse.setEdad(s.getEdad());
            personaResponse.setIdDepartamento(s.getIdDepartamento().getId());
            return personaResponse;
        }).toList();
        return listaResultado;
    }
}
