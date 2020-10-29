package com.mega.mvc04;
//객체만 생성하는 방법을 Factory법이라고 한다.
public class BeanFactory {
	public Object create(String name) {
		Object object = null;//지역 변수는 항상 초기화 시켜줘야 한다.
		if (name.equals("apple")) {
			object = new Apple();
		}else if(name.equals("banana")) {
			object = new Banana();
		}
		return object;
	}
}