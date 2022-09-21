package com.example.atvalue.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebControllers {
	
	@Value("${root.html}")
	private String rootView;
	
	@GetMapping("/")
	public String getDashboard() {
		System.out.println("FROM application.properties YOU ARE GOING TO THIS HTML FILE: "+ rootView +".html");
		return "dashboard";
	}
	
}
