package edu.cibertec.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import edu.cibertec.dto.LoginDTO;
import edu.cibertec.dto.ProfileDTO;
import edu.cibertec.entity.Account;
import edu.cibertec.entity.Profile;
import edu.cibertec.persistence.service.AccountServiceImpl;
import edu.cibertec.persistence.service.ProfileServiceImpl;
import edu.cibertec.util.Util;

@Path("/post")
public class RestPost {
	
	AccountServiceImpl accService = new AccountServiceImpl();
	ProfileServiceImpl profService = new ProfileServiceImpl();
	

	static final Logger log = Logger.getLogger(RestPost.class);
	
	//http://localhost:8080/api-rest/post/login/
	@POST
	@Path("/login")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public String validarLogin( LoginDTO login) {
		log.info("Entrando a POST: validarLogin()");
		List<Account> listaAccJPA = null;
		String json = "";
		ProfileDTO dto = new ProfileDTO();
		Profile jpa = new Profile();
		JsonObject probando = new JsonObject();
		JsonElement probando2 = null;
		try {
			listaAccJPA = accService.getAccounts();
			for(Account acc:listaAccJPA) {
				if(login.getEmail().equals(acc.getEmail()) && login.getPassword().equals(acc.getPassword())) {
					
					
					jpa = profService.getProfile(acc.getId());
					dto = Util.profileJPAtoDTO(jpa);
					
					probando2= new Gson().toJsonTree(dto);
					
					probando.add("ProfileDTO", probando2);
					probando.addProperty("response", "true");
					
					json = probando.toString();
					
					log.info(json);
					log.info("Saliendo a POST: validarLogin()");
					return json; 
				} 
			}
		} catch (Exception e) {
			
			log.fatal("Exception: ", e);
			return null;
			
		}
		probando.addProperty("ProfileDTO", "null");
		probando.addProperty("response", "false");
		json = probando.toString();
		
		log.info("No se encontro registro");
		log.info("Saliendo a POST: validarLogin()");
		return json;
	}
	/*
	//http://localhost:8080/api-rest/post/login/
		@POST
		@Path("/login")
		@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
		@Produces(MediaType.APPLICATION_JSON)
		public String registrarAccount( LoginDTO login) {
			return null;
			
			
		}
	
	*/
}
