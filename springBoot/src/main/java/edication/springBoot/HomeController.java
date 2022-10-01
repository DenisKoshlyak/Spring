package edication.springBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String goHome(@RequestParam(required = true) String name,
						@RequestParam(required = false) String color, 
						Model page) {
		page.addAttribute("username", name);
		page.addAttribute("color", color);
		return "HomePage.html";
	}
}
