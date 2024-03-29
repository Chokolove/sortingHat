package edu.cibertec.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_character")
public class Character {
	
	@Id
	private int id;
	private String nameCharacter;
	private String ageCharacter;
	private String imageCharacter;
	private String nameFather;
	private String nameMother;
	@ManyToOne
	@JoinColumn(name="houseID")
	private House house;
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
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	
	
	
	
}
