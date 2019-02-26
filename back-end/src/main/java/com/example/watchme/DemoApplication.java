package com.example.watchme;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.watchme.entites.Comment;
import com.example.watchme.entites.Movie;
import com.example.watchme.entites.Rating;
import com.example.watchme.entites.User;
import com.example.watchme.services.MovieService;

import com.example.watchme.services.UserService;



@SpringBootApplication
public class DemoApplication implements CommandLineRunner   {
	@Autowired
	MovieService movieService;
	@Autowired
	 UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//movieService.addMovie("spi derma", "action");
		//movieService.getAllMovies().forEach(m->{
			//System.out.println(m.getGenre());
	//	});
		//userService.addUser("Mohamed", "saleh", "500");
		/*	User u = new User("karim", "touati", "0000", "karimtouati@gmail.com");
			
			userService.addNewUser(u);
			User u1 = new User("seif", "khirouni", "0000", "seifkhirouni@gmail.com");
			
			userService.addNewUser(u1);*/


		Rating r = new Rating((long)5,(long) 6,(long) 7,(long) 8);

		Rating r2 = new Rating((long)5,(long) 6,(long) 7,(long) 8);  
		
		Comment c = new Comment("This is the first comment");
		//movieService.addComment((long)3, c);
	
		userService.addComment((long) 2,c);
			
			 final String url = 
		                "https://yts.am/";
		        
		        try {
		            final Document document = Jsoup.connect(url).get();
		           // System.out.println(document.outerHtml());
		            
		            for (Element row : document.select(
	                "div.browse-movie-wrap.col-xs-10.col-sm-5")) {
		            		
		            	String name = row.select("div.browse-movie-bottom").text();
		             	String genre = row.select("h4:nth-of-type(2)").text();
		             	String rate = row.select("h4.rating").text();
		             	String link = row.select("a").attr("href");
		            	//String element1=row.select("").text();
		             	Movie m = new Movie(name,rate,genre,link);
		             	System.out.println(m.getGenre());
		             	movieService.addMovie(m);
		                System.out.println("Href: " +m);

		            	
		            }
//		                if (row.select("h2:nth-of-type(1)").text().equals("")) {
//		                    continue;
//		                }
//		                else {
//		                   final String ticker = 
//		                           row.select("h2").text();
//		                   final String name = 
//		                           row.select("td:nth-of-type(2)").text();
//		                   final String tempPrice = 
//		                           row.select("td.right:nth-of-type(3)").text();
//		                   final String tempPrice1 = 
//		                           tempPrice.replace(",", "");
//		                   final double price = Double.parseDouble(tempPrice1);
//		                   
//	                    System.out.println("hahaaaaa"+ticker );
//		                }
//		            }
		        }
		        catch (Exception ex) {
		        	System.out.println(ex.toString());
		        }
			
		        userService.addRating((long)2, r,(long)3);
		       // System.out.println(movieService.getFinalRating((long)80).getCinematography_rating());
	}


	

}
