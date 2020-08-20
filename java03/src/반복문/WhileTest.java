package 반복문;

import javax.swing.JOptionPane;

public class WhileTest {

	public static void main(String[] args) {
		//계속 반복하고자 하는 경우
		while(true) {
			System.out.println("내가 계속 돌아요.");
			String choice = JOptionPane.showInputDialog("계속 하실래요? y)yes or n)no");
			if(choice.equals("n") || choice.equals("no")) {
				System.out.println("프로그램 종료합니다.");
				System.exit(0);
				//break;
				//자기를 포함하는 while반복문을 종료, while 아래에 있는 것들은 계속 실행 
			}
		}
		//System.out.println("내가 실행될까요??");//위의 System.exit(0);때문에 프로그램 자체가 종료되기 때문에 에러가 발생.
		
		//위의 무한 반복이 멈추지 않아서 아래의 코드를 실행 하지 못해서 에러가 발생
		//위의 while문 주석 처리
		
		//제한된 횟수를 반복하고자 하는 경우
//		int i = 0;//시작값
//		while (i < 10) {//조건식
//			System.out.println("내가 10번 돌아요.");//실행내용
//			i++;
//		}
	}

}
