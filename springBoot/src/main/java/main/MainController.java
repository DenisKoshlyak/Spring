package main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	private LoggedUserManagementService loggedUserManagementService = new LoggedUserManagementService();
	
	@GetMapping("/main")
	public String home(Model model, LoggedUserManagementService loggedUserManagementService) {
		if(loggedUserManagementService.getUsername() == null) {
			model.addAttribute("massage", "You are not login now");
			return "login.html";
		}
		else {
			model.addAttribute("username", loggedUserManagementService.getUsername());
			return "main.html";
		}
	}
	
	@PostMapping("/main")
	public String backLogin(LoggedUserManagementService loggedUserManagementService) {
		loggedUserManagementService.setUsername(null);
		return "redirect:/";
	}
}
