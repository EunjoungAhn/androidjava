package com.t5.daywrite.write;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WriteDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	//수입
	public int add(WriteVO vo) {
		int result = mybatis.insert("write.add", vo);
		return result;
	}
	//전체 불러오기
	public List<WriteVO> list(WriteVO vo){
	return mybatis.selectList("write.list", vo);
	}
	//삭제하기
	public int delete(WriteVO vo) {
		int result = mybatis.delete("write.delete", vo);
		System.out.println("result 삭제 되었습니다. : " + result);
		return result;
	}
	//수정하기
	public int update(WriteVO vo) {
		int result = mybatis.update("write.update", vo);
		System.out.println("result 수정되었습니다. : " + result);
		return result;
	}
	//하나 검색하여 수정페이지에 출력
	public WriteVO one(WriteVO vo) {
		WriteVO result = mybatis.selectOne("write.one", vo);
		System.out.println("수정 값 확인: "+ result);
		return result;
	}
}
