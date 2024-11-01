package com.ejercicio.ejercicioSB.service;

import com.ejercicio.ejercicioSB.entity.Persona;
import com.ejercicio.ejercicioSB.model.PersonaResponse;

import java.util.List;

public interface IPersonaService {
    public List<PersonaResponse> readAll();

}
