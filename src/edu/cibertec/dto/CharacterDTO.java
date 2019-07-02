package edu.cibertec.dto;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import edu.cibertec.entity.House;

public class CharacterDTO {
	private int id;
	private String nameCharacter;
	private String ageCharacter;
	private String imageCharacter;
	private String nameFather;
	private String nameMother;
	private HouseDTO houseDTO;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameCharacter() {
		return nameCharacter;
	}
	public void setNameCharacter(String nameCharacter) {
		this.nameCharacter = nameCharacter;
	}
	public String getAgeCharacter() {
		return ageCharacter;
	}
	public void setAgeCharacter(String ageCharacter) {
		this.ageCharacter = ageCharacter;
	}
	public String getImageCharacter() {
		return imageCharacter;
	}
	public void setImageCharacter(String imageCharacter) {
		this.imageCharacter = imageCharacter;
	}
	public String getNameFather() {
		return nameFather;
	}
	public void setNameFather(String nameFather) {
		this.nameFather = nameFather;
	}
	public String getNameMother() {
		return nameMother;
	}
	public void setNameMother(String nameMother) {
		this.nameMother = nameMother;
	}
	public HouseDTO getHouseDTO() {
		return houseDTO;
	}
	public void setHouseDTO(HouseDTO houseDTO) {
		this.houseDTO = houseDTO;
	}
	
}
