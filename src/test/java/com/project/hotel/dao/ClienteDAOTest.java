package com.project.hotel.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.project.hotel.domain.Cliente;
import com.project.hotel.domain.Pessoa;

/*
 * Classe ClienteDAOteste a fim de realizar testes de CRUD no banco de dados
 * @author Gabriel Zanlorenzi
 * @since Classe criada em 25/02/2016
 */

public class ClienteDAOTest {

	@Test
	@Ignore
	public void salvar() {
		PessoaDAO pessoaDAO = new PessoaDAO();

		Pessoa pessoa = pessoaDAO.buscar(1L);

		Cliente cliente = new Cliente();
		cliente.setDataCadastro(new Date());
		cliente.setPessoa(pessoa);

		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(cliente);
	}

	@Test
	@Ignore
	public void editar() {
		Long codigoCiente = 2L;
		Long codigoPessoa = 3L;

		ClienteDAO clienteDAO = new ClienteDAO();
		PessoaDAO pessoaDAO = new PessoaDAO();

		Cliente cliente = clienteDAO.buscar(codigoCiente);
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);

		if (cliente == null) {
			System.out.println("Nenhum registro encontrado para alterar!");
		} else {
			System.out.println("Registro a ser alterado:");
			System.out.println(cliente.getCodigo() + " - " + cliente.getPessoa().getNome());

			cliente.setDataCadastro(new Date(2016, Calendar.FEBRUARY, 24, 01, 10, 00));
			cliente.setPessoa(pessoa);

			clienteDAO.editar(cliente);

			System.out.println("Registro a alterado para:");
			System.out.println(cliente.getCodigo() + " - " + cliente.getPessoa().getNome() + " - "
					+ cliente.getDataCadastro().toString());
		}
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 2L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);

		if (cliente == null) {
			System.out.println("Nenhum registro encontrado para remover!");
		} else {
			clienteDAO.excluir(cliente);
			System.out.println("Cliente removids:");
			System.out.println(cliente.getCodigo() + " - " + cliente.getPessoa().getNome() + " - "
					+ cliente.getDataCadastro().toString());
		}
	}

	@Test
	@Ignore
	public void listar() {
		ClienteDAO clienteDAO = new ClienteDAO();
		List<Cliente> resultado = clienteDAO.listar();

		for (Cliente cliente : resultado) {
			System.out.println("Código do Cliente: " + cliente.getCodigo());
			System.out.println("Nome da Cliente: " + cliente.getPessoa().getNome());
			System.out.println("Endereço do Cliente: " + cliente.getPessoa().getEndereco().getRua());
			System.out.println("Clidade do Cliente: " + cliente.getPessoa().getEndereco().getCidade().getNome());
			System.out.println("Estado do Cliente: " + cliente.getPessoa().getEndereco().getCidade().getEstado().getNome());
			System.out.println("Data da contratação: " + cliente.getDataCadastro());
			System.out.println();
		}
	}

	@Test
	//@Ignore
	public void buscar() {
		Long codigo = 1L;

		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);

		if (cliente == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Código do Cliente: " + cliente.getCodigo());
			System.out.println("Nome da Cliente: " + cliente.getPessoa().getNome());
			System.out.println("Endereço do Cliente: " + cliente.getPessoa().getEndereco().getRua());
			System.out.println("Clidade do Cliente: " + cliente.getPessoa().getEndereco().getCidade().getNome());
			System.out.println("Estado do Cliente: " + cliente.getPessoa().getEndereco().getCidade().getEstado().getNome());
			System.out.println("Data da contratação: " + cliente.getDataCadastro());
		}
	}

}
