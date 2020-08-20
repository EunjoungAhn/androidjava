package 조건문;

import javax.swing.JOptionPane;

public class SwitchTest {

	public static void main(String[] args) {
		String food = JOptionPane.showInputDialog("머 먹을래요?");
		switch (food) {
		case "알밥":
			System.out.println("분식짐으로 가자!");
			break;
		case "자장면":
			System.out.println("국수집으로 가자!");
			break;
		case "냉면":
			System.out.println("중국집으로 가자!");
			break;
		default://if문의 else와 동일
			System.out.println("그냥 안먹을래요!");
			break;
		}
	}

}
