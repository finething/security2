package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.Service;
import data.User;


@Controller
public class Front {
	@Autowired
	private Service service;
	
	@RequestMapping("/")
	public String first(){
		return "start";
	}
	@RequestMapping("/authenticate")
	public String login(){
		return "authenticate";
	}
	
	@RequestMapping("/logedOut")
	public String logedOut(){
		return "logedOut";
	}

	@RequestMapping("/saveUser")
	public String saveUser(User user) {
		service.saveUser(user);
		return "start";
	}
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
