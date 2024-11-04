package com.ejercicio.ejercicioSB.controller;

import com.ejercicio.ejercicioSB.entity.Persona;
import com.ejercicio.ejercicioSB.model.PersonaResponse;
import com.ejercicio.ejercicioSB.service.impl.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v3/")
public class PersonaController {
    @Autowired
    PersonaService personaService;
    @GetMapping("/persona")
    public List<Persona> readAll(){
        return personaService.readAll();
    }

    @GetMapping("/persona/{id}")
    public Persona readById(@PathVariable Integer id){
        return personaService.readById(id);
    }

    @PostMapping("/persona")
    public Persona create(@RequestBody Persona persona){
        return personaService.create(persona);
    }

    @PutMapping("/persona")
    public Persona update(@RequestBody Persona persona){
        return personaService.update(persona);
    }

    @DeleteMapping("/personaDelete")
    public String delete(@RequestBody Persona persona){
        return personaService.delete(persona);
//        return "Persona " + persona.getNombre() + " eliminada";
    }

    @DeleteMapping("/persona")
    public String deleteById(@RequestParam Integer id) {
        return personaService.deleteById(id);
    }

    @GetMapping("/personasResponse")
    public List<PersonaResponse> readAllResponse(){
        return personaService.readAllResponse();
    }
}
