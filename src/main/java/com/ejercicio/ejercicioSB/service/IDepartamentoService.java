package com.ejercicio.ejercicioSB.service;

import com.ejercicio.ejercicioSB.entity.Departamento;

import java.util.List;

public interface IDepartamentoService {
    public List<Departamento> readAll();
    public Departamento readById(Integer id);
    public Departamento create(Departamento departamento);

}
