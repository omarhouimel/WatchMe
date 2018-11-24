package watch.me;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import watch.me.entites.Comment;
import watch.me.entites.User;
import watch.me.services.UserService;

@SpringBootApplication
public class WatchMeApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(WatchMeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		userService.addUser("Mohamed", "saleh", "500");
//		userService.addUser("Jaloul", "Naji", "500");
//		userService.addUser("ahmed", "Chatii", "500");
//		userService.addUser("Taha", "youssef", "500");
//		userService.addUser("monji", "boulares", "500");
		//DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		//Comment c = new Comment("hello Omar", df.parse("03/02/1996"));
		//userService.addComment((long) 1,c);
		//System.out.println(userService.getAllComment((long) 1).get(0).getBody());
	}
}
