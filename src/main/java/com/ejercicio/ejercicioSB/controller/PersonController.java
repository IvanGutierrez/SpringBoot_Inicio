package com.ejercicio.ejercicioSB.controller;

import com.ejercicio.ejercicioSB.model.Person;
import com.ejercicio.ejercicioSB.service.impl.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v3")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/persons")
    public List<Person> readAll(){
        return personService.readAll();
    }
}
