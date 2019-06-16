package edu.cibertec.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

import edu.cibertec.entity.Character;
import edu.cibertec.entity.House;
import edu.cibertec.persistence.service.CharacterServiceImpl;
import edu.cibertec.persistence.service.HouseServiceImpl;

@Path("/get")
public class RestGet {

	static final Logger log = Logger.getLogger(RestGet.class);

	CharacterServiceImpl charService = new CharacterServiceImpl();
	HouseServiceImpl houService = new HouseServiceImpl();

	//http://localhost:8080/api-rest/get/getHouse/1
	@GET
	@Path("/getHouse/{p_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getHouse(@PathParam("p_id") int id) {
		log.info("entro obetenerResenasLocal()");
		String json = "";
		House hou = new House();
		try {
			hou = houService.getHouse(id);
			json = new Gson().toJson(hou).toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("salio obetenerResenasLocal()");
		return json;
	}

	//http://localhost:8080/api-rest/get/getCharacter/1
	@GET
	@Path("/getCharacter/{p_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCharacter(@PathParam("p_id") int id) {
		log.info("entro obetenerResenasLocal()");
		String json = "";
		Character character = new Character();
		try {
			character = charService.getCharacter(id);
			json = new Gson().toJson(character).toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("salio obetenerResenasLocal()");
		return json;
	}












}
