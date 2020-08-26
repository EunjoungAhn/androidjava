package 영화예매배열;

import java.util.Scanner;

public class 콘솔에서입력 {

	public static void main(String[] args) {
		//콘솔에서 입력: Scanner, 키보디에서 입력받기 위해 system.in
		//모든 입력의 데이터 타입은 String 이다!
		Scanner scan = new Scanner(System.in);//외부에ㅔ서 값 가져올때 쓰는 용.
		System.out.print("이름을 입력>> ");//ln을 지워주면 옆에서 적을 수 있다.
		String x = scan.next();//단어만 입력 받는다.
		System.out.println("이름: " + x);
		System.out.print("나이를 입력>> ");
		int y = scan.nextInt();
		System.out.println("내년 나이는 : " + y);
		
		System.out.print("현재키 입력>> ");
		double hieght = scan.nextDouble();
		System.out.println("현재 키 : " + hieght);
		
		System.out.print("밖에 비가 오나요? 입력>> ");
		boolean rain = scan.nextBoolean();
		if (rain) {
			System.out.println("우산을 가지고 가자");
		}else {
		System.out.println("우산을 놓고 가자");
		}
		System.out.print("당신의 목표는>>");
		scan.nextLine();
		String life = scan.nextLine();//엔터치기까지의 문장
		System.out.println("목표는 " + life);//엔터를 인식해 버려서 입력이 안된다.
	}

}
