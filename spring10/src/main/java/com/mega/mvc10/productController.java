package com.mega.mvc10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class productController {
	@Autowired
	ProductService service;
	
	@RequestMapping("list.do")
	//변수명은 상관 없다.
	//현재 model이 2개 잡혀 있다.	//자동으로 넘김
	public void list2(Model model) {
		//수정으로 넘김
		List<ProductVO> list = service.list();
		model.addAttribute("list",list);
		//출력의 경우 views로 넘어간다.
	}
	
	@RequestMapping("one.do")
	//변수명은 상관 없다.
	//현재 model이 2개 잡혀 있다.	//자동으로 넘김
	public void one2(ProductVO productVO, Model model) {
		//수정으로 넘김
		ProductVO vo = service.one(productVO);
		model.addAttribute("vo",vo);
		//출력의 경우 views로 넘어간다.
	}
	
	@RequestMapping("create.do")
	//변수명은 상관 없다.
	public void create2(ProductVO productVO) {
		service.insert(productVO);
	}
	
	@RequestMapping("delete.do")
	public void delete(ProductVO productVO) {
		service.delete(productVO);
	}
	
	@RequestMapping("update.do")
	public void update(ProductVO productVO) {
		service.update(productVO);
	}
	
}
