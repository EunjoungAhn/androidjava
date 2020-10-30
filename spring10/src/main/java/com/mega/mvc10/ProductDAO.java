package com.mega.mvc10;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ProductDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	public void insert(ProductVO vo) {
		mybatis.insert("product.insert", vo);
	}

	public int delete(ProductVO vo) {
		int result = mybatis.delete("product.delete", vo);
		System.out.println("result : " + result);
		return result;
	}

	public int update(ProductVO vo) {
		int result = mybatis.update("product.update", vo);
		System.out.println("result : " + result);
		return result;
	}

	public ProductVO one(ProductVO vo) {
		ProductVO vo2 = mybatis.selectOne("product.one", vo);
					//네임스페이스이름.id, 입력 param
		 return vo2;
	}
	
	public List<ProductVO> list() {
		List<ProductVO> list = mybatis.selectList("product.list");
		System.out.println("list size:" + list.size());
		return list;
	}
	
	
}
