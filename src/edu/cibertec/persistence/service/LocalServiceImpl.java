package edu.cibertec.persistence.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import edu.cibertec.entity.Local;
import edu.cibertec.persistence.jpa.dao.LocalJPA;

public class LocalServiceImpl implements ILocalService{

	static final Logger log = Logger.getLogger(AccountServiceImpl.class);
	LocalJPA locDAO = new LocalJPA();

	@Override
	public Local getLocal(Integer id) throws Exception {
		
		log.info("Se ingreso a getLocal()");
		Local loc = null;

		locDAO.createEM();
		loc = locDAO.get(id);
		locDAO.releaseEM();

		log.info("Saliendo de getLocal()");
		
		return loc;
	}

	@Override
	public List<Local> getLocals() throws Exception {
		log.info("Se ingreso a getLocals()");

		List<Local>locals= null;

		locDAO.createEM();
		locals= locDAO.getAll();
		locDAO.releaseEM();

		log.info("Saliendo de getLocals()");

		return locals;
	}

	@Override
	public List<Local> getLocalxDir(String dir) throws Exception {
		
		log.info("Se ingreso a getLocalxDir()");
		List<Local>localReslt= new ArrayList<Local>();
		locDAO.createEM();
		localReslt = locDAO.getXDir(dir);
		
		log.info("Saliendo de getLocalxDir()");
		return localReslt;
	}

	@Override
	public void registrar(Local local) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Local local) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer id) throws Exception {
		// TODO Auto-generated method stub

	}



}
