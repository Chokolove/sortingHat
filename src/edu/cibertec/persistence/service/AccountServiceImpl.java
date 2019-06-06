package edu.cibertec.persistence.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.spi.LoggerFactory;

import edu.cibertec.entity.Account;
import edu.cibertec.persistance.jpa.dao.AccountJPA;

public class AccountServiceImpl implements IAccountService {
	
	
	static final Logger log = Logger.getLogger(AccountServiceImpl.class);
	
	AccountJPA accDAO = new AccountJPA();


	@Override
	public Account getAccount(Integer id) throws Exception {
		log.info("Se ingreso a getAccount()");
		Account acc = null;

		accDAO.createEM();
		acc = accDAO.get(id);
		accDAO.releaseEM();
		
		log.info("Se sale de getAccount()");
		
		return acc;
	}

	@Override
	public List<Account> getAccounts() throws Exception {
		
		
		log.info("Se ingreso a getAccounts()");
		List<Account>accs= null;

		accDAO.createEM();
		accs= accDAO.getAll();
		accDAO.releaseEM();
		
		log.info("Se sale de getAccounts()");
		
		return accs;
	}

	@Override
	public void registrar(Account account) throws Exception {
		
		log.info("Se ingreso a registrar()");
		List<Account>accs= null;

		accDAO.createEM();
		accs= accDAO.getAll();
		for(Account acc:accs) {
			if(acc.getEmail().equals(account.getEmail())) {
				log.error("Cuenta ya existe");
				throw new Exception();
			}	
		}
		
		
		try {

			accDAO.createEM();
			accDAO.beginTransaction();
			accDAO.registrar(account);
			accDAO.flush();
			accDAO.endTransaction();

		} catch (Exception e) {
			log.error("Algo salio mal al registrar Account");
			accDAO.rollbackTransaction();
			e.printStackTrace();
		}
		accDAO.releaseEM();
		log.info("Cuenta Creada");
	}

	@Override
	public void actualizar(Account account) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer id) throws Exception {
		// TODO Auto-generated method stub

	}


}
