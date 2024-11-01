package com.ejercicio.ejercicioSB.model;

import com.ejercicio.ejercicioSB.entity.Departamento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaResponse {
    private Integer id;
    private String nombre;
    private Integer edad;
    private Departamento idDepartamento;
}
