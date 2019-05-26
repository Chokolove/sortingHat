package edu.cibertec.businessLogic;

import java.util.ArrayList;
import java.util.List;

import edu.cibertec.dto.AccountDTO;
import edu.cibertec.model.ModelAccount;

public class AccountBL {
	ModelAccount modelo = new ModelAccount();
	public List<AccountDTO> obtenerDatosAccount() {
		System.out.println("entro obtenerDatosAccount()");
		List<AccountDTO> listaAccount = new ArrayList<AccountDTO>();

		listaAccount = modelo.listaAccount();
		for (AccountDTO acc:listaAccount) {
			System.out.println("-----");
			System.out.println("Descripcion: "+acc.getEmail());
			System.out.println("Status: "+acc.getStatus());
			System.out.println("-----");
		}

		return listaAccount;
	}
	public String ingresarAccount(AccountDTO acc) {
		System.out.println("Entro en servicio Post - ingresarAccount()");
		System.out.println("Email: "+acc.getEmail());
		System.out.println("Status: "+acc.getStatus());
		System.out.println("Tipo: "+acc.getAccType());
		
		modelo.insertarAccount(acc);
		
		return "Cuenta registrada Correctamente";
	}
}
