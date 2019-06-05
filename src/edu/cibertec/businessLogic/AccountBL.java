package edu.cibertec.businessLogic;

import java.util.ArrayList;
import java.util.List;

import edu.cibertec.dto.AccountDTO;
import edu.cibertec.jpa.AccountJPA;
import edu.cibertec.model.ModelAccount;
import edu.cibertec.util.Util;

public class AccountBL {
	ModelAccount modelo = new ModelAccount();
	public List<AccountDTO> obtenerDatosAccount() {
		System.out.println("entro obtenerDatosAccount()");
		List<AccountJPA> listaAccount = new ArrayList<AccountJPA>();
		List<AccountDTO> listaAcc = new ArrayList<AccountDTO>();
		listaAccount = modelo.listaAccount();
		for (AccountJPA acc:listaAccount) {
			
			AccountDTO account = new AccountDTO();
			
			account = Util.accJPAtoDTO(acc);
			
			listaAcc.add(account);
		}

		return listaAcc;
	}
	public String ingresarAccount(AccountDTO acc) {
		AccountJPA account = new AccountJPA();
		
		account = Util.accDTOtoJPA(acc);
		String respuesta ="";
		respuesta = modelo.insertarAccount(account);
		
		return respuesta;
	}
}
