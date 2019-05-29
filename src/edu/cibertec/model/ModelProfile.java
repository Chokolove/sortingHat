package edu.cibertec.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.cibertec.dto.AccountDTO;
import edu.cibertec.dto.ProfileDTO;
import edu.cibertec.jpa.ProfileJPA;

public class ModelProfile {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("PF");


	public ProfileJPA profileIdAcc (int idAcc) {
		EntityManager manager = factory.createEntityManager();
		ProfileJPA profile = new ProfileJPA();
		TypedQuery<ProfileJPA> resultado=null;
		try {
			String hql="select z from ProfileJPA z where account.id = ?1";
			resultado = manager.createQuery(hql,ProfileJPA.class);
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
	public void insertarProfile(ProfileJPA prof) {

		EntityManager manager = factory.createEntityManager();
		try {
			manager.getTransaction().begin();
			manager.persist(prof);
			manager.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			manager.getTransaction().rollback();
			System.out.println(e.getMessage());
		}finally{
			manager.close();
			factory.close();
		}
	}
}
