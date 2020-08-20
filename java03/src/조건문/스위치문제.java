package 조건문;

import javax.swing.JOptionPane;

public class 스위치문제 {

	public static void main(String[] args) {
		String user = JOptionPane.showInputDialog("계절을 입력해주세요.");
		int month = Integer.parseInt(user);
		switch (month) {//정수 (byte,short,int)
						//실수는 x
						//문자, 문자열(String) 까지 쓸 수 있다.
		case 2:
			System.out.println(user + "월" + "28일까지 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(user + "월" + "30일 까지 입니다.");
			break;
		case 1:
		case 3:
		case 10:
		case 12:
			System.out.println(user + "월" + "31일 까지 입니다.");
			break;
		default:
			System.out.println("이상한거 찍지 마세요");
			break;
		}
	}

}
