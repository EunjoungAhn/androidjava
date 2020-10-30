package com.mega.mvc07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
		
		@Autowired
		MemberService service;
		
		@RequestMapping("list2.do")
		//변수명은 상관 없다.
		//현재 model이 2개 잡혀 있다.	//자동으로 넘김
		public void list2(Model model) {
			//수정으로 넘김
			List<MemberVO> list = service.list();
			model.addAttribute("list",list);
			//출력의 경우 views로 넘어간다.
		}
		
		@RequestMapping("one2.do")
		//변수명은 상관 없다.
		//현재 model이 2개 잡혀 있다.	//자동으로 넘김
		public void one2(MemberVO memberVO, Model model) {
			//수정으로 넘김
			MemberVO vo = service.one(memberVO);
			model.addAttribute("vo",vo);
			//출력의 경우 views로 넘어간다.
		}
		
		@RequestMapping("create2.do")
		//변수명은 상관 없다.
		public void create2(MemberVO memberVO) {
			service.insert(memberVO);
		}
		
		@RequestMapping("delete.do")
		public void delete(MemberVO memberVO) {
			service.delete(memberVO);
		}
		
		@RequestMapping("update.do")
		public void update(MemberVO memberVO) {
			service.update(memberVO);
		}
}