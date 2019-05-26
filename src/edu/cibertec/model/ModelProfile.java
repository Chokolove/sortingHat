package edu.cibertec.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.cibertec.dto.ProfileDTO;

public class ModelProfile {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("PF");
	
	
	public ProfileDTO profileIdAcc (int idAcc) {
		EntityManager manager = factory.createEntityManager();
		ProfileDTO profile = new ProfileDTO();
		TypedQuery<ProfileDTO> resultado=null;
		try {
			String hql="select z from ProfileDTO z where account.id = ?1";
			resultado = manager.createQuery(hql,ProfileDTO.class);
			resultado.setParameter(1, idAcc);
			
			profile= resultado.getResultList().get(0);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			manager.close();
			factory.close();
		}
		return profile;
	}
}
