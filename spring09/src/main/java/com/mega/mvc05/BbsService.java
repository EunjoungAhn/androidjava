package com.mega.mvc05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BbsService {
	
	@Autowired
	BbsDAO dao; //전역변수
	
	public BbsVO one(BbsVO vo) {
		return dao.select(vo);
	}
	
	//전역변수의 주소/값을 넣는 방법
	//1. 파라메터 있는 생성자를 사용해라.
	/*
	 * public void BbbService(BbsDAO dao) { this.dao = dao; }
	 */
	//2. set메서드를 만들어라.
	public void setDao(BbsDAO dao) {
		this.dao = dao;
	}
	
	public void create(BbsVO vo) {
		dao.insert(vo);
	}
	
	public List<BbsVO> list(){
		return dao.list();
	}
}
