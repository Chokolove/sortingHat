package edu.cibertec.persistence.service;

import java.util.List;

import org.apache.log4j.Logger;

import edu.cibertec.entity.Profile;
import edu.cibertec.persistance.jpa.dao.ProfileJPA;

public class ProfileServiceImpl implements IProfileService {
	
	static final Logger log = Logger.getLogger(ProfileServiceImpl.class);
	ProfileJPA profDAO = new ProfileJPA();
	
	@Override
	public Profile getProfile(Integer id) throws Exception {
		
		log.info("Se ingreso a getProfile()");
		
		Profile prof = null;
		profDAO.createEM();
		prof= profDAO.get(id);
		profDAO.releaseEM();
		
		log.info("Saliendo de getProfile()");
		return prof;
	}

	@Override
	public List<Profile> getProfiles() throws Exception {
		
		log.info("Se ingreso a getProfiles()");
		
		List<Profile>profs = null;
		profDAO.createEM();
		profs=profDAO.getAll();
		profDAO.releaseEM();
		
		log.info("Saliendo de getProfiles()");
		return profs;
	}

	@Override
	public void registrar(Profile profile) throws Exception {
		
		log.info("Se ingreso a registrar()");
		
		profDAO.createEM();
		profDAO.beginTransaction();
		profDAO.registrar(profile);
		profDAO.flush();
		profDAO.endTransaction();
		
		log.info("Saliendo de registrar()");
	}

	@Override
	public void actualizar(Profile profile) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
