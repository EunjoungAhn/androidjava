package com.mega.mvc07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	MemberDAO dao;
	//여기서는 넘겨지는 변수는 상관 없다.
	public void insert(MemberVO vo) {
		dao.insert(vo);
	}
	public void delete(MemberVO vo) {
		dao.delete(vo);
	}
	public void update(MemberVO vo) {
		dao.update(vo);
	}
	public MemberVO one(MemberVO vo) {
		return dao.one(vo);
	}
	public List<MemberVO> list() {
		return dao.list();
	}

}