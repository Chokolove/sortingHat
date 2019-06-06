package edu.cibertec.persistence.service;

import java.util.List;

import edu.cibertec.entity.Local;

public interface ILocalService {
	
	public Local getLocal(Integer id) throws Exception;
	public List<Local> getLocalxDir(String dir) throws Exception;
	public List<Local> getLocals()	throws Exception;
	public void registrar(Local local) throws Exception;
	public void	actualizar(Local local) throws Exception;

	public void eliminar(Integer id) throws Exception;
}
