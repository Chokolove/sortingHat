package edu.cibertec.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.cibertec.dto.ReviewDTO;

public class ModelReview {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("PF");
	public List<ReviewDTO> listarReviewXId(int id){
		EntityManager manager = factory.createEntityManager();
		List<ReviewDTO> listadoReview= new ArrayList<>();
		TypedQuery<ReviewDTO> resultado=null;
		try {
			String hql="select z from ReviewDTO z where local.id = ?1";
			resultado = manager.createQuery(hql,ReviewDTO.class);
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
