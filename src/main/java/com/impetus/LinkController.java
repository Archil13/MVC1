package com.impetus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LinkController {

	@RequestMapping("/add") 
	public String add()
	{
		System.out.println("asdsa'd'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		return "display.jsp"; 
	}
}
