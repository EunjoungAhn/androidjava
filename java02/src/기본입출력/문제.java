package 기본입출력;

import javax.swing.JOptionPane;

public class 문제 {

	public static void main(String[] args) {
//1번문제
		//1. 데이터: 입력
		String num1 = JOptionPane.showInputDialog("1번문제: 첫번째 숫자");
		String num2 = JOptionPane.showInputDialog("1번문제: 두번째 숫자");
		//2. 처리
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		//3. 결과: 출력
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		
		System.out.println("---------------");
		
//2번문제
		for (int i = n1; i <= n2; i++) {
			System.out.println(i);
		}
		
		System.out.println("---------------");
		
//3번문제
		String num3 = JOptionPane.showInputDialog("3번문제: 첫번째 입력 숫자");
		String ch = JOptionPane.showInputDialog("3번문제: 두번째 입력 문자");
		
		int n3 = Integer.parseInt(num3);
		
		for (int i = 0; i < n3; i++) {
			System.out.print(ch);
		}
	}

}
