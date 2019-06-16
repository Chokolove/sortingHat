package edu.cibertec.persistence.jpa.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import edu.cibertec.entity.House;

public class HouseJPA  extends GenericoJPA{
	private static final long serialVersionUID = 1L;

	public House get(Integer id) throws Exception{

		return em.find(House.class, id);
	}
	public List<House> getAll() throws Exception {
		TypedQuery<House> query = em.createQuery("FROM House",House.class);
		return query.getResultList();
	}
	public void registrar(House HouseJPA) throws Exception{
		em.persist(HouseJPA);
	}
	public void actualizar(House HouseJPA) throws Exception{
		em.merge(HouseJPA);
	}
	public void eliminar(Integer id) throws Exception {
		House HouseEliminar = (House) em.getReference(House.class, id);
		em.remove(HouseEliminar);
	}

}
