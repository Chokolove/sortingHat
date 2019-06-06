package edu.cibertec.persistence.service;

import java.util.List;

import edu.cibertec.entity.Account;

public interface IAccountService {

	public Account getAccount(Integer id) throws Exception;
	public List<Account> getAccounts()	throws Exception;
	public void registrar(Account account) throws Exception;
	public void	actualizar(Account account) throws Exception;

	public void eliminar(Integer id) throws Exception;
}
