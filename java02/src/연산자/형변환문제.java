package 연산자;

public class 형변환문제 {
	public static void main(String[] args) {
		byte x = 100;
		int y = x;
		
		System.out.println(x + y);
		//자동형변환
		//큰<-작은 공간에 가능 하기 때문에 출력 가능
		
		int x1 = 300;
//		byte y2 = x1;
		
//		System.out.println(x1 + y2);
		//작<-큰 공간에 들어가기엔 공간이 부족 
		//형변환 불가
		
		double x3 = 400; //8바이트
//		int y3 = x3;
		int y3 = (int)x3;
		
		System.out.println(x3 + y3);
		//강제형변환
		
		int x4 = 400;
		double y4 = x4;
		
		System.out.println(x4 + y4);
//		자동형변환
	}
}
