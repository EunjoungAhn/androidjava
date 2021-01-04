package com.t5.daywrite.write;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WriteService {

	@Autowired
	WriteDAO dao;
	//추가
	public int add(WriteVO vo) {
		return dao.add(vo);
	}
	//리스트 검색
	public List<WriteVO> list(WriteVO vo){
		return dao.list(vo);
	}
	//삭제
	public int delete(WriteVO vo) {
		return dao.delete(vo);
	}
	//수정
	public int update(WriteVO vo) {
		return dao.update(vo);
	}
	//하나 검색
	public WriteVO one(WriteVO vo) {
		return dao.one(vo);
	}
}
