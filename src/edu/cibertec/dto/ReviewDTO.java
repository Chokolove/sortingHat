package edu.cibertec.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "tb_review")
public class ReviewDTO {
	@Id
	private int id;
	@ManyToOne
	@JoinColumn(name = "account_id")
	private AccountDTO account;
	@ManyToOne
	@JoinColumn(name = "local_id")
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
