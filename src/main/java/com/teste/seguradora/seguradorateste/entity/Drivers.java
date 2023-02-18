package com.teste.seguradora.seguradorateste.entity;

import java.util.Date;

import org.springframework.aot.generate.GeneratedTypeReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Drivers {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long document;

    private Date birthdate;
}
