package 조건문;

import javax.swing.JOptionPane;

public class 문제2번 {

	public static void main(String[] args) {
		//숫자 맞추는 문제
		int target = 88;//확정된 값을 맞추기 
		int nok = 0;//틀릿 횟수 카운터를 위한 변수 설정

		while (true) {//숫자를 계속 묻고 입력 받기 위한 무한 루프 설정
			String user = JOptionPane.showInputDialog("내가 숨긴 숫자를 맞춰주세요!");

			int me = Integer.parseInt(user);//숫자로 비교연산을 해야 하기 때문에 인트로 변경
			//틀린 횟수 변수
			//사용자의 답변과 기존의 데이터와 int == int 비교
			if (me == target) {//비교 연산자는 기본형 데이터만 사용할 수 있다.
				System.out.println("맞췄네요ㅠ.");
				System.out.println("나 안할래");
				System.exit(0);//답을 맞추었을때 시스템 종료
			} 
			else if (me < target) {
				System.out.println("틀렸어요~.");
				System.out.println("숫자가 작어여~~ Up Up.");
				nok++;//틀렸을때 횟수 증감
			} else if (me > target) {
				System.out.println("틀렸어요~.");
				System.out.println("숫자가 커여~~ Dwon Dwon.");
				nok++;//틀렸을때 횟수 증감
			}//else if
			System.out.println("틀린 횟수:" + nok);
		}//while
	}//main
}//class
