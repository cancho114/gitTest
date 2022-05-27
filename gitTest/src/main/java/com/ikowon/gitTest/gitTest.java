package com.ikowon.gitTest;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class gitTest {

	@RequestMapping(value = "/test")
	public String home(Locale locale, Model model) {
		System.out.println("1");
		
		
		System.out.println("1");
		return "test";
	}
	
}
