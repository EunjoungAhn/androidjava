package 인터페이스;

import javax.swing.JOptionPane;

public class CookMain {
	//main에서는 따로 implements를 하지 않고 CookManager에서 만든 생성자에서
	//설정한 파라미터를 food로 받아서 CookManager생성자에서 if문으로
	//food가 equals와 같다면 if문 안의 생성자를 전역변수로 설정한 
	//cook에 자동 형변환으로 저장하여서 cook을 생성하여 부른
	//CookMain에서 ck로 객체 생성한 것을 koreanCook 과 IndoCook, ChineseCook클래스가
	//ICook로 부터 인터페이스 받아 메서드 설정한 것을
	//CookMain에서 불러서 사용할 수 있다.
	public static void main(String[] args) {
		String food = JOptionPane.showInputDialog("뭐드실래요? (한식 or 중식 or 인도)");
		CookManager ck = new CookManager(food);
		ck.food();
		ck.soup();
	}

}
