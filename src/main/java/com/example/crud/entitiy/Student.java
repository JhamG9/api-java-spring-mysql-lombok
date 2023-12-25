package com.example.crud.entitiy;

import jakarta.persistence.*;
import lombok.Data;

@Data // para hacer los get y set de las propiedades
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private String lastName;

    @Column(name = "email_addres", unique = true, nullable = false) // Agregar configuracion a los campos
    private String email;
}
