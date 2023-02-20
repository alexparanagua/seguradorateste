package com.teste.seguradora.seguradorateste.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Data
@Entity
public class Cars {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "model_car")
    private String model;

    private String manufacturer;

    @Column(name = "year_car")
    private int year;

    @Column(name = "fipe_value")
    private BigDecimal valueFipe;

    @EqualsAndHashCode.Exclude
    @JsonManagedReference
    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private Set<CarDrivers> cardrivers;

    @EqualsAndHashCode.Exclude
    @JsonManagedReference
    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private Set<Claims> claims;
}
