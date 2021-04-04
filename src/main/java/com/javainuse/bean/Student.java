package com.javainuse.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("student")
public class Student implements Person{

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return "Student";
	}
	
	

}
