package com.mega.mvc05;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	@Autowired
	BbsService service;
	
	@RequestMapping("delete.do")
	public void delete(BbsVO bbsVO) {
		//db처리하고
		//views로 넘어간다!!
		
	}
	
	@RequestMapping("update.do")
	public void update(Model model) {
		//db처리가 들어가야 하는 경우 반드시 controller를 거쳐야 한다.
		//db검색해서 가지고 온다.
		//검색한 결과를 views에 있는 update.jsp로 넘겨야함.
		//model.addAttribute("result", "검색한 결과");
	}
	
	@RequestMapping("insert.do")
	//클래스를 만들고 모델로 등록을 위해서는
	//클래스 이름의 첫 글자를 소문자로 바꾸면
	//자동으로 모델을 만들어 등록시켜 준다.
	                  //BbsVO bbsVO 프로토타입
	public void insert(BbsVO bbsVO, HttpSession session) {
	//입력값으로 vo를 설정하는 경우 
	//1)객체생성: prototype방법
	//2)input의 name속성과 동일한 set메서드를 자동으로 호출
	//3)변수이름을 클래스이름의 첫글자를 소문자로 지정하는 경우
	//자동으로 vo를 model의 속성으로 지정
	//views의 아래 jsp파일에서 model속성값을 꺼내 쓸 수 있다.
		System.out.println(bbsVO.getNo());
		System.out.println(bbsVO.getTitle());
		System.out.println(bbsVO.getContent());
		System.out.println(bbsVO.getWriter());
		
		//model은 한번의 request당 response를 하고 사라진다.
		//여러번의 request마다 특정한 값을 유지하고 사용하고 싶으면
		//session으로 설정해야 한다.
		session.setAttribute("bbsVO2", bbsVO);
		service.create(bbsVO);
	}
}
