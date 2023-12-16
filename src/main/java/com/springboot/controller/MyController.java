package com.springboot.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	// @RequestMapping(value = "/about", method = RequestMethod.GET)   : Old Code

	@SuppressWarnings("deprecation")
	@GetMapping("/about")
	public String about(Model model) {
		System.out.println("Insite about handler");
		// putting data in model
		model.addAttribute("name", "Istkaar Ali");
		model.addAttribute("currentDate", new Date().toLocaleString());
		return "about";
		// about.html
	}
	
	
	 
	// Handling Iteration
	@GetMapping("/example-loop")
	public String iterateHandler(Model m) {
		// send
		// create a list, set collection
		List<String> names = List.of("Ankit", "Laxmi", "Karan", "John");
		
		m.addAttribute("names", names);
		return "iterate";
	}
	
	
	
	
	// Conditional Statements
	@GetMapping("/condition")
	public String condtions(Model m) {
		
		System.out.println("Conditional handler executed...");
		
		m.addAttribute("isActive", true);
		m.addAttribute("gender", "M");
		
		List<Integer> list = List.of(257,174,368,487,12,45,6);
		m.addAttribute("mylist", list);
		return "condition";
	}
	
	
	
	
	
	// handler for including fragments
	@GetMapping("/service")
	public String serviceHandler(Model m) {
		m.addAttribute("title","I like to eat samosa");
		m.addAttribute("subtitle", LocalDateTime.now().toString());
		return "service";
	}
	
	
	
	// for new about
	@GetMapping("/newabout")
	public String newabout() {
		return "aboutnew";
	}
	
	
	
	// for contact 
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
}
