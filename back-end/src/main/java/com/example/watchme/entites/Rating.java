package com.example.watchme.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Rating implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8369912696510205625L;
	@Id @GeneratedValue
	private Long id;
	private Long plot_rating;
	private Long quality_rating;
	private Long cinematography_rating;
	private Long originality_rating;
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
		this.plot_rating=(long)0;
		this.cinematography_rating=(long)0;
		this.quality_rating=(long)0;
		this.originality_rating=(long)0;
	}
	public Rating(Long plot_rating, Long quality_rating, Long cinematography_rating, Long originality_rating) {
		super();
		this.plot_rating = plot_rating;
		this.quality_rating = quality_rating;
		this.cinematography_rating = cinematography_rating;
		this.originality_rating = originality_rating;
	}
	public Long getPlot_rating() {
		return plot_rating;
	}
	public void setPlot_rating(Long plot_rating) {
		this.plot_rating = plot_rating;
	}
	public Long getQuality_rating() {
		return quality_rating;
	}
	public void setQuality_rating(Long quality_rating) {
		this.quality_rating = quality_rating;
	}
	public Long getCinematography_rating() {
		return cinematography_rating;
	}
	public void setCinematography_rating(Long cinematography_rating) {
		this.cinematography_rating = cinematography_rating;
	}
	public Long getOriginality_rating() {
		return originality_rating;
	}
	public void setOriginality_rating(Long originality_rating) {
		this.originality_rating = originality_rating;
	}
	
}
