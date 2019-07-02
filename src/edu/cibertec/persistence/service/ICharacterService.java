package edu.cibertec.persistence.service;

import java.util.List;

import edu.cibertec.entity.Character;

public interface ICharacterService {
	public Character getCharacter(Integer id) throws Exception;
	public List<Character> getCharacters()	throws Exception;
	public List<Character> getCharactersXHouse(Integer id)	throws Exception;
	public void registrar(Character Character) throws Exception;
	public void	actualizar(Character Character) throws Exception;

	public void eliminar(Integer id) throws Exception;
}
