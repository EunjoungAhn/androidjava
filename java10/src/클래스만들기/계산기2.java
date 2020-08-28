package 클래스만들기;

public class 계산기2 {
	//각 부품의 기능을 정의할 때는 메서드를 쓴다.
	//메서드에 입력값을 잠깐 저정할 용도로 선언된 변수, 메소드의 사용과 처리의
	//중간 다리역할을 변수: 매개변수(parameter, 파라메터)
	public void add(int x, int y) {//void == 없다.
		//x, y변수는 add메서드 ㅡ지역에서만 쑬 수 있는 지역변수
		//local 변수, 로컬변수
		//지역변수는 자동초기화가 안된다.
		int sum = x + y;//지역변수
		System.out.println("합은 " + sum);
	}
	
	public void minus() {//void == 없다.
		System.out.println("빼기 기능");
	}
	
	public int mul(int x, int y) {
		int result = x*y;
		return result; //3만원
		//return이랑 void는 같이 쓸 수 없다.
	}
	
	public void div() {
		System.out.println("나누기 기능");
	}

}
