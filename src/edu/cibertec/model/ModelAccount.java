package edu.cibertec.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.cibertec.dto.AccountDTO;

public class ModelAccount {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("PF");
	
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
