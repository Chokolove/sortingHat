package edu.cibertec.persistence.service;

import java.util.List;

import edu.cibertec.entity.Profile;

public interface IProfileService {
	
	public Profile getProfile(Integer id) throws Exception;
	public List<Profile> getProfiles()	throws Exception;
	public void registrar(Profile profile) throws Exception;
	public void	actualizar(Profile profile) throws Exception;

	public void eliminar(Integer id) throws Exception;
}
