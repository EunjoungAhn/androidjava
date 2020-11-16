package com.mega.mvc05;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class MailController {
 
  @Autowired
  MailService service;
 
  // mailSending 코드
  @RequestMapping(value = "/mail/mailSending", method = RequestMethod.POST)
  public void mailSending(HttpServletRequest request) {
	  service.mailSending(request);
  }
} 