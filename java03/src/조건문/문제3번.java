package 조건문;

import javax.swing.JOptionPane;

public class 문제3번 {

	public static void main(String[] args) {
		// 은행 입출금 시스템 문제

		int money = 0;//모든 돈 입출입 잔고를 입력하기 위한 변수
		System.out.println("===은행 입출금 시스템===");

		while (true) {
				//사용자에게 무엇을 할지 먼저 입력받기
				String bank = JOptionPane.showInputDialog("1)입금, 2)출금, 3)잔고, 4)종료");
				int bankS = Integer.parseInt(bank);//Sting을 숫자로 더하기 위해 int 로 변경
			//사용자의 입력에서 입력 값에 따라 비교 확인
			if (bankS == 1) {
				String bank1 = JOptionPane.showInputDialog("입금액 입력");
				int pushS = Integer.parseInt(bank1);//입급액 을 int로 변환하기
				money += pushS;//사용자에게 받은 금액 대입
				System.out.println("입금액은: " + money + "원");
			}
			if (bankS == 2) {
				String bank1 = JOptionPane.showInputDialog("출금액 입력");
				int pushS = Integer.parseInt(bank1);//출금액 을 int로 변환하기
				money -= pushS;//사용자에게 받은 금액 money에서 빼서 대입
				System.out.println("출금액은: " + pushS + "원");
			}
			if (bankS == 3) {//사용자에게 현재금액 money로 출력하기
				System.out.println("잔고는: " + money + "원");
			}
			if (bankS == 4) {//시스템 종료
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			}
		}
	}

}
