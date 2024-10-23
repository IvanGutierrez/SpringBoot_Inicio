package com.ejercicio.ejercicioSB.service.impl;

import com.ejercicio.ejercicioSB.entity.Departamento;
import com.ejercicio.ejercicioSB.repository.DepartamentoRepository;
import com.ejercicio.ejercicioSB.service.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService implements IDepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;
    @Override
    public List<Departamento> readAll() {
        return departamentoRepository.findAll();
    }

    @Override
    public Departamento readById(Integer id) {
        Optional<Departamento> departamentoOptional = departamentoRepository.findById(id);
        if (departamentoOptional.isPresent()){
            return departamentoOptional.get();
        } else {
            return  new Departamento();
        }

    }
}
