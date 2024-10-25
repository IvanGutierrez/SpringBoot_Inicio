package com.ejercicio.ejercicioSB.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "departamento")
@Table
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "m2")
    private Double m2;

    @Column(name = "precio")
    private Double precio;
    @Column(name = "is_active")
    private Boolean isActive;

}
