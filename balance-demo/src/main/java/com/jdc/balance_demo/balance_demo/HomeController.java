package com.jdc.balance_demo.balance_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/home")
public class HomeController {
	
	@GetMapping
	String index() {
		return"home";
	}

}
