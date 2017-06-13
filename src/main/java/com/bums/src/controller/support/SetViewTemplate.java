package com.bums.src.controller.support;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;

public class SetViewTemplate {
	
	private Map<String, String> map = new HashMap<String, String>(); 

	public SetViewTemplate() {
		String base = "templates/";
		map.put("head", base + "head.jsp");
		map.put("left", base + "left.jsp");
		map.put("center", base + "center.jsp");
		map.put("right", base + "right.jsp");
		map.put("bottom",  base + "bottom.jsp");
	}
	
	public void defaultViewTemplate(Model model) {
		
		model.addAllAttributes(map);
	}
}
