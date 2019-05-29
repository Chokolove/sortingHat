package edu.cibertec.dto;

import java.io.Serializable;

public class ReviewDTO implements Serializable{
	private int id;
	private AccountDTO account;
	private LocalDTO local;
	private int stars;
	private String commentary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public AccountDTO getAccount() {
		return account;
	}
	public void setAccount(AccountDTO account) {
		this.account = account;
	}
	public LocalDTO getLocal() {
		return local;
	}
	public void setLocal(LocalDTO local) {
		this.local = local;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public String getCommentary() {
		return commentary;
	}
	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}
	
}
