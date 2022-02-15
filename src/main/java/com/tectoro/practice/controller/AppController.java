package com.tectoro.practice.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tectoro.practice.Business_Class;
import com.tectoro.practice.ModelClass;

@Controller
public class AppController
{
	@RequestMapping("/test")
	public String welcome()
	{
		System.out.println("AppController ----> welcome()");
		
		return "index";
	}
	
	public String listContact(ModelClass cls)
	{
		Business_Class b = new Business_Class();
		List<ModelClass> model = b.getContactList();
		cls.addAttribute("contacts", model);
		return "contacts";
		
	}

}
