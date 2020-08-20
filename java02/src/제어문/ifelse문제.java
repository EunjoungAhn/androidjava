package 제어문;

import javax.swing.JOptionPane;

public class ifelse문제 {

	public static void main(String[] args) {
		//입력
		String food = JOptionPane.showInputDialog("먹고 싶은 음식?");
		//처리
		String result = "";//이렇게 하는 것이 코드를 반복하는 것 보다 좋다.
		if (food.equals("아이스크림")) {
			result = "뚜레주르로 가요";
		} else if (food.equals("아이스커피")) {
			result = "이디야로 가요";
		} else {
			result = "다른 것이면 물 마셔요";
		}
		//출력
		System.out.println("다른 것이면 물 마셔요");
	}

}
