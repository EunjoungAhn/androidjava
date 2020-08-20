package 조건문;

import javax.swing.JOptionPane;

public class 사원번호문제 {

	public static void main(String[] args) {
		String company = JOptionPane.showInputDialog("사원 번호를 입력해 주세요.");
		char depart = company.charAt(0);
		String employee = company.substring(1);
		String department = "";
		switch (depart) {
		case 'A':
			department = "기획부";
			break;
		case 'B':
			department = "총무부";
			break;
		case 'C':
			department = "개발부";
			break;
		default:
			System.out.println("저희 회사 사람이 아니군요.");
			break;
		}
		System.out.println("사원부서는 " + department + "입니다.");
		System.out.println("사원고유번호는 " + employee + "입니다.");
	}

}
