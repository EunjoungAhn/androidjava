package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {
		// ctrl + alt + 화살표아래: 한 줄 복사
		// alt + 화살표방향: 이동
		String num1 = JOptionPane.showInputDialog("첫번째 숫자를 입력해 주세요.");
		String num2 = JOptionPane.showInputDialog("두번째 숫자를 입력해 주세요.");
		int first = Integer.parseInt(num1);
		int second = Integer.parseInt(num2);
		int result = first + second;
		System.out.println("더한 값은: " + result);
	}

}
