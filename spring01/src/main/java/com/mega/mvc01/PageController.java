package com.mega.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	//받는 메서드를 만들어줘야 한다.
	//2.컨트롤러에서 받아주고
	@RequestMapping("page2.mega")
	//request.getParameter를 자동으로 받아 준다.
	//메서드의 이름은 상관없다.
	public void page2(String id, String pw) {
		System.out.println("이 메서드가 자동 호출됨");
		System.out.println("컨트롤러에서 받은 id:"+id);
		System.out.println("컨트롤러에서 받은 pw:"+pw);
		//3.DAO 객체써서 db처리
		    String result = "로그인 실패!!";
			if(id.equals("root")&& pw.equals("1234")){
				result = "로그인 성공!";
			}
		//4.처리 결과를 가지고 jsp페이지로 간다.
	}
}
