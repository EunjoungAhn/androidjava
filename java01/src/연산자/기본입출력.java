package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력 {
	public static void main(String[] args) {
// 자주 사용하는 것은 부품의 대문자를 그대로 쓴다!
//		특정한 일을 전담하는 부품을 만들어, 특정한 처리를 할때 
//		부품을 지정함.
//		JOptionPane 창을 띄워주는 역활을 한다.
		String name = JOptionPane.showInputDialog("당신의 이름은?");
		System.out.println("당신의 이름은: " + name);
		String age = JOptionPane.showInputDialog("당신의 나이는");
		//외부 입력(키보드로 데이터 타입)은 무조건 string 이다. 
		System.out.println("당신의 나이는: " + age);
		//String으로 저장된 데이터를 int/String 쓸지는 내가 결정!
		//계산의 유무에 따라 계산해야하는 경우는 int로 변환해주어야 함.
		//숫자로 바꿔보자!!
//		Integer.parseInt(age);//잠시 cup가 가지고 있다. 
		int age2 = Integer.parseInt(age);//그러므로 다시 저장해 준다.
		int lastAge = age2 - 1;
		System.out.println("당신의 작년 나이는" + lastAge);
		
//		기본 입출력 class의 실행 순서
//		1.name 이라는 String 타입의 변수명에 JOp로 받은 데이터를 저장한다.
//		2.그리고 pintln으로 이름을 출력한다.
//		3.age도 1번과 동일하게 String이라는 타입과 age라는 변수명에 JOp로 받아 데이터를 저장.
//		4.pintln으로 나이 출력한다.
//		5.int라는 타입과 age2라는 변수명에 age로 받은 String 데이터를 
//		잠시 Integer이라는 부품으로 cpu에서 잠시 가지고 age2에 저장.
//		6.lastAge에 age2 - 1;이라는 수식과 함께 저장.
//		7.println으로 lastAge 출력.
//		8.ctrl+ f11 out(출력) 결과 "당신의 이름은:" 과 "당신의 나이는:"을 사용자에게 입력 받고
//		사용자에게 받은 나이에서 -1을 한 값 또한 출력해준다.
	}
}



