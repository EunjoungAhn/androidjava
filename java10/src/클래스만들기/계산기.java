package 클래스만들기;

public class 계산기 {
	//각 부품의 기능을 정의할 때는 메서드를 쓴다.
	public int add(int n1, int n2) {
		int sum;
		sum = n1 + n2;
		return sum;
	}
	
	public void minus() {//void == 없다.
		System.out.println("빼기 기능");
	}
	
	public void mul() {
		System.out.println("곱하기 기능");
	}
	
	public void div() {
		System.out.println("나누기 기능");
	}

}
