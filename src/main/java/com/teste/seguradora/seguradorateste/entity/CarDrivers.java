package com.teste.seguradora.seguradorateste.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.*;

@Data
@Entity
@Table(name = "car_drivers")
public class CarDrivers {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Cars car;

    @OneToMany
    private List<Drivers> drivers;

    @Column(name = "is_main_driver")
    private boolean isMainDriver;
}
