package com.javainuse.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.javainuse.model.User;
import com.javainuse.model.UserRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@Controller
@Component
public class UserController {
	
	@Autowired
	UserRepo dao;
	
	
	@RequestMapping("/create")
	@ResponseBody
	public String save(String name,String email) {
		
		User user = new User();
		try {
		user.setUsername(name);
		user.setEmail(email);
		dao.save(user);
		}catch(Exception e) {
			
		}
		return "user created with id="+user.getId();
	}
	
	@RequestMapping("/users")
	@ResponseBody()
	public List<User> getUsers(){
		
		return dao.getusers();
	}
	
	@RequestMapping("/bymail")
	@ResponseBody
	public List<User> getByMail( String email){
		
		return dao.getUserByMail(email);
	}
	
	

}
