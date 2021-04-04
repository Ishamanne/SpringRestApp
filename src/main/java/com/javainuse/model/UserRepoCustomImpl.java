package com.javainuse.model;
import javax.persistence.EntityManager;
import javax.transaction.*;
import org.springframework.stereotype.*;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import java.util.List;

@Repository
@Transactional
public class UserRepoCustomImpl implements UserRepoCustom{

	@PersistenceContext
	EntityManager entitymanager;
	
	
	@Override
	public List<User> getUserByMail(String mail) {
		// TODO Auto-generated method stub
		Query query = entitymanager.createNativeQuery("select * from user where email = "+ mail,User.class);
		
		return query.getResultList();
	}

	@Override
	public List<User> getusers() {
		Query query = entitymanager.createNativeQuery("select * from user",User.class);
		// TODO Auto-generated method stub
		return query.getResultList();
	}
	
	
	

}

