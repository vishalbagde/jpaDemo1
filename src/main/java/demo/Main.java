package demo;
import model.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.PersonName;

public class Main {
	public static void main(String src[]) {

	/*
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
	
	PersonName pn =new PersonName();
	pn.setFname("vishal");
	pn.setMname("govind");
	pn.setLname("bagde");
	
	em.persist(pn);
	em.getTransaction().commit();
	em.close();
	System.out.println(pn);
	*/
		
	EntityManagerFactory creEmp=Persistence.createEntityManagerFactory("pu");	
	EntityManager em=creEmp.createEntityManager();
	em.getTransaction().begin();
	PersonName pn=new PersonName();
	pn.setFname("vishal");
	pn.setMname("govind");
	pn.setLname("bagde");
	
			
		em.persist(pn);
		em.getTransaction().commit();
		em.close();
		creEmp.close();
		

	}
}
