package edu.cibertec.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import edu.cibertec.dto.AccountDTO;
import edu.cibertec.dto.LocalDTO;
import edu.cibertec.dto.ProfileDTO;
import edu.cibertec.dto.ReviewDTO;
import edu.cibertec.entity.Account;
import edu.cibertec.entity.Local;
import edu.cibertec.persistence.service.AccountServiceImpl;
import edu.cibertec.persistence.service.IAccountService;
import edu.cibertec.persistence.service.LocalServiceImpl;
import edu.cibertec.persistence.service.ProfileServiceImpl;
import edu.cibertec.persistence.service.ReviewServiceImpl;
import edu.cibertec.util.Util;

@Path("/get")
public class RestGet {
	
	static final Logger log = Logger.getLogger(AccountServiceImpl.class);
	
	AccountServiceImpl accService = new AccountServiceImpl();
	LocalServiceImpl locService = new LocalServiceImpl();
	ProfileServiceImpl profService = new ProfileServiceImpl();
	ReviewServiceImpl revService = new ReviewServiceImpl();
	
	//http://localhost:8080/api-rest/get/obtenerdatoslocal/
	@GET
	@Path("/obtenerdatoslocal")
	@Produces(MediaType.APPLICATION_JSON)
	public List<LocalDTO> obtenerDatosLocales() {
		log.info("Entro a obtenerDatosLocales()");
		List<LocalDTO> listaLocales = new ArrayList<LocalDTO>();
		List<Local> listJPA = new ArrayList<Local>();
		
		try {
			listJPA = locService.getLocals();
			for(Local jpa:listJPA) {
				listaLocales.add(Util.localJPAtoDTO(jpa));
			}
		} catch (Exception e) {
			log.error("No se pudo obtener lista");
			e.printStackTrace();
		}
		
		

		log.info("Saliendo de obtenerDatosLocales()");
		return listaLocales;
	}
	//http://localhost:8080/api-rest/get/obtenerDatosAccount/
	@GET
	@Path("/obtenerDatosAccount")
	@Produces(MediaType.APPLICATION_JSON)
	public List<AccountDTO> obtenerDatosAccount() {
		log.info("entro obtenerDatosAccount()");
		List<AccountDTO> listaAccount = new ArrayList<AccountDTO>();
		List<Account> listaAccJPA = new ArrayList<Account>();
		
		try {
			listaAccJPA = accService.getAccounts();
			for(Account acc:listaAccJPA) {
				listaAccount.add(Util.accJPAtoDTO(acc));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		log.info("Saliendo de obtenerDatosAccount()");
		return listaAccount;
	}

	//http://localhost:8080/api-rest/get/obtenerdatoslocal/M
	@GET
	@Path("/obtenerdatoslocal/{p_dir}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<LocalDTO> obtenerDatosLocalesDescripcion(@PathParam("p_dir") String dir) {
		log.info("entro obtenerdatoslocalxDesc()");
		List<LocalDTO> listaLocales = new ArrayList<LocalDTO>();
		List<Local> listJPA = new ArrayList<Local>();
		
		try {
			listJPA = locService.getLocalxDir(dir);
			
			for(Local loc:listJPA) {
				listaLocales.add(Util.localJPAtoDTO(loc));
			}
			log.info("Se econtro Registro");
			return listaLocales;
			
		} catch (Exception e) {
			log.error("Algo salio mal al recuperar LocalesXdir");
			e.printStackTrace();
		}
		
		log.info("salio obtenerdatoslocalxDesc()");
		return null;
	}
	/*
	//http://localhost:8080/api-rest/get/obetenerResenasLocal/1
	@GET
	@Path("/obetenerResenasLocal/{p_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ReviewDTO> obetenerRevIdLocal(@PathParam("p_id") int id) {
		System.out.println("entro obetenerResenasLocal()");
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

*/











}
