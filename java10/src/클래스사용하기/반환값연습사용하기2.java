package 클래스사용하기;

import java.util.Date;
import java.util.Random;

import DB연결.반환값연습;

public class 반환값연습사용하기2 {

	public static void main(String[] args) {
		//어떤 기준으로 나누고 싶을때  .split으로 뽑으면 된다.
		String data = "나는 자바 프로그래머 정말";
		String[] dataset = data.split(" ");
		//{"나는","자바","프로그래머","정말"}
		System.out.println("배열의 총 길이는: " + dataset.length);
		for (String s : dataset) {
			System.out.println(s);
		}
		
		System.out.println("--------------");
		
		String data2 = "010-000-1234";
		String[] dataset2 = data2.split("-");
		//{"나는","자바","프로그래머","정말"}
		System.out.println("배열의 총 길이는: " + dataset2.length);
		for (String s : dataset2) {
			System.out.println(s);
		}
		
		System.out.println("--------------");
		
		//어떤 글자를 기준으로 뽑고 싶을때
		String data3 = "A1가";
		char[] dataset3 = data3.toCharArray();
		for (char c : dataset3) {
			System.out.println(c);
		}
		
		System.out.println("--------------");
		System.out.println(dataset3[0]);
	}

}
