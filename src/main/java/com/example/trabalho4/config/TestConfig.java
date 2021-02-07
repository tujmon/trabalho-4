package com.example.trabalho4.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.trabalho4.entities.Dependente;
import com.example.trabalho4.entities.Empregado;
import com.example.trabalho4.repositories.DependenteRepository;
import com.example.trabalho4.repositories.EmpregadoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private EmpregadoRepository empregadoRepository;
	@Autowired
	private DependenteRepository DependenteRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Empregado E1 = new Empregado((long)1,05771.12, "Arthur", 14, 15000);
		Empregado E2 = new Empregado((long)2,05771.00, "Pedro", 19, 10000);
		
		Dependente o1 = new Dependente(13,05771.00,"lucia","filha", Instant.parse("2010-06-20T19:53:07Z"));
		Dependente o2 = new Dependente(15,05771.00,"Maria","Esposa", Instant.parse("2015-06-21T19:53:07Z"));
		Dependente o3 = new Dependente(12,05771.00,"lucas","filho", Instant.parse("2020-06-22T19:53:07Z"));
		empregadoRepository.saveAll(Arrays.asList(E1,E2));
		DependenteRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
}
