package edu.cibertec.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_local")
public class LocalDTO {
	@Id
	private int id;
	@ManyToOne
	private AccountDTO admin;
	private String address;
	private String description;
	private double latitude;
	private double longitude;
	private String created_at;
	private String updated_at;
	private String deleted_at;
	private int status;
	@JsonIgnore
	@OneToMany(mappedBy = "local", cascade = CascadeType.PERSIST)
	private Collection<ReviewDTO> reviews = new ArrayList<ReviewDTO>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public AccountDTO getAdmin() {
		return admin;
	}
	public void setAdmin(AccountDTO admin) {
		this.admin = admin;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	public String getDeleted_at() {
		return deleted_at;
	}
	public void setDeleted_at(String deleted_at) {
		this.deleted_at = deleted_at;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Collection<ReviewDTO> getReviews() {
		return reviews;
	}
	public void setReviews(Collection<ReviewDTO> reviews) {
		this.reviews = reviews;
	}
	
	
}
