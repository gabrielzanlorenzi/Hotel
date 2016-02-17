package com.project.hotel.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/*
 * Classe cidade que representa uma tabela no banco de dados
 * @author Gabriel Zanlorenzi
 * @since Classe criada em 16/02/2016
 */

@SuppressWarnings("serial")
@Entity
public class Cidade extends GenericDomain {
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Estado estado;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
