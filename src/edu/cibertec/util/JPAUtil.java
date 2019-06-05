package edu.cibertec.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory emf;
	
	static{
		
		try{
			emf=Persistence.createEntityManagerFactory("PF");
			System.out.println("Se cargo la Persistencia");
		} catch(Throwable e){
			e.printStackTrace();
			throw new ExceptionInInitializerError();
			
		}
	}

	public static EntityManagerFactory getEmf() {
		return emf;
	}
	
	public static void main(String[] args) {
		
		
		
	}
}
