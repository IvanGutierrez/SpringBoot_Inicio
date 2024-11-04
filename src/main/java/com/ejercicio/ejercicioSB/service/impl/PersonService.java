package com.ejercicio.ejercicioSB.service.impl;

import com.ejercicio.ejercicioSB.feign.PersonClient;
import com.ejercicio.ejercicioSB.model.Person;
import com.ejercicio.ejercicioSB.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService {

    @Autowired
    PersonClient personClient;
    @Override
    public List<Person> readAll() {
        return personClient.getData();
    }
}
