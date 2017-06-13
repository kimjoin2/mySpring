package com.bums.src.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bums.src.controller.support.SetViewTemplate;

@Controller
public class Main {
	
	@RequestMapping(value="/template", method=RequestMethod.GET)
	public String main(Model model) {
		new SetViewTemplate().defaultViewTemplate(model);
		return "template";
	}
}

