package com.t5.daywrite.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@Autowired
	UserService service;

	@RequestMapping("user/create.do")
	public String create(UserVO vo) {
		int result = service.create(vo);

		if (result == 1) {
			return "user/registerSuccess";
		} else {
			return "user/registerFail";
		}
	}
	
	@RequestMapping("user/checkId.do")
	public String read(UserVO vo, HttpSession session) {
		UserVO userVO = service.checkId(vo);
		if (userVO != null) { 
			// 로그인 후 세션 잡기
			session.setAttribute("uID", userVO.getuID());
			return "redirect:../write/add.jsp";
		}
		return "redirect:../index.jsp";
	}
}
