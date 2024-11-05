package com.ejercicio.ejercicioSB.service;

import com.ejercicio.ejercicioSB.model.Person;

import java.util.List;

public interface IPersonService {
    //GET /Personas
    public List<Person> readAll();

    //GET /personas/:id
    public Person readById(Integer id);

    //POST
    public Person create(Person person);

}
