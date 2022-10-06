package main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@GetMapping("/")
	public String loginGet(){
		return "login.html";
	}
	
	@PostMapping("/")
	public String loginPost(Model model, LoginProcessor acc) {
		boolean loggedIn;
		
		loggedIn = acc.login();
		
		if(loggedIn) {
			return "main.html";
		}
		else {
			model.addAttribute("massage", "Log in failed");
			return "login.html";
		}
	}
}
