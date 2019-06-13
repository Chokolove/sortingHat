package edu.cibertec.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_account")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String email;
	private String password;
	private int accType;
	private int status;
	@OneToMany(mappedBy="admin", cascade= CascadeType.PERSIST)
	private Collection<Local> locales = new ArrayList<Local>();
	@OneToMany(mappedBy = "account", cascade = CascadeType.PERSIST)
	private Collection<Profile> profiles = new ArrayList<Profile>();
	@OneToMany(mappedBy = "account", cascade = CascadeType.PERSIST)
	private Collection<Review> reviews = new ArrayList<Review>();
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
	public Collection<Local> getLocales() {
		return locales;
	}
	public void setLocales(Collection<Local> locales) {
		this.locales = locales;
	}
	public Collection<Profile> getProfiles() {
		return profiles;
	}
	public void setProfiles(Collection<Profile> profiles) {
		this.profiles = profiles;
	}
	public Collection<Review> getReviews() {
		return reviews;
	}
	public void setReviews(Collection<Review> reviews) {
		this.reviews = reviews;
	}
	
	
}
