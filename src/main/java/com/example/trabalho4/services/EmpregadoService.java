package com.example.trabalho4.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trabalho4.entities.Empregado;
import com.example.trabalho4.repositories.EmpregadoRepository;

@Service
public class EmpregadoService {
	
	@Autowired
	private EmpregadoRepository repository;
	
	public List<Empregado> findAll() {
		return repository.findAll();
	}
	
	public Empregado findById(Long id){
		Optional<Empregado> obj = repository.findById(id);
		return obj.get();
	}
}
