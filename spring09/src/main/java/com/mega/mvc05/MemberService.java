package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	MemberDAO dao;
	
	//set메서드를 만들어라.
	public void create(MemberVO vo) {
		dao.insert(vo);
	}
}