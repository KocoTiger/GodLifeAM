package com.godlife.io.service.user;

import com.godlife.io.service.domain.User;

//==> 회원관리에서 CRUD 추상화/캡슐화한 DAO Interface Definition
public interface UserDao {
	
	// INSERT
	public void addUser(User user) throws Exception ;
	
	// SELECT ONE
		public User getUser(String userEmail) throws Exception ;

	


}
