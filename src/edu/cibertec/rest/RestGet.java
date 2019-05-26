package edu.cibertec.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.businessLogic.AccountBL;
import edu.cibertec.businessLogic.LocalBL;
import edu.cibertec.businessLogic.ProfileBL;
import edu.cibertec.businessLogic.ReviewBL;
import edu.cibertec.dto.AccountDTO;
import edu.cibertec.dto.LocalDTO;
import edu.cibertec.dto.ProfileDTO;
import edu.cibertec.dto.ReviewDTO;
import edu.cibertec.model.ModelLocal;

@Path("/get")
public class RestGet {

	LocalBL localbl= new LocalBL();
	AccountBL accountBl = new AccountBL();
	ReviewBL revBl = new ReviewBL();
	ProfileBL profBL = new ProfileBL();
	//http://localhost:8080/api-rest/get/obtenerdatoslocal/
	@GET
	@Path("/obtenerdatoslocal")
	@Produces(MediaType.APPLICATION_JSON)
	public List<LocalDTO> obtenerDatosLocales() {
		System.out.println("entro obtenerdatoslocal()");
		List<LocalDTO> listaLocales = new ArrayList<LocalDTO>();

		listaLocales = localbl.obtenerDatosLocales();
		

		return listaLocales;
	}
	//http://localhost:8080/api-rest/get/obtenerDatosAccount/
		@GET
		@Path("/obtenerDatosAccount")
		@Produces(MediaType.APPLICATION_JSON)
		public List<AccountDTO> obtenerDatosAccount() {
			System.out.println("entro obtenerDatosAccount()");
			List<AccountDTO> listaAccount = new ArrayList<AccountDTO>();

			listaAccount = accountBl.obtenerDatosAccount();

			return listaAccount;
		}

	//http://localhost:8080/api-rest/get/obtenerdatoslocal/Berlin
	@GET
	@Path("/obtenerdatoslocal/{p_dir}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<LocalDTO> obtenerDatosLocalesDescripcion(@PathParam("p_dir") String dir) {
		System.out.println("entro obtenerdatoslocalxDesc()");
		List<LocalDTO> listaLocales = new ArrayList<LocalDTO>();

		listaLocales = localbl.obtenerDatosLocalesDescripcion(dir);
		for (LocalDTO local:listaLocales) {
			System.out.println("-----");
			System.out.println("Descripcion: "+local.getDescription());
			System.out.println("Latitud: "+local.getLatitude());
			System.out.println("Longitud: "+local.getLongitude());
			System.out.println("-----");
		}

		return listaLocales;
	}
	//http://localhost:8080/api-rest/get/obetenerReseñasLocal/1
		@GET
		@Path("/obetenerReseñasLocal/{p_id}")
		@Produces(MediaType.APPLICATION_JSON)
		public List<ReviewDTO> obetenerRevIdLocal(@PathParam("p_id") int id) {
			System.out.println("entro obetenerReseñasLocal()");
			List<ReviewDTO> review = new ArrayList<ReviewDTO>();
			
			review = revBl.ListaReviewIdLocal(id);

			return review;
		}
		
		//http://localhost:8080/api-rest/get/obetenerProfileIdAcc/1
				@GET
				@Path("/obetenerProfileIdAcc/{p_id}")
				@Produces(MediaType.APPLICATION_JSON)
				public ProfileDTO obetenerProfileIdAcc(@PathParam("p_id") int id) {
					System.out.println("entro obetenerProfileIdAcc()");
					ProfileDTO profile = new ProfileDTO();
					profile= profBL.profileIdLocal(id);

					return profile;
				}













}
