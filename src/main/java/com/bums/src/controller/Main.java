package com.bums.src.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bums.src.controller.support.SetViewTemplate;
import com.bums.src.dto.UserDTO;
import com.mysql.jdbc.Driver;

@Controller
public class Main {
	
	@Autowired SqlSessionTemplate sqlSession;
	
	@RequestMapping(value="/template", method=RequestMethod.GET)
	public String main(Model model) {
		
		sqlSession.insert("insertUser", new UserDTO("id", "pw"));
		
		new SetViewTemplate().defaultViewTemplate(model);
		return "template";
	}
}

