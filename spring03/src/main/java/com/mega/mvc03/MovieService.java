package com.mega.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//@Service 추가하면 이렇게 하면 싱글톤으로 만들어 준다.
@Service
public class MovieService {
	
	@Autowired
	MemberDAO dao;
	
	public String[] idcheck(String check) {
		//db처리했음.
				//views로 넘어감.
				String[] id = {"root", "admin", "apple", "melon", "mint"};
				//List<String> list = Arrays.id(id);
				//if(list.contains(id))
				String result ="사용가능한 아이디 입니다.";
				String page = "ok";
				for (int i = 0; i < id.length; i++) {
					if (check.equals(id[i])){
						//result = "<font color='red'>중복된 아이디 입니다.</font>";
						result = "중복된 아이디 입니다.";
						page = "no";
					}
				}
				String[] values = {result, page};
				return values;
	}
	
	public int check(int money) {
		int discount = 0;
		if (money > 10000) {
			discount = money - 9000;
		}
		return discount;
	}
}