package com.javainuse.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("manager")
public class Manager implements Person{

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return "Manager";
	}

}
