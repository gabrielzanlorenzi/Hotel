package com.project.hotel.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/*
 * Classe endereco que representa uma tabela no banco de dados
 * @author Gabriel Zanlorenzi
 * @since Classe criada em 25/02/2016
 */

@SuppressWarnings("serial")
@Entity
public class Endereco extends GenericDomain {
	
	@Column(length = 100, nullable = false)
	private String rua;
	
	@Column(length = 4, nullable = false)
	private Integer numero;
	
	@Column(length = 50, nullable = false)
	private String bairro;
	
	@Column(length = 9, nullable = false)
	private String cep;
	
	@Column(length = 50)
	private String complemento;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Cidade cidade;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
}
