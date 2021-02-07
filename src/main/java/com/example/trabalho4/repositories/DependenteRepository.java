package com.example.trabalho4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.trabalho4.entities.Dependente;

@Repository
public interface DependenteRepository extends JpaRepository<Dependente, Long> {

}