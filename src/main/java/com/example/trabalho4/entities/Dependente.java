package com.example.trabalho4.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dependente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Id
	private Long id;
	public Double cpfEmpregado;
	public String nome;
	public String grauParentesco;
	public Instant dataNascimento;
	public Dependente(long id, Double cpfEmpregado, String nome, String grauParentesco, Instant dataNascimento) {
		super();
		this.id = id;
		this.cpfEmpregado = cpfEmpregado;
		this.nome = nome;
		this.grauParentesco = grauParentesco;
		this.dataNascimento = dataNascimento;
	}

	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}
	public Double getCpfEmpregado() {
		return cpfEmpregado;
	}
	public void setCpfEmpregado(Double cpfEmpregado) {
		this.cpfEmpregado = cpfEmpregado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGrauParentesco() {
		return grauParentesco;
	}
	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}
	public Instant getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Instant dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((cpfEmpregado == null) ? 0 : cpfEmpregado.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((grauParentesco == null) ? 0 : grauParentesco.hashCode());
		
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dependente other = (Dependente) obj;
		if (cpfEmpregado == null) {
			if (other.cpfEmpregado != null)
				return false;
		} else if (!cpfEmpregado.equals(other.cpfEmpregado))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (grauParentesco == null) {
			if (other.grauParentesco != null)
				return false;
		} else if (!grauParentesco.equals(other.grauParentesco))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	
}
