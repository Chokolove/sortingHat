package edu.cibertec.businessLogic;

import java.util.ArrayList;
import java.util.List;

import edu.cibertec.dto.AccountDTO;
import edu.cibertec.dto.LocalDTO;
import edu.cibertec.jpa.AccountJPA;
import edu.cibertec.jpa.LocalJPA;
import edu.cibertec.model.ModelLocal;

public class LocalBL {
	ModelLocal modelo = new ModelLocal();


	public List<LocalDTO> obtenerDatosLocales() {
		System.out.println("entro obtenerdatoslocal()");
		List<LocalDTO> listaLocales = new ArrayList<LocalDTO>();
		List<LocalJPA> listaLocalesJPA = new ArrayList<LocalJPA>();
		listaLocalesJPA = modelo.listarLocal();
		for (LocalJPA local:listaLocalesJPA) {
			LocalDTO loc = new LocalDTO();

			AccountDTO account = new AccountDTO();
			AccountJPA acc = new AccountJPA();
			acc=local.getAdmin();
			account.setId(acc.getId());
			account.setEmail(acc.getEmail());
			account.setPassword(acc.getPassword());
			account.setAccType(acc.getAccType());
			account.setStatus(acc.getStatus());

			loc.setId(local.getId());
			loc.setAdmin(account);
			loc.setAddress(local.getAddress());
			loc.setDescription(local.getDescription());
			loc.setLatitude(local.getLatitude());
			loc.setLongitude(local.getLongitude());
			loc.setCreated_at(local.getCreated_at());
			loc.setUpdated_at(local.getUpdated_at());
			loc.setDeleted_at(local.getDeleted_at());
			loc.setStatus(local.getStatus());

			listaLocales.add(loc);
		}

		return listaLocales;
	}
	public List<LocalDTO> obtenerDatosLocalesDescripcion(String dir) {
		System.out.println("entro obtenerdatoslocalxDesc()");
		List<LocalDTO> listaLocales = new ArrayList<LocalDTO>();
		List<LocalJPA> listaLocJpa = new ArrayList<LocalJPA>();
		listaLocJpa = modelo.listarLocalXDir(dir);
		System.out.println(listaLocJpa.size());

		for (LocalJPA local:listaLocJpa) {
			LocalDTO loc = new LocalDTO();

			AccountDTO account = new AccountDTO();
			AccountJPA acc = new AccountJPA();
			acc=local.getAdmin();
			account.setId(acc.getId());
			account.setEmail(acc.getEmail());
			account.setPassword(acc.getPassword());
			account.setAccType(acc.getAccType());
			account.setStatus(acc.getStatus());

			loc.setId(local.getId());
			loc.setAdmin(account);
			loc.setAddress(local.getAddress());
			loc.setDescription(local.getDescription());
			loc.setLatitude(local.getLatitude());
			loc.setLongitude(local.getLongitude());
			loc.setCreated_at(local.getCreated_at());
			loc.setUpdated_at(local.getUpdated_at());
			loc.setDeleted_at(local.getDeleted_at());
			loc.setStatus(local.getStatus());

			listaLocales.add(loc);
		}

		return listaLocales;
	}
}
