package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Pessoa p1 = new Pessoa(null, "wagner","wagnerricardonet@gmail.com");
		Pessoa p2 = new Pessoa(null, "Ricardo","rwagnerricardonet@gmail.com");
		Pessoa p3 = new Pessoa(null, "wagne 2r","wwagnerricardonet@gmail.com");*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		// REMOVENDO PESSOA
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		/*
		 BUSCA
		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);*/
		
		/*
		  GRAVA DADOS
		em.getTransaction().begin();		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();*/
		
		System.out.println("Pronto");
		em.close();
		emf.close();
		
		/*System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);*/

	}

}
