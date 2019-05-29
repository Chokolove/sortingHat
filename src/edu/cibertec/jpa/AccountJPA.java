package edu.cibertec.jpa;

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
public class AccountJPA {
	@Id
	private int id;
	private String email;
	private String password;
	private int accType;
	private int status;
	@OneToMany(mappedBy="admin", cascade= CascadeType.PERSIST)
	private Collection<LocalJPA> locales = new ArrayList<LocalJPA>();
	@OneToMany(mappedBy = "account", cascade = CascadeType.PERSIST)
	private Collection<ProfileJPA> profiles = new ArrayList<ProfileJPA>();
	@OneToMany(mappedBy = "account", cascade = CascadeType.PERSIST)
	private Collection<ReviewJPA> reviews = new ArrayList<ReviewJPA>();
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
	public Collection<LocalJPA> getLocales() {
		return locales;
	}
	public void setLocales(Collection<LocalJPA> locales) {
		this.locales = locales;
	}
	public Collection<ProfileJPA> getProfiles() {
		return profiles;
	}
	public void setProfiles(Collection<ProfileJPA> profiles) {
		this.profiles = profiles;
	}
	public Collection<ReviewJPA> getReviews() {
		return reviews;
	}
	public void setReviews(Collection<ReviewJPA> reviews) {
		this.reviews = reviews;
	}
	
	
}
