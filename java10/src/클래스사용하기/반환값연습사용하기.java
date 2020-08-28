package 클래스사용하기;

import java.util.Date;
import java.util.Random;

import DB연결.반환값연습;

public class 반환값연습사용하기 {

	public static void main(String[] args) {
		반환값연습	re = new 반환값연습();
		
		System.out.println(re.add(2,3));
		System.out.println(re.add(2.2,3));

		int[] result = re.num(100);
		for (int i : result) {
			System.out.println(i);
		}
		
		System.out.println(re.add("스트링", 3));

		Date date = re.add();
		System.out.println(date.getDate());
		System.out.println(date.getHours());
		
		
		int r = re.ran();
		System.out.println(r);
	}

}
