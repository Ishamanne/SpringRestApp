package com.javainuse;

import java.util.Arrays;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.javainuse.bean.Address;
import com.javainuse.bean.Address1;
import com.javainuse.bean.Age;

@SpringBootApplication
@ComponentScan({"com.javainuse.controller","com.javainuse.bean","com.javainuse.model" })
public class SpringBootExample4Application {
	private static final Logger LOGGER = LogManager.getLogger(SpringBootExample4Application.class);

	public static void main(String[] args) {
		
		Address a1= new Address("city");
//		Address a3 = new Address("city");
		Address1 a2 = new Address1("city");
		Age age = new Age();
		
		
		HashMap<Object,Object> map = new HashMap<>();
		map.put(a1, a1);
		map.put(a2, a2);
		//Address a3 =(Address) map.get(a1);
		//	System.out.println(a3.getAddress())	;
			System.out.println("map sizem "+map.size());
			System.out.println(map);
		SpringApplication.run(SpringBootExample4Application.class, args);
		
		LOGGER.info("Info level log messages");
		LOGGER.debug("Debug level log messages");
//		LOGGER.error("Error level log messages", new NullPointerException("NullError"));
	}

}



;;