package com.mega.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	//자동으로 service를 찾아와서 주소값을 service에 저장해줘.
	//3차 코드 수정 = 효율이 좋은 코드
	@Autowired
	MovieService service;
	
	@RequestMapping("check.do")
	public String check(String check, Model model) {
		String[] values = service.idcheck(check);
		model.addAttribute("check", values[0]);
		return values[1];
	}
	
	@RequestMapping("reply.do")
	public void reply(String reply, Model model) {
		//db처리했음.
		//views로 넘어감.
		model.addAttribute("reply", reply);
	}
	
	@RequestMapping("movie.do")
	public String movieLike(String title, int money, Model model, MovieService check) {
	//객체를 클라인언트 마다 만들어줘서 좋은 코드는 아니다.
		//2차 코드 개선
		//public String movieLike(String title, int money, Model model, MovieService check) {
		//int distcount = check.check(money);
			//1차 코드
			//MovieService count = new MovieService();
			//int distcount = count.check(money);
			
			int distcount = check.check(money);
			model.addAttribute("title", title);
			model.addAttribute("money", distcount);
		return "like";
	}
}