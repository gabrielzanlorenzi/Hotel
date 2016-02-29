package com.project.hotel.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.project.hotel.domain.Cidade;
import com.project.hotel.domain.Endereco;

/*
 * Classe EnderecoDAOTest a fim de realizar testes de CRUD no banco de dados
 * @author Gabriel Zanlorenzi
 * @since Classe criada em 25/02/2016
 */

public class EnderecoDAOTest {

	@Test
	@Ignore
	public void salvar() {
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(1L);

		Endereco endereco = new Endereco();
		endereco.setRua("Rua teste");
		endereco.setNumero(90);
		endereco.setBairro("Bairro teste");
		endereco.setCep("19900-220");
		endereco.setComplemento("Complemento teste");
		endereco.setCidade(cidade);

		EnderecoDAO enderecoDAO = new EnderecoDAO();
		enderecoDAO.salvar(endereco);
		System.out.println("Endereço salvo!");
	}

	@Test
	@Ignore
	public void listar() {
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		List<Endereco> resultado = enderecoDAO.listar();

		for (Endereco endereco : resultado) {
			System.out.println("Código do Endereço: " + endereco.getCodigo());
			System.out.println("Rua: " + endereco.getRua());
			System.out.println("Número: " + endereco.getNumero());
			System.out.println("Bairro: " + endereco.getBairro());
			System.out.println("CEP: " + endereco.getBairro());
			System.out.println("Cidade: " + endereco.getCidade().getNome());
			System.out.println("Estado: " + endereco.getCidade().getEstado().getNome());
			System.out.println();
		}
	}

	@Test
	@Ignore
	public void editar() {
		Long codigoEndereco = 2L;
		Long codigoCidade = 3L;
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		CidadeDAO cidadeDAO = new CidadeDAO();
		Endereco endereco = enderecoDAO.buscar(codigoEndereco);
		Cidade cidade = cidadeDAO.buscar(codigoCidade);

		if (endereco == null) {
			System.out.println("Nenhum registro encontrado para alterar!");
		} else {
			System.out.println("Registro a ser alterado:");
			System.out.println(endereco.getCodigo() + " - " + endereco.getRua());

			endereco.setRua("Rua Editar");
			endereco.setNumero(1000);
			endereco.setBairro("Bairro Editar");
			endereco.setCep("19910-111");
			endereco.setComplemento("Complemento Editar");
			endereco.setCidade(cidade);

			enderecoDAO.editar(endereco);

			System.out.println("Registro a alterado para:");
			System.out.println(endereco.getCodigo() + " - " + endereco.getRua());
		}
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 2L;
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = enderecoDAO.buscar(codigo);

		if (endereco == null) {
			System.out.println("Nenhum registro encontrado para remover!");
		} else {
			enderecoDAO.excluir(endereco);
			System.out.println("Endereço removido:");
			System.out.println(endereco.getCodigo() + " - " + endereco.getRua());
		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;

		EnderecoDAO enderecoDAO = new EnderecoDAO();
		Endereco endereco = enderecoDAO.buscar(codigo);

		if (endereco == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Código do Endereço: " + endereco.getCodigo());
			System.out.println("Rua: " + endereco.getRua());
			System.out.println("Número: " + endereco.getNumero());
			System.out.println("Bairro: " + endereco.getBairro());
			System.out.println("CEP: " + endereco.getBairro());
			System.out.println("Cidade: " + endereco.getCidade().getNome());
			System.out.println("Estado: " + endereco.getCidade().getEstado().getNome());
		}
	}

}
