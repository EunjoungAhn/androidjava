package com.mega.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("insert.do")
	public void member(String id, String pw, Model model) {
		System.out.println("컨트롤러에서 받은 id:"+id);
		System.out.println("컨트롤러에서 받은 pw:"+pw);
		
		String result = "로그인 실패!!";
			if(id.equals("root")&& pw.equals("1234")){
				result = "로그인 성공!";
			}
			model.addAttribute("result", result);
	}
}
