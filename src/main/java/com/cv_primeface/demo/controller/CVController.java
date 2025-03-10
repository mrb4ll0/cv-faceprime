package com.cv_primeface.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cv_primeface.demo.model.CV;
import com.cv_primeface.demo.service.CVService;
@Controller
public class CVController 
{
	@Autowired
	private CVService cvService;
	@GetMapping
	public String getCv(Model model)
	{
		String name = "Muhammad Ballo Ismail";
		String title ="Job Application";
		String email = "im511569@gmail.com";
		List<String> skills = Arrays.asList("Java Backend Developer", "Flutter Developer");
		 cvService.createCV(name, title, email, skills);
		 CV cv = cvService.findCVById(name);
		  model.addAttribute("title",cv.getTitle());
		  model.addAttribute("name",cv.getName());
		  model.addAttribute("email",cv.getEmail());
		  model.addAttribute("skills",cv.getSkills());
		  System.out.println("getCv get called");
		 return "cv";
		
	}

}
