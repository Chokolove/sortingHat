package edu.cibertec.persistence.service;

import java.util.List;

import org.apache.log4j.Logger;

import edu.cibertec.entity.Character;
import edu.cibertec.entity.House;
import edu.cibertec.persistence.jpa.dao.CharacterJPA;
import edu.cibertec.persistence.jpa.dao.HouseJPA;

public class CharacterServiceImpl implements ICharacterService{
	
	static final Logger log = Logger.getLogger(CharacterServiceImpl.class);
	CharacterJPA characterJPA = new CharacterJPA();
	
	@Override
	public Character getCharacter(Integer id) throws Exception {
		log.info("Se ingreso a getCharacter()");
		Character cha = null;

		characterJPA.createEM();
		cha = characterJPA.get(id);
		characterJPA.releaseEM();

		log.info("Saliendo de getCharacter()");
		
		return cha;
	}

	@Override
	public List<Character> getCharacters() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Character> getCharactersXHouse(Integer id) throws Exception {
		log.info("Se ingreso a getCharactersXHouse()");
		List<Character> characters = null;

		characterJPA.createEM();
		characters = characterJPA.getAllxHouse(id);
		characterJPA.releaseEM();

		log.info("Saliendo de getCharactersXHouse()");
		
		return characters;
	}
	@Override
	public void registrar(Character Character) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Character Character) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
