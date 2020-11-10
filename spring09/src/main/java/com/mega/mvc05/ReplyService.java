package com.mega.mvc05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//컨트롤러에서 db로 넘어가기전/결과값 가지고 와서
//중간에 처리해야하는 부분: 비즈니스 층(business layer)
@Service
public class ReplyService {
	
	@Autowired
	ReplyDAO dao;
	
	public int delete(ReplyVO vo) {
		return dao.delete(vo);
	}
	
	//여기의 파라미터 이름은 상관없다.
	public int create(ReplyVO vo) {
		return dao.create(vo);
	}
	
	public List<ReplyVO> list(int original) {
		return dao.list(original);
	}
}
