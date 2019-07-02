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

import edu.cibertec.dto.CharacterDTO;
import edu.cibertec.dto.HouseDTO;
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
		log.info("entro getHouse()");
		String json = "";
		House hou = new House();
		HouseDTO dto = new HouseDTO();
		try {
			hou = houService.getHouse(id);
			
			dto.setDescription(hou.getDescription());
			dto.setFounder(hou.getFounder());
			dto.setHouseName(hou.getHouseName());
			dto.setId(hou.getId());
			dto.setImageHouse(hou.getImageHouse());
			
			json = new Gson().toJson(dto).toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("salio getHouse()");
		return json;
	}

	//http://localhost:8080/api-rest/get/getCharacter/1
	@GET
	@Path("/getCharacter/{p_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCharacter(@PathParam("p_id") int id) {
		log.info("entro getCharacter()");
		String json = "";
		Character character = new Character();
		CharacterDTO dto = new CharacterDTO();
		HouseDTO houseDTO = new HouseDTO();
		
		try {
			character = charService.getCharacter(id);
			
			
			houseDTO.setDescription(character.getHouse().getDescription());
			houseDTO.setFounder(character.getHouse().getFounder());
			houseDTO.setHouseName(character.getHouse().getHouseName());
			houseDTO.setId(character.getHouse().getId());
			houseDTO.setImageHouse(character.getHouse().getImageHouse());
			
			
			dto.setAgeCharacter(character.getAgeCharacter());
			dto.setHouseDTO(houseDTO);
			dto.setId(character.getId());
			dto.setImageCharacter(character.getImageCharacter());
			dto.setNameCharacter(character.getNameCharacter());
			dto.setNameFather(character.getNameFather());
			dto.setImageCharacter(character.getImageCharacter());
			dto.setNameMother(character.getNameMother());
			
			
			
			json = new Gson().toJson(dto).toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("salio getCharacter()");
		return json;
	}
	//http://localhost:8080/api-rest/get/getCharacterXHouse/1
		@GET
		@Path("/getCharacterXHouse/{p_id}")
		@Produces(MediaType.APPLICATION_JSON)
		public String getCharacterXHouse(@PathParam("p_id") int id) {
			log.info("entro getCharacterXHouse()");
			String json = "";
			List<Character> characters = new ArrayList<Character>();
			List<CharacterDTO> characterDTOs = new ArrayList<CharacterDTO>();
			try {
				characters = charService.getCharactersXHouse(id);
				
				for (Character ch:characters) {
					CharacterDTO dto = new CharacterDTO();
					
					
					dto.setAgeCharacter(ch.getAgeCharacter());
					dto.setId(ch.getId());
					dto.setImageCharacter(ch.getImageCharacter());
					dto.setNameCharacter(ch.getNameCharacter());
					dto.setNameFather(ch.getNameFather());
					dto.setImageCharacter(ch.getImageCharacter());
					dto.setNameMother(ch.getNameMother());
					
					characterDTOs.add(dto);
					
				}
				
				
				
				
				
				json = new Gson().toJson(characterDTOs).toString();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			log.info("salio getCharacterXHouse()");
			return json;
		}












}
