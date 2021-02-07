package com.example.trabalho4.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.trabalho4.entities.Empregado;

@RestController
@RequestMapping(value = "/Empregados")
public class EmpregadoResource {
	
	@GetMapping
	public ResponseEntity<Empregado> findAll() {
		Empregado u = new Empregado(9351232.00, "Maria",1921123, 1000.10);
		return ResponseEntity.ok().body(u);
	}
}
