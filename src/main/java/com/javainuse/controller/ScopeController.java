package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javainuse.bean.Customer;

@Controller
@Component
public class ScopeController {
	
	@Autowired
	private Customer customer;
	
	@RequestMapping("/address")
	@ResponseBody
	public String address() {
		String result = customer.getAddress();
		customer.setAddress("EU");
		return "first data= "+result +" second data = "+customer.getAddress();
	}
	
	@RequestMapping("/addresscheck")
	@ResponseBody
	public String addresscheck() {
		return "check Data" + customer.getAddress();
		
	}
	
	@RequestMapping("/age")
	@ResponseBody
	public String age() {
		String result = customer.getAge();
		customer.setAge("25");
		return "init Data: " + result + "|-----| modified Data: " + customer.getAge();
	}
 
	@RequestMapping("/agecheck")
	@ResponseBody
	public String agecheck() {
		return "check Data: " + customer.getAge();
	}

}

