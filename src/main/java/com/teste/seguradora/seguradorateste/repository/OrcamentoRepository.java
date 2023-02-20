package com.teste.seguradora.seguradorateste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.seguradora.seguradorateste.entity.Insurances;

@Repository
public interface OrcamentoRepository extends JpaRepository<Insurances, Long> {
    
}
