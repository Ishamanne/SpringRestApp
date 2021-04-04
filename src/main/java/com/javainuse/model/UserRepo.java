package com.javainuse.model;
import javax.transaction.*;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface UserRepo extends JpaRepository<User,Long>, UserRepoCustom{
	
	

}
