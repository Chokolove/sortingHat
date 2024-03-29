package edu.cibertec.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_houses")
public class House {
	
	@Id
	private int id;
	private String houseName;
	private String founder;
	private String description;
	private String imageHouse;
	@OneToMany(mappedBy="house", cascade= CascadeType.PERSIST)
	private Collection<Character> characters = new ArrayList<Character>();
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
