package com.t5.daywrite.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserDAO dao;
	
	public int create(UserVO vo) {
		return dao.create(vo);
	}
	
	public UserVO checkId(UserVO vo) {
		return dao.checkId(vo);
	}
	
}
