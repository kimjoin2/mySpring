package com.bums.src.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bums.src.controller.support.SetViewTemplate;
import com.bums.src.dto.UserDTO;

@Controller
public class Join {

	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String joinPage(Model model) {
		
		model.addAttribute("user", new UserDTO());
		
		return new SetViewTemplate().setViewTemplate(model,"join.jsp");
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String joinUser(Model model, @ModelAttribute UserDTO user) {
		
		System.out.println(user.toString());
		
		return new SetViewTemplate().defaultViewTemplate(model);
	}
}
