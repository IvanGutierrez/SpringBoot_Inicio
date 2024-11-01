package com.ejercicio.ejercicioSB.controller;

import com.ejercicio.ejercicioSB.entity.Persona;
import com.ejercicio.ejercicioSB.service.impl.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v3/")
public class PersonaController {
    @Autowired
    PersonaService personaService;
    @GetMapping("/persona")
    public List<Persona> readAll(){
        return personaService.readAll();
    }
}
