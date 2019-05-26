package edu.cibertec.businessLogic;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.PathParam;

import edu.cibertec.dto.LocalDTO;
import edu.cibertec.model.ModelAccount;
import edu.cibertec.model.ModelLocal;
@Transactional
public class LocalBL {
	ModelLocal modelo = new ModelLocal();
	public List<LocalDTO> obtenerDatosLocales() {
		System.out.println("entro obtenerdatoslocal()");
		List<LocalDTO> listaLocales = new ArrayList<LocalDTO>();

		listaLocales = modelo.listarLocal();
		for (LocalDTO local:listaLocales) {
			System.out.println("-----");
			System.out.println("Descripcion: "+local.getDescription());
			System.out.println("Latitud: "+local.getLatitude());
			System.out.println("Longitud: "+local.getLongitude());
			System.out.println("-----");
		}

		return listaLocales;
	}
	public List<LocalDTO> obtenerDatosLocalesDescripcion(String dir) {
		System.out.println("entro obtenerdatoslocalxDesc()");
		List<LocalDTO> listaLocales = new ArrayList<LocalDTO>();

		listaLocales = modelo.listarLocalXDir(dir);
		for (LocalDTO local:listaLocales) {
			System.out.println("-----");
			System.out.println("Descripcion: "+local.getDescription());
			System.out.println("Latitud: "+local.getLatitude());
			System.out.println("Longitud: "+local.getLongitude());
			System.out.println("-----");
		}

		return listaLocales;
	}
}
