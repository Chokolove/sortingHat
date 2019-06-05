package edu.cibertec.persistence.service;

import java.util.List;

import edu.cibertec.jpa.AccountJPA;
import edu.cibertec.persistance.jpa.dao.Account;

public class AccountServiceImpl implements IAccountService {
	
	Account accDAO = new Account();

	@Override
	public AccountJPA getAccount(Integer id) throws Exception {
		
		AccountJPA accs = null;
		
		accDAO.createEM();
		accs = accDAO.get(id);
		accDAO.releaseEM();
		
		return accs;
	}

	@Override
	public List<AccountJPA> getAccounts() throws Exception {
		List<AccountJPA> accs = null;
		
		accDAO.createEM();
		accs= accDAO.getAll();
		accDAO.releaseEM();
		
		return accs;
	}

	@Override
	public void registrar(AccountJPA account) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(AccountJPA account) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
