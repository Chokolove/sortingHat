package edu.cibertec.persistance.jpa.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import edu.cibertec.entity.Account;


public class AccountJPA extends GenericoJPA{

	private static final long serialVersionUID = 1L;
	
	public Account get(Integer id) throws Exception{
		return em.find(Account.class, id);
	}
	
	public List<Account> getAll() throws Exception {
		TypedQuery<Account> query = em.createQuery("FROM Account",Account.class);
		return query.getResultList();
	}
	public void registrar(Account accountJPA) throws Exception{
		em.persist(accountJPA);
	}
	public void actualizar(Account accountJPA) throws Exception{
		em.merge(accountJPA);
	}
	public void eliminar(Integer id) throws Exception {
		Account accountEliminar = (Account) em.getReference(Account.class, id);
		em.remove(accountEliminar);
	}
}
