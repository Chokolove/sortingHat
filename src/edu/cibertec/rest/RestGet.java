package edu.cibertec.rest;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.dto.AccountDTO;
import edu.cibertec.dto.LocalDTO;
import edu.cibertec.model.ModelLocal;

@Path("/get")
public class RestGet {

	ModelLocal modelo = new ModelLocal();


	//http://localhost:8080/api-rest/get/obtenerdatoslocal/
	@GET
	@Path("/obtenerdatoslocal")
	@Produces(MediaType.APPLICATION_JSON)
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
	//http://localhost:8080/api-rest/get/obtenerDatosAccount/
		@GET
		@Path("/obtenerDatosAccount")
		@Produces(MediaType.APPLICATION_JSON)
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

	//http://localhost:8080/api-rest/get/obtenerdatoslocal/Berlin
	@GET
	@Path("/obtenerdatoslocal/{p_dir}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<LocalDTO> obtenerDatosLocalesDescripcion(@PathParam("p_dir") String dir) {
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
