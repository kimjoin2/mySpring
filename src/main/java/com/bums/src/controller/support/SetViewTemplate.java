package com.bums.src.controller.support;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;

public class SetViewTemplate {
	
	public Map<String, String> map = new HashMap<String, String>(); 

	public SetViewTemplate() {
		String base = "templates/";
		map.put("head", base + "head.jsp");
		map.put("left", base + "left.jsp");
		map.put("center", base + "center");
		map.put("right", base + "right");
		map.put("bottom",  base + "bottom");
	}
	
	public void defaultViewTemplate(Model model) {
		
		
	}
}
