package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
	private LoggedUserManagementService loggedUserManagementService;
	
	private String username;
	private String password;
	
	public LoginProcessor(LoggedUserManagementService loggedUserManagementService) {
		this.loggedUserManagementService = loggedUserManagementService;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean login(){
		if (username.equals("natalie") && password.equals("password")) {
			loggedUserManagementService.setUsername(username);
			return true;
		} 
		else {
			return false;
		}
	}
	
	public void addUsername() {
		loggedUserManagementService.setUsername(this.getUsername());
	}
}
