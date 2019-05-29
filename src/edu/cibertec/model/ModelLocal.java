package edu.cibertec.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.hibernate.Hibernate;

import edu.cibertec.dto.AccountDTO;
import edu.cibertec.dto.LocalDTO;
import edu.cibertec.jpa.LocalJPA;

public class ModelLocal {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("PF");
	
	
	public List<LocalJPA> listarLocal(){
		EntityManager manager = factory.createEntityManager();
		List<LocalJPA> listadoLocal= new ArrayList<>();
		TypedQuery<LocalJPA> resultado=null;
		try {
			String hql="select distinct l from LocalJPA l";
			resultado = manager.createQuery(hql,LocalJPA.class);
			listadoLocal= resultado.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			manager.close();
			factory.close();
		}
		return listadoLocal;
	}
	
	
	
	public List<LocalJPA> listarLocalXDir(String dir){
		EntityManager manager = factory.createEntityManager();
		List<LocalJPA> listadoLocal= new ArrayList<>();
		TypedQuery<LocalJPA> resultado=null;
		String param = "%"+dir+"%";
		try {
			String hql="select z from LocalJPA z where z.address like ?1";
			resultado = manager.createQuery(hql,LocalJPA.class);
			resultado.setParameter(1, param);
			
			listadoLocal= resultado.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			manager.close();
			factory.close();
		}
		return listadoLocal;
	}
	
	
}
