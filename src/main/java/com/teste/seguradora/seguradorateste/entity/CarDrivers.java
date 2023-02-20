package com.teste.seguradora.seguradorateste.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import lombok.Data;

@Data()
@Entity
@Table(name = "car_drivers")
public class CarDrivers {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    private Cars car;

    @ManyToOne(cascade = CascadeType.ALL)
    private Drivers driver;

    @Column(name = "is_main_driver")
    private boolean isMainDriver;
}
