
package com.javainuse.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Address {
	
	private String address ="US";

public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

public Address(String ad) {
	this.address = ad;
	System.out.println("new Address "+ this.address);
}

@Override
public int hashCode() {
//	final int prime = 31;
//	int result = 1;
//	result = prime * result + ((address == null) ? 0 : address.hashCode());
//	return result;
	return 1;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Address other = (Address) obj;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	return true;
}




}

