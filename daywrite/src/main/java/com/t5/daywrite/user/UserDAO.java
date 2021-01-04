package com.t5.daywrite.user;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO implements UserInterface{

	@Autowired
	SqlSessionTemplate mybatis;
	
	@Override
	public int create(UserVO vo) {
		int result = mybatis.insert("user.create", vo);
		return result;
	}
	
	public UserVO checkId(UserVO vo) {
		UserVO userVO = mybatis.selectOne("user.checkId", vo);
		System.out.println("로그인 확인 값: "+userVO);
		return userVO;
	}
}
