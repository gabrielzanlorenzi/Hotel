package com.project.hotel.util;

import org.hibernate.Session;
import org.junit.Test;

/*
 * Classe de teste de conexão com o banco. Será responsável pela criação e alteração das tebelas no banco
 * @author Gabriel Zanlorenzi
 * @since Classe criada em 16/02/2016
 */

public class HibernateUtilTest {
	@Test
	public void conectar() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}
}
