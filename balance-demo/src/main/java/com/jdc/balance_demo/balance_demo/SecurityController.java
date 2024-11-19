package com.jdc.balance_demo.balance_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SecurityController {
	
	@GetMapping("signin")
	public void LoadSignIn() {
		
	}
	
	@PostMapping("signin")
	public String signin() {
		return"redirect:/";
	}
	
	@GetMapping("signup")
	public void LoadSignUp() {
		
	}
	
	@PostMapping("signup")
	public String signUp() {
		return"redirect:/";
	}
	
	@GetMapping("signout")
	public String signOut() {
		return"redirect:/signin";
	}
	
	@PostMapping("user/changepass")
	public String changePass() {
		return "redirect:/";
	}

}
