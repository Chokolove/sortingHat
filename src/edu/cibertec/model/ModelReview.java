package edu.cibertec.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.cibertec.dto.ReviewDTO;
import edu.cibertec.jpa.ReviewJPA;

public class ModelReview {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("PF");
	public List<ReviewJPA> listarReviewXId(int id){
		EntityManager manager = factory.createEntityManager();
		List<ReviewJPA> listadoReview= new ArrayList<>();
		TypedQuery<ReviewJPA> resultado=null;
		try {
			String hql="select z from ReviewJPA z where local.id = ?1";
			resultado = manager.createQuery(hql,ReviewJPA.class);
			resultado.setParameter(1, id);
			
			listadoReview= resultado.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			manager.close();
			factory.close();
		}
		return listadoReview;
	}
}
