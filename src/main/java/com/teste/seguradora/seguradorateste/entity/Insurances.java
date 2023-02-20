package com.teste.seguradora.seguradorateste.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.CascadeType;
import lombok.Data;

@Data
@Entity
public class Insurances {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "creation_dt")
    private Timestamp dtCreate;
    
    @Column(name = "updated_at")
    private Timestamp dtUpdate;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cars cars;  
    
    @Column(name = "is_active")
    private boolean isActive;
}
