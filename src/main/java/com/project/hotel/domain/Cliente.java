package com.project.hotel.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/*
 * Classe cliente que representa uma tabela no banco de dados
 * @author Gabriel Zanlorenzi
 * @since Classe criada em 25/02/2016
 */

@SuppressWarnings("serial")
@Entity
public class Cliente extends GenericDomain {
	
	@Column(name = "data_Cadastro", nullable = false)
	private Date dataCadastro;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	
}
