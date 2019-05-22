package edu.cibertec.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.dto.AccountDTO;
import edu.cibertec.model.ModelLocal;

@Path("/post")
public class RestPost {
	ModelLocal modelo = new ModelLocal();
	
	//http://localhost:8080/api-rest/post/inAccount/
	@POST
	@Path("/inAccount")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public String ingresarAccount(AccountDTO acc) {
		System.out.println("Entro en servicio Post - ingresarAccount()");
		System.out.println("Email: "+acc.getEmail());
		System.out.println("Status: "+acc.getStatus());
		System.out.println("Tipo: "+acc.getAccType());
		
		modelo.insertarAccount(acc);
		
		return "Cuenta registrada Correctamente";
	}
	
	
}
