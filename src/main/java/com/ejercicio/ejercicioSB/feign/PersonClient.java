package com.ejercicio.ejercicioSB.feign;

import com.ejercicio.ejercicioSB.model.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "Personas", url = "https://672925a66d5fa4901b6c4f60.mockapi.io/api/v3/")
public interface PersonClient {

    @GetMapping("/personas")
    List<Person> getData();

//    @GetMapping("/api/products/{id}")
//    Product getProductById(@PathVariable("id") Long id);

    @GetMapping("/personas/{id}")
    Person getPersonById(@PathVariable("id") Integer id);

    @PostMapping("/personas")
    Person createPerson(@RequestBody Person person);

    @PutMapping("/personas/{id}")
    Person updatePerson(@PathVariable("id") Integer id, @RequestBody Person person);
}
