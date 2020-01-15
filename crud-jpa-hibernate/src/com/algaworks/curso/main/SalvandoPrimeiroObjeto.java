package com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.curso.modelo.Cliente;

public class SalvandoPrimeiroObjeto {

	public static void main(String[] args) {
		
		// pegar as configurações de conexão
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		// fazer uma instância da conexão
		EntityManager em = emf.createEntityManager();
		
		// criar um objeto
		Cliente cliente = new Cliente();
		cliente.setNome("Maria Rita");
		cliente.setIdade(20);
		cliente.setProfissao("Médica");
		cliente.setSexo("F");
		
		// iniciar conexão
		em.getTransaction().begin();
		// inserir o objeto criado no banco de dados
		em.persist(cliente);
		// comitar
		em.getTransaction().commit();
		
		System.out.println("Cliente salvo com sucesso");
		
	}

}
