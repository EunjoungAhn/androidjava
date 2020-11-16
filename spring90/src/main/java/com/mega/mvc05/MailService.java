package com.mega.mvc05;

import javax.mail.internet.MimeMessage;
import org.aspectj.lang.annotation.Aspect;
import javax.servlet.http.HttpServletRequest;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Aspect
@Service("mail")

public class MailService {

	  @Autowired
	  private JavaMailSender mailSender;
	
	  // mailSending 코드
	  @RequestMapping(value = "/mail/mailSending", method = RequestMethod.POST)
	  public String mailSending2(JoinPoint joinPoint, Throwable ex) {
		  //signature 와 joinPoint는 짝궁이며, 에러포인트를 출력해서 보여주기 위해서 적용하는 것이다.
		  Signature signature = joinPoint.getSignature();
		  System.out.println(signature.getName());
		  System.out.println(signature.toString());
		  System.out.println("에러 정보: "+ ex.getMessage());
		  String body = signature.toString() + "\n"+"에러 정보: "+ex.getMessage();
	    try {
	      //MIMEMessage객체생성
	      MimeMessage message = mailSender.createMimeMessage();
	      //messager안에 값을 넣어야 하는데, vo같은 클래스 객체를 
	      MimeMessageHelper messageHelper 
	                        = new MimeMessageHelper(message, true, "UTF-8");
	      System.out.println("3-----------------------");
	      messageHelper.setFrom("aej9300@gmail.com");  // 보내는사람 생략하거나 하면 정상작동을 안함
	      messageHelper.setTo("aej9300@gmail.com");     // 받는사람 이메일
	      messageHelper.setSubject("서버에 문제 발생"); // 메일제목은 생략이 가능하다
	      messageHelper.setText("문제발생"+body);  // 메일 내용
	      mailSender.send(message);
	      System.out.println("메일을 보냈습니다.-----------------------");
	      
	    } catch(Exception e){
	      System.out.println("메일 보내는 중! 에러 발생!"+e);
	    }
	   
	    return "redirect:/mail/mailSending";
	  }

	
	  // mailSending 코드
	  @RequestMapping(value = "/mail/mailSending", method = RequestMethod.POST)
	  public String mailSending(HttpServletRequest request) {
	   
	    String setfrom = "aej9300@gmail.com";         
	    String tomail  = request.getParameter("tomail");     // 받는 사람 이메일
	    String title   = request.getParameter("title");      // 제목
	    String content = request.getParameter("content");    // 내용
	   System.out.println("2-----------------------");
	    try {
	      //MIMEMessage객체생성
	      MimeMessage message = mailSender.createMimeMessage();
	      //messager안에 값을 넣어야 하는데, vo같은 클래스 객체를 
	      MimeMessageHelper messageHelper 
	                        = new MimeMessageHelper(message, true, "UTF-8");
	      System.out.println("3-----------------------");
	      messageHelper.setFrom(setfrom);  // 보내는사람 생략하거나 하면 정상작동을 안함
	      messageHelper.setTo(tomail);     // 받는사람 이메일
	      messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
	      messageHelper.setText(content);  // 메일 내용
	      System.out.println("4-----------------------");
	      mailSender.send(message);
	      
	      System.out.println("5-----------------------");
	    } catch(Exception e){
	      System.out.println(e);
	    }
	   
	    return "redirect:/mail/mailForm";
	  }
}
