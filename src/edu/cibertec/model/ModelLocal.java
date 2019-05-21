package edu.cibertec.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import edu.cibertec.dto.LocalDTO;

public class ModelLocal {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("PF");
	
	public List<LocalDTO> listarLocal(){
		EntityManager manager = factory.createEntityManager();
		List<LocalDTO> listadoLocal= new ArrayList<>();
		TypedQuery<LocalDTO> resultado=null;
		try {
			String hql="select l from LocalDTO l";
			resultado = manager.createQuery(hql,LocalDTO.class);
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
	public List<LocalDTO> listarLocalXCoor(String latd, String longt){
		EntityManager manager = factory.createEntityManager();
		List<LocalDTO> listadoLocal= new ArrayList<>();
		TypedQuery<LocalDTO> resultado=null;
		double latitud = Double.parseDouble(latd);
		double longitud = Double.parseDouble(longt);
		try {
			String hql="select z from LocalDTO z where z.latitude = ?1 and z.longitude = ?2";
			resultado = manager.createQuery(hql,LocalDTO.class);
			//resultado.setParameter(1, param);
			
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
