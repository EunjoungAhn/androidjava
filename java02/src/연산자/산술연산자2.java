package 연산자;

public class 산술연산자2 {

	public static void main(String[] args) {
		int x = 200;
		int y = 100;
		//더해봅시다.
		int sum = x + y; //모든 연산자의 처리는 cpu가 한다.
		//자바에서는 int끼리의 계산은 무조건 int이다.
//		int div = y/x; // 0.5가 나와야 하는데..
		System.out.println("두 수의 합은" + sum);
		double div = y/x;
		System.out.println("두 수의 나누기는" + div);
//		8바이트 double <- 4바이트 int 더블이 더 크기때문에 자료형을 바꿔도 들어가긴 한다.
//		자바에서는 하나라도 double이면 무조건 double!
//		하나만 정수를 실수로 강제로 변환해서 계산시 사용할 수 있다.
		double div2 = (double)y / x;
		//(타입)변수 - 변수 앞에 ()가로를 넣고 형을 입력하면 강제 변형을 할 수 있다.
		//강제로 타입을 바꾸는 것: 타입변환(형변환)
		System.out.println("두 수의 나누기는" + div2);
		
		double div3 = (double)(y / x);//0으로 cpu에서 계산되고 다시 double에 넣어서 형변환을 해도 
//		이미 0값을 가지고 다시 소수점을 붙여도 0.0 으로 출력한다.
		System.out.println("두 수의 나누기는" + div3);
		
		
		
	}

}
