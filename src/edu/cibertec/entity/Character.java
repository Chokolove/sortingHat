package edu.cibertec.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_character")
public class Character {
	
	@Id
	private int id;
	private String houseName;
	private String members;
	private String founder;
	private String description;
	private String imageHouse;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getMembers() {
		return members;
	}
	public void setMembers(String members) {
		this.members = members;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageHouse() {
		return imageHouse;
	}
	public void setImageHouse(String imageHouse) {
		this.imageHouse = imageHouse;
	}
	
	
}
