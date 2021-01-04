package com.t5.daywrite.write;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WriteController {

	@Autowired
	WriteService service;
	//추가하기
	@RequestMapping("write/add.do")
	public String add(WriteVO vo, HttpSession session, Model model) {
		vo.setuID((String) session.getAttribute("uID"));
		int result = service.add(vo);

		if (result == 1) {
			List<WriteVO> list = service.list(vo);
			model.addAttribute("list", list);
			return "write/writeResult";
		} else {
			return "write/addFail";
		}
	}
	//삭제하기
	@RequestMapping("write/delete.do")
	public String delete(WriteVO vo, Model model, @RequestParam("addID") String addID) {
		vo.setAddID(Integer.parseInt((addID)));
		int result = service.delete(vo);

		if (result == 1) {
			List<WriteVO> list = service.list(vo);
			model.addAttribute("list", list);
		}
		return "write/writeResult";
	}
	//수정하기
	@RequestMapping("write/edit.do")
	public String update(WriteVO vo, Model model) {
		int result = service.update(vo);
		if (result == 1) {
			List<WriteVO> list = service.list(vo);
			model.addAttribute("list", list);
			System.out.println();
		}
		return "write/writeResult";
	}
	//하나 검색해서 수정화면(oneSearch)으로 전달 
	@RequestMapping("write/oneSearch.do")
	public void one(WriteVO vo, Model model) {
		WriteVO oneS = service.one(vo);
		if (oneS != null) {
			model.addAttribute("oneS",oneS);
		}
	}
}
