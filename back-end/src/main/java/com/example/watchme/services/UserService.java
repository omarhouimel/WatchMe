package com.example.watchme.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.watchme.entites.Comment;
import com.example.watchme.entites.Movie;
import com.example.watchme.entites.Rating;
import com.example.watchme.entites.User;



@Transactional
@Service
public class UserService {
	@PersistenceContext
	private EntityManager em;
	Long token;
	
	
	public void addNewUser(User u) {
		em.persist(u);
	}
	public void addUser(String first_name,String last_name,String password) {
		User u = new User(first_name, last_name, password);
		em.persist(u);
		
	}
	public void addComment(Long userId,Comment comment) {
		User u = em.find(User.class, userId);
		em.persist(comment);
		u.getComments().add(comment);
		em.merge(u);
	}
	public void removeUser(Long userId) {
	User u = em.find(User.class, userId);
	em.remove(u);

	}
	public void updateUser(User u) {
		em.merge(u);
	}
	public List<User>getAllUser(){
		Query query = em.createQuery("from User");
		return query.getResultList();
	}
	
	public List<Comment>getAllComment(Long userId){
		User u = em.find(User.class, userId);
		return u.getComments();
	}
	
	public User getUserById(Long id) {
		return em.find(User.class, id);
	}
	///////////////////////////////////////////////
	public void addRating(Long userId,Rating r,Long movieID) {
		User u = em.find(User.class, userId);
		Movie m = em.find(Movie.class, movieID);
		em.persist(r);
		u.getRating().add(r);
		m.getRating().add(r);
		em.merge(m);
		em.merge(u);
	}
	public List<Rating>getAllRating(Long userId){
		User u = em.find(User.class, userId);
		return u.getRating();
	}
	//////////////////////////////////Omar
	public User getUser(String username,String password) {
	      Query query = em.createQuery
	    		  ( "from User" );
	      List<User> user= query.getResultList();
	      for (User user2 : user) {
	    	  System.out.println("userName "+user2.getUsername()+" password "+user2.getPassword());
	    	  if(user2.getUsername().equals(username)&&user2.getPassword().equals(password))
	    		  return user2;
			
		}
	      return null;
	}


	

}
