package com.ejercicio.ejercicioSB.service.impl;

import com.ejercicio.ejercicioSB.entity.Persona;
import com.ejercicio.ejercicioSB.model.PersonaResponse;
import com.ejercicio.ejercicioSB.repository.PersonaRepository;
import com.ejercicio.ejercicioSB.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository personaRepository;
    @Override
    public List<Persona> readAll() {
        return personaRepository.findAll();
    }

    @Override
    public Persona readById(Integer id) {
        Optional<Persona> personaOptional = personaRepository.findById(id);
        if (personaOptional.isPresent()){
            return personaOptional.get();
        } else {
            return new Persona();
        }
    }

    @Override
    public Persona create(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona update(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public String delete(Persona persona) {
        personaRepository.delete(persona);
        return "Persona " + persona.getNombre() + " borrado exitosamente";
    }

    @Override
    public String deleteById(Integer id) {
        Optional<Persona> personaOptional = personaRepository.findById(id);
        if (personaOptional.isPresent()){
            Persona persona = personaOptional.get();
            persona.setIsActive(false);
            personaRepository.save(persona);
            return "Persona borrado lógicamente";
        } else {
            return "El id que ingresaste no existe";
        }

    }

    @Override
    public List<PersonaResponse> readAllResponse() {
        List<Persona> listaDePersonas = personaRepository.findAll();
        List<PersonaResponse> listaResultados = listaDePersonas.stream().map(s ->
        {
            PersonaResponse personaResponse = new PersonaResponse();
            personaResponse.setId(s.getId());
            personaResponse.setNombre(s.getNombre());
            personaResponse.setEdad(s.getEdad());
//            personaResponse.setIdDepartamento(s.getIdDepartamento());
            return personaResponse;
        }).toList();
        return listaResultados;
    }
}
