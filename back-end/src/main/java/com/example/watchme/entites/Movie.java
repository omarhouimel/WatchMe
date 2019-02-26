package com.example.watchme.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity 
public class Movie implements Serializable {
	
	
	@Id @GeneratedValue
	private long id;
	private String name;
	private String rate;
	private String genre;
	private String link;
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Comment> comments;
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Rating> rating;
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	//fasa5ni
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String image) {
		this.link = image;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rate=" + rate + ", genre=" + genre + ", image=" + link + "]";
	}
	
	
	
	public Movie() {
		super();
	}
	public Movie(String name, String rate, String genre, String image) {
		super();
	
		this.name = name;
		this.rate = rate;
		this.genre = genre;
		this.link = image;
	}
	
	public Movie(String name , String genre) {
		super();
		this.name=name;
		this.genre=genre;
		
	}
	public Movie(String name, String rate, String genre, String link, List<Comment> comments) {
		super();
		this.name = name;
		this.rate = rate;
		this.genre = genre;
		this.link = link;
		this.comments = comments;
	}
	public List<Rating> getRating() {
		return rating;
	}
	public void setRating(List<Rating> rating) {
		this.rating = rating;
	}
	public Movie(String name, String rate, String genre, String link, List<Comment> comments, List<Rating> rating) {
		super();
		this.name = name;
		this.rate = rate;
		this.genre = genre;
		this.link = link;
		this.comments = comments;
		this.rating = rating;
	}
	public Movie(String name, String rate, String genre, List<Rating> rating,String link) {
		super();
		this.name = name;
		this.rate = rate;
		this.genre = genre;
		this.link = link;
		this.rating = rating;
	}
	
	
	
	

}
