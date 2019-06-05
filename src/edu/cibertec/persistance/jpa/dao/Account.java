package edu.cibertec.persistance.jpa.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import edu.cibertec.jpa.AccountJPA;

public class Account extends GenericoJPA{

	private static final long serialVersionUID = 1L;
	
	public AccountJPA get(Integer id) throws Exception{
		return em.find(AccountJPA.class, id);
	}
	
	public List<AccountJPA> getAll() throws Exception {
		TypedQuery<AccountJPA> query = em.createQuery("FROM AccountJPA",AccountJPA.class);
		return query.getResultList();
	}
	public void registrar(AccountJPA accountJPA) throws Exception{
		em.persist(accountJPA);
	}
	public void actualizar(AccountJPA accountJPA) throws Exception{
		em.merge(accountJPA);
	}
	public void eliminar(Integer id) throws Exception {
		AccountJPA accountEliminar = (AccountJPA) em.getReference(AccountJPA.class, id);
		em.remove(accountEliminar);
	}
}
