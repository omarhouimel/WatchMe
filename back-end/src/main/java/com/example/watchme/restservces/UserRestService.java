package com.example.watchme.restservces;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.watchme.entites.User;
import com.example.watchme.configuration.SessionScope;
import com.example.watchme.entites.Comment;
import com.example.watchme.entites.Rating;
import com.example.watchme.services.UserService;



@RestController
@CrossOrigin(value="http://localhost:4200")
public class UserRestService {
	////////////////////////////////////////Karim
	@Autowired
	UserService userService;
	
	 @Autowired
	 SessionScope session;
	
	@RequestMapping(value = "/comment/{id}",method=RequestMethod.GET)
	public List<Comment> getAllComments(@PathVariable Long id){
		return userService.getAllComment(id);
	}
	
	@RequestMapping(value = "/addComment/{id}",method=RequestMethod.POST)
	public String addComment(@RequestBody Comment c,@PathVariable Long id){
		try {
			userService.addComment(id, c);
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			return e.toString();
		}
	}
	//////////////////////////////////////////////Seif
	@RequestMapping(value = "/rating/{id}",method=RequestMethod.GET)
	public List<Rating> getAllRating(@PathVariable Long id){
		return userService.getAllRating(id);
	}
	
	@RequestMapping(value = "/addRating/{userID}/{movieID}",method=RequestMethod.POST)
	public String addRating(@RequestBody Rating r,@PathVariable Long userID,@PathVariable Long movieID){
		try {
			userService.addRating(userID, r,movieID);
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			return e.toString();
		}
	
	}
	////////////////////////////////////////////////////Omar
	@RequestMapping(value = "/authenticate",method=RequestMethod.POST)
	public UserToSend login(@RequestBody User u ){
		try {
			User user = userService.getUser(u.getUsername(), u.getPassword());
			session.setToken(user.getToken());
			
			UserToSend u1= new UserToSend();
			
			u1.first_name= user.getFirst_name();
			u1.last_name = user.getLast_name();
			u1.token = user.getToken();
			u1.user_name = user.getUsername();
			u1.id = user.getId();
			return u1;
			
		} catch (Exception e) {
			return null;
		}
		
		}
	public static class UserToSend{
		public String user_name;
		public String first_name;
		public  String last_name;
		public  Long token;
		public Long id;
		
		
		
	}
	
}