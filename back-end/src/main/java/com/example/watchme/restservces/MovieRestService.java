package com.example.watchme.restservces;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.watchme.entites.Comment;
import com.example.watchme.entites.Movie;
import com.example.watchme.entites.Rating;
import com.example.watchme.services.MovieService;

@RestController 
@CrossOrigin(origins = "http://localhost:4200" )
public class MovieRestService {
	
	@Autowired
	MovieService movieservice;
	
	
	
	
	
	
	@RequestMapping(value = "/movie/{id}",method=RequestMethod.GET)
	public Movie getMovieByID(@PathVariable Long id){
		return movieservice.getMovieByID(id);
	}
	
	
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addMovie(@RequestBody Movie m ) {
		try {
			movieservice.addMovie(m);
			return "Seceeded";
		} catch (Exception e) {
			// TODO: handle exception
			return e.toString();
		}
			
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public void updateMovie(@RequestBody Movie m) {
		movieservice.updateMovie(m);
	}
	
	@RequestMapping(value = "/movies",method=RequestMethod.GET)
	public List<Movie> getAllMovies(){
		return movieservice.getAllMovies();
	}
	
	///////////////////////////////////////
	@RequestMapping(value = "/movieComment",method=RequestMethod.GET)
	public List<Comment> getAllComments(@RequestParam("id")  Long id){
		return movieservice.getAllComment(id);
	}
	
	@RequestMapping(value = "/addCommentToMovie/{id}",method=RequestMethod.POST)
	public String addComment(@RequestBody Comment c,@PathVariable Long id){
		try {
			movieservice.addComment(id, c);
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			return e.toString();
		}
	}
	
	///////////////////////////////////////
	@RequestMapping(value = "/movieRating",method=RequestMethod.GET)
	public List<Rating> getAllRating(@RequestParam("id")  Long id){
		return movieservice.getAllRating(id);
	}
	
//	@RequestMapping(value = "/addRatingToMovie/{id}",method=RequestMethod.POST)
//	public String addComment(@RequestBody Rating r,@PathVariable Long id){
//		try {
//			movieservice.addRating(id, r);
//			return "success";
//		} catch (Exception e) {
//			// TODO: handle exception
//			return e.toString();
//		}
//	}
	@RequestMapping(value = "/getMoviRating",method=RequestMethod.GET)
	public Rating getMoviRating(@RequestParam("id")  Long id){
		return movieservice.getFinalRating(id);
	}
	

		
	
	
	
}
