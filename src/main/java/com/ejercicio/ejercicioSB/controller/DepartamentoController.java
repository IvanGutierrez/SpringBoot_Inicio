package com.ejercicio.ejercicioSB.controller;

import com.ejercicio.ejercicioSB.entity.Departamento;
import com.ejercicio.ejercicioSB.service.impl.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/v3")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping("/departamento")
    public List<Departamento> readAll(){
        return departamentoService.readAll();
    }

    @GetMapping("/departamento/{id}")
    public Departamento readById(@PathVariable Integer id){
        return departamentoService.readById(id);
    }
}
