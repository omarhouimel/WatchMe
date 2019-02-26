package com.example.watchme.entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;


@Entity
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1578339245850491182L;
	@Id @GeneratedValue
	private Long id;
	private String first_name;
	private String last_name;
	private String password;
	private String username;
	private Long token;
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Comment> comments;
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Rating> rating;
	@ManyToMany
	@JoinTable(name = "USERS_ROLES")
	private Collection<Role> roles;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	public List<Rating> getRating() {
		return rating;
	}
	public void setRating(List<Rating> rating) {
		this.rating = rating;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getToken() {
		return token;
	}
	public void setToken() {
		this.token = (long) hashCode();
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String first_name, String last_name, String password, List<Comment> comments) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
		this.comments = comments;
	}
	public User(String first_name, String last_name, String password) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
		setToken();
	}
	public User(String first_name, String last_name, String password,String username) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
		this.username =username;
		setToken();
	}
	public User(String last_name, String password, List<Rating> rating,String first_name) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
		this.rating = rating;
		setToken();
	}
	public User(String first_name, String last_name, String password, List<Comment> comments, List<Rating> rating) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
		this.comments = comments;
		this.rating = rating;
	}
	public User(String username, String password, Collection<Role> roles) {
		super();
		this.username = username;
		this.password = password;
		this.roles = roles;
		setToken();
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		setToken();
	}
	

	

}
