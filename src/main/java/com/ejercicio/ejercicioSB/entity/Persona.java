package com.ejercicio.ejercicioSB.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "persona")
@Table
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    private String nombre;
    private String direccion;
    private Integer edad;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_departamento")
    private Departamento departamento;
}
