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

    @Override
    public Departamento create(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public Departamento update(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public String delete(Departamento departamento) {
        departamentoRepository.delete(departamento);
        return "Departamento" + departamento.getId() + " borrado exitosamente";
    }

    @Override
    public String deleteById(Integer id) {
        Optional<Departamento> departamentoOptional = departamentoRepository.findById(id);
        if (departamentoOptional.isPresent()){
            Departamento departamento= departamentoOptional.get();
            departamento.setIsActive(false);
            departamentoRepository.save(departamento);
            return "Departamento borrado exitosamente";
        } else {
            return "El id que ingresaste no existe";
        }

    }

    @Override
    public List<Departamento> findByPrecio(Double precio) {
        return departamentoRepository.findByPrecio(precio);
    }

    @Override
    public List<Departamento> findByPrecioLessThan(Double precio) {
        return departamentoRepository.findByPrecioLessThan(precio);
    }

    @Override
    public List<Departamento> findByPrecioAndM2(Double precio, Double m2) {
        return departamentoRepository.precioAndM2(precio, m2);
    }


}
