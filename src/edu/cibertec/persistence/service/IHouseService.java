package edu.cibertec.persistence.service;

import java.util.List;

import edu.cibertec.entity.House;

public interface IHouseService {
	public House getHouse(Integer id) throws Exception;
	public List<House> getHouses()	throws Exception;
	public void registrar(House House) throws Exception;
	public void	actualizar(House House) throws Exception;

	public void eliminar(Integer id) throws Exception;
}
