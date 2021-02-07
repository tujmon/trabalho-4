package com.example.trabalho4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trabalho4.entities.Empregado;

public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {

}