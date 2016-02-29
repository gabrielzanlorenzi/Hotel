package com.project.hotel.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/*
 * Classe pessoa que representa uma tabela no banco de dados
 * @author Gabriel Zanlorenzi
 * @since Classe criada em 25/02/2016
 */

@SuppressWarnings("serial")
@Entity
public class Pessoa extends GenericDomain {
	
	@Column(length = 100, nullable = false)
	private String nome;
	
	@Column(length = 11, nullable = false)
	private String cpf;
	
	@Column(length = 10)
	private String rg;
	
	@Column(name = "orgao_emissor", length = 5)
	private String orgaoEmissor;
	
	@Column(length = 50)
	private String email;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
