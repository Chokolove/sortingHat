package edu.cibertec.persistence.service;

import java.util.List;

import org.apache.log4j.Logger;

import edu.cibertec.entity.House;
import edu.cibertec.persistence.jpa.dao.HouseJPA;

public class HouseServiceImpl implements IHouseService{

	static final Logger log = Logger.getLogger(HouseServiceImpl.class);
	HouseJPA houseJPA = new HouseJPA();
	
	@Override
	public House getHouse(Integer id) throws Exception {
		log.info("Se ingreso a getHouse()");
		House hou = null;

		houseJPA.createEM();
		hou = houseJPA.get(id);
		houseJPA.releaseEM();

		log.info("Saliendo de getHouse()");
		
		return hou;
	}

	@Override
	public List<House> getHouses() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registrar(House House) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(House House) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
