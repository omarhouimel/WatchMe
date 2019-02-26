package com.example.watchme.entites;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Purchase implements Serializable {
	private static final long serialVersionUID = 2L;
	@Id @GeneratedValue	
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date date;
	@ManyToOne(fetch=FetchType.EAGER)
	private User User;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public User getUser() {
		return User;
	}
	public void setUser(User user) {
		User = user;
	}
	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
