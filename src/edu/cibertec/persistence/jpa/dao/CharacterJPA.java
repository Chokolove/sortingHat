package edu.cibertec.persistence.jpa.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import edu.cibertec.entity.Character;

public class CharacterJPA extends GenericoJPA{

	private static final long serialVersionUID = 1L;

	public Character get(Integer id) throws Exception{

		return em.find(Character.class, id);
	}
	public List<Character> getAll() throws Exception {
		TypedQuery<Character> query = em.createQuery("FROM Character",Character.class);
		return query.getResultList();
	}
	public void registrar(Character CharacterJPA) throws Exception{
		em.persist(CharacterJPA);
	}
	public void actualizar(Character CharacterJPA) throws Exception{
		em.merge(CharacterJPA);
	}
	public void eliminar(Integer id) throws Exception {
		Character CharacterEliminar = (Character) em.getReference(Character.class, id);
		em.remove(CharacterEliminar);
	}

}
