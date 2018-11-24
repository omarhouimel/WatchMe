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

	@RequestMapping(value = "/index")
	public String index(Model model) {
		List<User> listUsers = userService.getAllUser();
		model.addAttribute("listUsers", listUsers);

		return "users";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(int id) {
		userService.removeUser((long) id);
		return "redirect:/index";
	}

	@RequestMapping(value = "/addUser")
	public String addNewUser(Model model) {
		User u = new User();
		model.addAttribute("user", u);
		return "addNewUser";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(User u, Model model) {

		userService.addNewUser(u);
		model.addAttribute("u", u);
		return "save";

	}

	@RequestMapping(value = "/comment")
	public String comment(int id, Model model) {
		User u = userService.getUserById((long) id);
		model.addAttribute("user_name", u.getFirst_name() + " " + u.getLast_name());
		List<Comment> list_comment = userService.getAllComment((long) id);
		model.addAttribute("list_comment", list_comment);

		return "comment";
	}
}
