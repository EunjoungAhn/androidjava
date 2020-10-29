package com.mega.mvc04;

public class BeanUse {
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		Apple Object =  (Apple)factory.create("apple");
	}
}