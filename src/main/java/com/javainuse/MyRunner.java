package com.javainuse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.javainuse.bean.Person;

@Component
public class MyRunner implements CommandLineRunner{

	@Autowired
	@Qualifier("student")
	Person p1;
	
	@Autowired
	@Qualifier("manager")
     Person p2;
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(p1.info());
		
		System.out.println(p2.info());
		
	}


}

