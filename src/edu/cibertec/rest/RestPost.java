package edu.cibertec.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.businessLogic.AccountBL;
import edu.cibertec.dto.AccountDTO;
import edu.cibertec.dto.ProfileDTO;
import edu.cibertec.model.ModelLocal;

@Path("/post")
public class RestPost {
	
	//http://localhost:8080/api-rest/post/inAccProf/
	@POST
	@Path("/inAccProf")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public String ingresarAccount() {
		
		
		
		return "Cuenta registrada Correctamente";
	}
	
	
}
