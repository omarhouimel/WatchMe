package watch.me.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import watch.me.entites.Comment;
import watch.me.entites.User;
import watch.me.services.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/index")
	public String index(Model model) {
		List<User> listUsers = userService.getAllUser();
		model.addAttribute("listUsers", listUsers);
		
		
		return "users";
	}
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(int id) {
		userService.removeUser((long)id);
		return "redirect:/index";
	}

}
