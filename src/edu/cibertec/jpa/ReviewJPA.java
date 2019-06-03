package edu.cibertec.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "tb_review")
public class ReviewJPA {
	@Id
	private int id;
	@ManyToOne
	@JoinColumn(name = "account_id")
	private AccountJPA account;
	@ManyToOne
	@JoinColumn(name = "local_id")
	private LocalJPA local;
	private int stars;
	private String commentary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public AccountJPA getAccount() {
		return account;
	}
	public void setAccount(AccountJPA account) {
		this.account = account;
	}
	public LocalJPA getLocal() {
		return local;
	}
	public void setLocal(LocalJPA local) {
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