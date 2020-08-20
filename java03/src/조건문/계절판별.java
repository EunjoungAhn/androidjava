package 조건문;

import javax.swing.JOptionPane;

public class 계절판별 {

	public static void main(String[] args) {
		String user = JOptionPane.showInputDialog("계절을 입력해주세요.");
		int month = Integer.parseInt(user);
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("이상한거 찍지 마세요");
			break;
		}
	}

}
