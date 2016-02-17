package com.project.hotel.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/*
 * Classe Genérica do código que servirá para as outras classes domain
 * @author Gabriel Zanlorenzi
 * @since Classe criada em 16/02/2016
 */

@SuppressWarnings("serial")
@MappedSuperclass
public class GenericDomain implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	
	public Long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
}
