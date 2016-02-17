package com.project.hotel.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.project.hotel.domain.Estado;

/*
 * Classe EstadoDAOtest a fim de realizar testes de CRUD no banco de dados
 * @author Gabriel Zanlorenzi
 * @since Classe criada em 16/02/2016
 */

public class EstadoDAOTest {
	
	@Test
	@Ignore
	public void salvar() {
		Estado estado = new Estado();
		estado.setNome("Paraná");
		estado.setSigla("PR");

		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);
	}

	@Test
	@Ignore
	public void listar() {
		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> resultado = estadoDAO.listar();

		System.out.println("Total de Registros Encontrados: " + resultado.size());

		for (Estado estado : resultado) {
			System.out.println(estado.getCodigo() + " - " + estado.getSigla() + " - " + estado.getNome());
		}
	}
}
