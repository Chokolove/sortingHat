package edu.cibertec.businessLogic;

import java.util.ArrayList;
import java.util.List;

import edu.cibertec.dto.AccountDTO;
import edu.cibertec.jpa.AccountJPA;
import edu.cibertec.model.ModelAccount;

public class AccountBL {
	ModelAccount modelo = new ModelAccount();
	public List<AccountDTO> obtenerDatosAccount() {
		System.out.println("entro obtenerDatosAccount()");
		List<AccountJPA> listaAccount = new ArrayList<AccountJPA>();
		List<AccountDTO> listaAcc = new ArrayList<AccountDTO>();
		listaAccount = modelo.listaAccount();
		for (AccountJPA acc:listaAccount) {
			AccountDTO account = new AccountDTO();
			account.setId(acc.getId());
			account.setEmail(acc.getEmail());
			account.setPassword(acc.getPassword());
			account.setAccType(acc.getAccType());
			account.setStatus(acc.getStatus());
			
			System.out.println("ID:     "+account.getId());
			System.out.println("Email:  "+account.getEmail());
			System.out.println("Pass:   "+account.getPassword());
			System.out.println("Type:   "+account.getAccType());
			System.out.println("Status: "+account.getStatus());
			System.out.println("---------------------");
			
			listaAcc.add(account);
		}

		return listaAcc;
	}
	public String ingresarAccount(AccountDTO acc) {
		AccountJPA account = new AccountJPA();
		
		account.setId(acc.getId());
		account.setEmail(acc.getEmail());
		account.setPassword(acc.getPassword());
		account.setAccType(acc.getAccType());
		account.setStatus(acc.getStatus());
		
		System.out.println("Entro en servicio Post - ingresarAccount()");
		System.out.println("Email:  "+account.getEmail());
		System.out.println("Pass:   "+account.getPassword());
		System.out.println("Type:   "+account.getAccType());
		System.out.println("Status: "+account.getStatus());
		System.out.println("---------------------");
		
		modelo.insertarAccount(account);
		
		return "Cuenta registrada Correctamente";
	}
}
