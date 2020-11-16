package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AOPController {

	@Autowired
	AOPService service;
	
	@RequestMapping("aopError.do")
	public void aop() {
		try {
			service.error();
		} catch (Exception e) {
			
		}

	}
}
