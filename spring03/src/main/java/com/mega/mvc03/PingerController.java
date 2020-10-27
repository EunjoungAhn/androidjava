package com.mega.mvc03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

//일반 자바 파일: POJO (Plain Old Java Object)
//Controller기능을 가진 클래스로 만들고 싶으면, 상속!!
//@Controller 어노테이션을 쓰면, 내부적으로 벌어지는 일
//1) 상속
//2) 핸들러맵퍼에 키:값을 등록, 키:요청되는 주소, 값: 객체의 메서드

@Controller
public class PingerController {
	//컨트롤러에서 view까지 넘어가기 위한 항목:
	//1.view페이지 지정, 2.model의 속성갑
	//ModelnView 는 옛 버전 코드
	//5 버전에서는 view와 model을 따로 따로 넘긴다.
	@RequestMapping("pinger.do")
	//파라미터 이름을 다르게 하고 싶으면
	//public void pinger(@RequestParam("thanos") String tha) {
	public String pinger(String thanos, Model model) {
		System.out.println("먼지~~~가~~ 되어~~!"+thanos);
		model.addAttribute("thanos", thanos);
		return "img";
	}
	
}
