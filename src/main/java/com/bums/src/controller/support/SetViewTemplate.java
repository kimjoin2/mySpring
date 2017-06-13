package com.bums.src.controller.support;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;

public class SetViewTemplate {
	
	private Map<String, String> map = new HashMap<String, String>(); 

	private String base;
	private String centers;
	
	public SetViewTemplate() {
		base = "templates/";
		centers = "centers/";
		map.put("head", base + "head.jsp");
		map.put("left", base + "left.jsp");
		map.put("center", base + "center.jsp");
		map.put("right", base + "right.jsp");
		map.put("bottom",  base + "bottom.jsp");
	}
	
	public String defaultViewTemplate(Model model) {
		model.addAllAttributes(map);
		return "template";
	}
	
	public String setViewTemplate(Model model, String centerJSP) {
		map.replace("center", base + "center.jsp", centers + "join.jsp");
		model.addAllAttributes(map);
		return "template";
	}
}
