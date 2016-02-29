package com.project.hotel.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.project.hotel.domain.Endereco;
import com.project.hotel.domain.Pessoa;

/*
 * Classe PessoaDAOteste a fim de realizar testes de CRUD no banco de dados
 * @author Gabriel Zanlorenzi
 * @since Classe criada em 25/02/2016
 */

public class PessoaDAOTest {

	@Test
	@Ignore
	public void salvar() {
		EnderecoDAO enderecoDAO = new EnderecoDAO();

		Endereco endereco = enderecoDAO.buscar(1L);

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Gabriel Zanlorenzi");
		pessoa.setCpf("12345678900");
		pessoa.setRg("1234567890");
		pessoa.setOrgaoEmissor("EEPR");
		pessoa.setEmail("gabriel.zanlorenzi1@gmail.com");
		pessoa.setEndereco(endereco);
		
		System.out.println("Pessoa foi salva");

		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvar(pessoa);
	}

	@Test
	@Ignore
	public void editar() {
		Long codigoPessoa = 2L;
		Long codigoEndereco = 3L;
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);
		Endereco endereco = enderecoDAO.buscar(codigoEndereco);

		if (pessoa == null) {
			System.out.println("Nenhum registro encontrado para alterar!");
		} else {
			System.out.println("Registro a ser alterado:");
			System.out.println(pessoa.getCodigo() + " - " + pessoa.getNome());

			pessoa.setNome("Nome alterar");
			pessoa.setCpf("98989898989");
			pessoa.setRg("6767676767");
			pessoa.setOrgaoEmissor("AAAA");
			pessoa.setEmail("teste.editar@email.com");
			pessoa.setEndereco(endereco);

			pessoaDAO.editar(pessoa);

			System.out.println("Registro a alterado para:");
			System.out.println(pessoa.getCodigo() + " - " + pessoa.getNome());
		}
	}

	@Test
	//@Ignore
	public void excluir() {
		Long codigo = 2L;
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);

		if (pessoa == null) {
			System.out.println("Nenhum registro encontrado para remover!");
		} else {
			pessoaDAO.excluir(pessoa);
			System.out.println("Pessoa Removida:");
			System.out.println(pessoa.getCodigo() + " - " + pessoa.getNome());
		}
	}

	@Test
	@Ignore
	public void listar() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		List<Pessoa> resultado = pessoaDAO.listar();

		for (Pessoa pessoa : resultado) {
			System.out.println("Código da Pessoa: " + pessoa.getCodigo());
			System.out.println("Nome da Pessoa: " + pessoa.getNome());
			System.out.println("CPF: " + pessoa.getCpf());
			System.out.println("RG: " + pessoa.getRg());
			System.out.println("Orgão Emissor: " + pessoa.getOrgaoEmissor());
			System.out.println("Email: " + pessoa.getEmail());
			System.out.println("Endereço da Pessoa: " + pessoa.getEndereco().getRua());
			System.out.println("Cidade da Pessoa: " + pessoa.getEndereco().getCidade().getNome());
			System.out.println("Estado da Pessoa: " + pessoa.getEndereco().getCidade().getEstado().getNome());
			System.out.println();
		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);

		if (pessoa == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Código da Pessoa: " + pessoa.getCodigo());
			System.out.println("Nome da Pessoa: " + pessoa.getNome());
			System.out.println("CPF: " + pessoa.getCpf());
			System.out.println("RG: " + pessoa.getRg());
			System.out.println("Orgão Emissor: " + pessoa.getOrgaoEmissor());
			System.out.println("Email: " + pessoa.getEmail());
			System.out.println("Endereço da Pessoa: " + pessoa.getEndereco().getRua());
			System.out.println("Cidade da Pessoa: " + pessoa.getEndereco().getCidade().getNome());
			System.out.println("Estado da Pessoa: " + pessoa.getEndereco().getCidade().getEstado().getNome());
		}
	}

}
