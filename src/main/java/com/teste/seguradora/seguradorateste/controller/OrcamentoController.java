package com.teste.seguradora.seguradorateste.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.seguradora.seguradorateste.entity.Insurances;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/insurance")
public class OrcamentoController {
    

    @PostMapping
    public void budget(@RequestBody Insurances insurance) {
       
    }

    @GetMapping(value = "/budget/{id}")
    public List<Insurances> getBudget(@PathVariable Long id) {
        return new ArrayList<>();
    }

    @PutMapping(value="/budget/{id}")
    public Insurances putBudget(@PathVariable String id, @RequestBody Insurances entity) {
               
        return entity;
    }

    @DeleteMapping(value = "budget/{id}")
    public Insurances deleteBudget(@PathVariable String id) {
        return new Insurances();
    }
}
