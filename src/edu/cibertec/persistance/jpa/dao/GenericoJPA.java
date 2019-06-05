package edu.cibertec.persistance.jpa.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import edu.cibertec.util.JPAUtil;

public abstract class GenericoJPA implements Serializable{
	private static final long serialVersionUID = 1L;
	protected EntityManager em;
	
	public void createEM() {
		System.out.println("Se captura el entityManager");
		em = JPAUtil.getEmf().createEntityManager();
	}
	public void releaseEM() {
		em.close();
	}

	public void beginTransaction() {
		
		System.out.println("em.getTransaction().begin();");
		em.getTransaction().begin();
	}

	public void endTransaction() {
		em.getTransaction().commit();
		releaseEM();
	}
	
	public void rollbackTransaction() {
		em.getTransaction().rollback();
		releaseEM();
	}
	
	public void flush() {
		em.flush();
	}
	
	public void setEM(EntityManager em){
		this.em=em;
	}
	public EntityManager getEM(){
		return em;
	}
}
