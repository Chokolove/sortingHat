package edu.cibertec.rest;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;

import edu.cibertec.businessLogic.AccountBL;
import edu.cibertec.businessLogic.LocalBL;
import edu.cibertec.businessLogic.ProfileBL;
import edu.cibertec.businessLogic.ReviewBL;
import edu.cibertec.dto.AccountDTO;
import edu.cibertec.dto.ProfileDTO;
import edu.cibertec.model.ModelLocal;

@Path("/post")
public class RestPost {
	
	LocalBL localbl= new LocalBL();
	AccountBL accountBl = new AccountBL();
	ReviewBL revBl = new ReviewBL();
	ProfileBL profBL = new ProfileBL();
	
	//http://localhost:8080/api-rest/post/inAcc/
	@POST
	@Path("/inAcc")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)

	public String ingresarAccount(AccountDTO accdto) {
		
		String respuesta ="";
		
		respuesta = accountBl.ingresarAccount(accdto);
		
		return respuesta;
	}
	
	
}
