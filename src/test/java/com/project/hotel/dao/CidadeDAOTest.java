package com.project.hotel.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.project.hotel.domain.Cidade;
import com.project.hotel.domain.Estado;

/*
 * Classe CidadeDAOteste a fim de realizar testes de CRUD no banco de dados
 * @author Gabriel Zanlorenzi
 * @since Classe criada em 16/02/2016
 */

public class CidadeDAOTest {

	@Test
	@Ignore
	public void salvar() {
		EstadoDAO estadoDAO = new EstadoDAO();

		Estado estado = estadoDAO.buscar(1L);

		Cidade cidade = new Cidade();
		cidade.setNome("Belo Horizonte");
		cidade.setEstado(estado);

		CidadeDAO cidadeDAO = new CidadeDAO();
		cidadeDAO.salvar(cidade);
	}

	@Test
	@Ignore
	public void editar() {
		Long codigoCidade = 12L;
		Long codigoEstado = 3L;
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		EstadoDAO estadoDAO = new EstadoDAO();
		
		Cidade cidade = cidadeDAO.buscar(codigoCidade);
		Estado estado = estadoDAO.buscar(codigoEstado);

		if (cidade == null) {
			System.out.println("Nenhum registro encontrado para alterar!");
		} else {
			System.out.println("Registro a ser alterado:");
			System.out.println(cidade.getCodigo() + " - " + cidade.getNome());

			cidade.setNome("Cidade Editar");
			cidade.setEstado(estado);

			cidadeDAO.editar(cidade);

			System.out.println("Registro a alterado para:");
			System.out.println(cidade.getCodigo() + " - " + cidade.getNome());
		}
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 5L;
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);

		if (cidade == null) {
			System.out.println("Nenhum registro encontrado para remover!");
		} else {
			cidadeDAO.excluir(cidade);
			System.out.println("Cidade removida:");
			System.out.println(cidade.getCodigo() + " - " + cidade.getNome());
		}
	}

	@Test
	@Ignore
	public void listar() {
		CidadeDAO cidadeDAO = new CidadeDAO();
		List<Cidade> resultado = cidadeDAO.listar();

		for (Cidade cidade : resultado) {
			System.out.println("Código da Cidade: " + cidade.getCodigo());
			System.out.println("Nome da Cidade: " + cidade.getNome());
			System.out.println("Código do Estado: " + cidade.getEstado().getCodigo());
			System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
			System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
			System.out.println();
		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 5L;

		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);

		if (cidade == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Código da Cidade: " + cidade.getCodigo());
			System.out.println("Nome da Cidade: " + cidade.getNome());
			System.out.println("Código do Estado: " + cidade.getEstado().getCodigo());
			System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
			System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
		}
	}

}
