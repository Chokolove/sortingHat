package edu.cibertec.persistence.service;

import java.util.List;


import edu.cibertec.jpa.AccountJPA;

public interface IAccountService {

	public AccountJPA getAccount(Integer id) throws Exception;
	public List<AccountJPA> getAccounts()	throws Exception;
	public void registrar(AccountJPA account) throws Exception;
	public void	actualizar(AccountJPA account) throws Exception;

	public void eliminar(Integer id) throws Exception;
}
