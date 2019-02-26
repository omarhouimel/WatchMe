package com.example.watchme.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Role implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1463651093050667072L;
	@Id
	private Long id;
	private String role;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(String role, String description) {
		super();
		this.role = role;
		this.description = description;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String description;

}
