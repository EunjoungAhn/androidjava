package 클래스사용하기;

import 클래스만들기.계산기;

public class 집에서계산기사용 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.add(1, 2);
		//add()를 쓰면, 더하기 기능이 실행
		//메서드 쓰는 것을 메서드 호출(call, 부른다.)
		System.out.println(cal.add(5, 5));
	}

}
