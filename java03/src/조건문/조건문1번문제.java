package 조건문;

import javax.swing.JOptionPane;

public class 조건문1번문제 {

	public static void main(String[] args) {
		//사칙연산을 숫자를 사용자에게 받고 사칙할 것 또한 입력 받는다.
		String num1 = JOptionPane.showInputDialog("첫번째 숫자를 입력해 주세요.");
		String num2 = JOptionPane.showInputDialog("두번째 숫자를 입력해 주세요.");
		String ch = JOptionPane.showInputDialog("+,-,/,* 중 선택해주세요.");
		int num3 = Integer.parseInt(num1);//사칙연산을 위해 Strin을 int로 변경
		int num4 = Integer.parseInt(num2);//사칙연산을 위해 Strin을 int로 변경
		int sum = 0;//합계를 위해 sum이라는 변수를 추가

		if (ch.equals("+")) {//ch= '+' 인지를 확인하는 비교값
			sum = num3 + num4;//맞으면 더하여서 sum에 넣고 
		}
		
		if (ch.equals("-")) {//ch= '-' 인지를 확인하는 비교값
			sum = num3 - num4;//맞으면 빼서 sum에 넣고 
		}
		
		if (ch.equals("/")) {//ch= '/' 인지를 확인하는 비교값
			sum = num3 / num4;//맞으면 나누어서 sum에 넣고 
		}
		
		if (ch.equals("*")) {//ch= '*' 인지를 확인하는 비교값
			sum = num3 * num4;//맞으면 곱하여서 sum에 넣고 
		}
		System.out.println("첫번째 숫자: " + num1);//sum을 출력
		System.out.println("두번째 숫자: " + num2);//sum을 출력
		System.out.println("사칙연산한 값: " + sum);//sum을 출력
	}
}
