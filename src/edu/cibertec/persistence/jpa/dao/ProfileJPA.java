package edu.cibertec.persistence.jpa.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import edu.cibertec.entity.Profile;

public class ProfileJPA extends GenericoJPA{
	private static final long serialVersionUID = 1L;

	public Profile get(Integer id) throws Exception{
		return em.find(Profile.class, id);
	}
	public List<Profile> getAll() throws Exception {
		TypedQuery<Profile> query = em.createQuery("FROM Profile",Profile.class);
		return query.getResultList();
	}
	public void registrar(Profile profileJPA) throws Exception{
		em.persist(profileJPA);
	}
	public void actualizar(Profile profileJPA) throws Exception{
		em.merge(profileJPA);
	}
	public void eliminar(Integer id) throws Exception {
		Profile profileEliminar = (Profile) em.getReference(Profile.class, id);
		em.remove(profileEliminar);
	}
}
