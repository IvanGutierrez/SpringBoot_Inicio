package com.ejercicio.ejercicioSB.controller;

import com.ejercicio.ejercicioSB.model.Person;
import com.ejercicio.ejercicioSB.service.impl.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/persons/{id}")
    public Person readById(@PathVariable("id") Integer id){
        return personService.readById(id);
    }

    @PostMapping("/persons")
    public Person create(@RequestBody Person person){
        return personService.create(person);
    }

    @PutMapping("/persons/{id}")
    public Person update(@PathVariable("id") Integer id, @RequestBody Person person) {
        return personService.update(id, person);
    }
}
