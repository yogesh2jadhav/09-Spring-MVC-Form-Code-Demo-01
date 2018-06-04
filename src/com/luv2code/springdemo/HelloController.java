package com.luv2code.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String mainMenu() {
		return "main-menu";
	}
	
	
	@RequestMapping("/showform")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/showPostForm2")
	public String processForm2() {
		return "helloworld-form2";
	}
	
	@RequestMapping("/useRequestnModel")
	public String processData2(HttpServletRequest httpServletRequest, Model model) {
		
		String theName = httpServletRequest.getParameter("studentName");
		String result = "Yooo!!!"+theName.toUpperCase();
		
		model.addAttribute("message",result);
		
		return "helloworld2";
	}

	
	@RequestMapping("/showPostForm3")
	public String processForm3() {
		return "helloworld-form3";
	}
	
	@RequestMapping("/usingAnnotation")
	public String processData4(@RequestParam("studentName") String theName, Model model) {
		
		//String theName = httpServletRequest.getParameter("studentName");
		String result = "Yooo I am using Annotation to read form data!!!"+theName.toUpperCase();
		
		model.addAttribute("message",result);
		
		return "helloworld3";
	}


	
}
