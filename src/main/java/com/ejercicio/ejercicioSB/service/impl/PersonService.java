package com.ejercicio.ejercicioSB.service.impl;

import com.ejercicio.ejercicioSB.feign.PersonClient;
import com.ejercicio.ejercicioSB.model.Person;
import com.ejercicio.ejercicioSB.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService implements IPersonService {

    @Autowired
    PersonClient personClient;
    @Override
    public List<Person> readAll() {
        return personClient.getData();
    }

    @Override
    public Person readById(Integer id) {
//        Optional<Person> personOptional = personClient.getPersonById(id);
        return personClient.getPersonById(id);
    }
}
