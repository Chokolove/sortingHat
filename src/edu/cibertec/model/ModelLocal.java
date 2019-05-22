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

public class ModelLocal {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("PF");
	
	
	public List<LocalDTO> listarLocal(){
		EntityManager manager = factory.createEntityManager();
		List<LocalDTO> listadoLocal= new ArrayList<>();
		TypedQuery<LocalDTO> resultado=null;
		try {
			String hql="select distinct l from LocalDTO l";
			resultado = manager.createQuery(hql,LocalDTO.class);
			listadoLocal= resultado.getResultList();
			Hibernate.initialize(resultado);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			manager.close();
			factory.close();
		}
		return listadoLocal;
	}
	
	public List<AccountDTO> listaAccount(){
		EntityManager manager = factory.createEntityManager();
		List<AccountDTO> listadoAccount= new ArrayList<>();
		TypedQuery<AccountDTO> resultado=null;
		try {
			String hql="select l from AccountDTO l";
			resultado = manager.createQuery(hql,AccountDTO.class);
			listadoAccount= resultado.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			manager.close();
			factory.close();
		}
		return listadoAccount;
	}
	
	public List<LocalDTO> listarLocalXDir(String dir){
		EntityManager manager = factory.createEntityManager();
		List<LocalDTO> listadoLocal= new ArrayList<>();
		TypedQuery<LocalDTO> resultado=null;
		String param = "%"+dir+"%";
		try {
			String hql="select z from LocalDTO z where z.address like ?1";
			resultado = manager.createQuery(hql,LocalDTO.class);
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
	
	public void insertarAccount(AccountDTO acc) {
		
		EntityManager manager = factory.createEntityManager();
		try {
			manager.getTransaction().begin();
			manager.persist(acc);
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
