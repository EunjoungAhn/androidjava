package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TransactionController {
	
	@Autowired
	TransavtionService serivce;
	
	@RequestMapping("transaction.do")
	public void transaction(BbsVO2 bbsVO2, MemberVO memberVO, Model model) throws Exception{
		System.out.println("transaction controller call!!");
		System.out.println(bbsVO2);
		System.out.println(memberVO);
		int result = 0;
		try {
			result = serivce.tran(memberVO, bbsVO2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("결과 받은 값>>"+ result);
		if(result ==1) {
			model.addAttribute("result","모든 db처리 성공!! commit됨");
		}else {
			model.addAttribute("result","모든 db처리 중 에러가 발생!! rollback됨");
		}
	}
}
