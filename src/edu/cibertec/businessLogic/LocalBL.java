package edu.cibertec.businessLogic;

import java.util.ArrayList;
import java.util.List;

import edu.cibertec.dto.LocalDTO;
import edu.cibertec.jpa.LocalJPA;
import edu.cibertec.model.ModelLocal;
import edu.cibertec.util.Util;

public class LocalBL {
	ModelLocal modelo = new ModelLocal();


	public List<LocalDTO> obtenerDatosLocales() {
		System.out.println("entro obtenerdatoslocal()");
		List<LocalDTO> listaLocales = new ArrayList<LocalDTO>();
		List<LocalJPA> listaLocalesJPA = new ArrayList<LocalJPA>();
		listaLocalesJPA = modelo.listarLocal();
		for (LocalJPA local:listaLocalesJPA) {
			LocalDTO loc = new LocalDTO();
			
			loc= Util.localJPAtoDTO(local);

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

			loc= Util.localJPAtoDTO(local);

			listaLocales.add(loc);
		}

		return listaLocales;
	}
}
