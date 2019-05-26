package edu.cibertec.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_account")
public class AccountDTO {
	@Id
	private int id;
	private String email;
	private String password;
	private int accType;
	private int status;
	@JsonIgnore
	@OneToMany(mappedBy="admin", cascade= CascadeType.PERSIST, fetch = FetchType.LAZY)
	private Collection<LocalDTO> locales = new ArrayList<LocalDTO>();
	@JsonIgnore
	@OneToMany(mappedBy = "account", cascade = CascadeType.PERSIST)
	private Collection<ProfileDTO> profiles = new ArrayList<ProfileDTO>();
	@JsonIgnore
	@OneToMany(mappedBy = "account", cascade = CascadeType.PERSIST)
	private Collection<ReviewDTO> reviews = new ArrayList<ReviewDTO>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAccType() {
		return accType;
	}
	public void setAccType(int accType) {
		this.accType = accType;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Collection<LocalDTO> getLocales() {
		return locales;
	}
	public void setLocales(Collection<LocalDTO> locales) {
		this.locales = locales;
	}
	public Collection<ProfileDTO> getProfiles() {
		return profiles;
	}
	public void setProfiles(Collection<ProfileDTO> profiles) {
		this.profiles = profiles;
	}
	public Collection<ReviewDTO> getReviews() {
		return reviews;
	}
	public void setReviews(Collection<ReviewDTO> reviews) {
		this.reviews = reviews;
	}
	
	
}
