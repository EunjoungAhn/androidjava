package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AOPController implements AOPInterface {
	
	@Autowired
	ASite a;
	
	@Autowired
	BSite b;
	
	@Override
	@RequestMapping("a.do")
	public void aop1() {
		a.person();
	}
	
	@Override
	@RequestMapping("b.do")
	public void aop2() {
		b.bucket();
		b.choice();
	}
}
