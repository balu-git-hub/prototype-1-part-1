package com.prototype1.part1;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/go_to_register")
	public String showForm(Model model) {
		System.out.println("going to registartion");
		UserDetails user = new UserDetails();
		model.addAttribute("user",user);
		return "userDetails";
	}
	
	@PostMapping("/register")
	public String  showDetails(@Valid @ModelAttribute("user") UserDetails user, 
			BindingResult bindingResult) {
		
		System.out.println(user);
		if (bindingResult.hasErrors()) {
			return "userDetails";
		}
		
			return "regSuccess";
		
	}
}
