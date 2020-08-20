package 제어문;

import javax.swing.JOptionPane;

public class 가위바위보연습 {

	public static void main(String[] args) {
		String muk = JOptionPane.showInputDialog("전 바위만 낼겁니다.");
		String result = "";
		if(muk.equals("바위")){
			result = "의리가 있군요!";
		}else if (muk.equals("가위")) {
			result = "신뢰가 없어 졌어요!";
		}else if (muk.equals("보")){
			result = "와! 믿었는데 ㅠ.";
		}else {
			result = "가위 바위 보 하는 거에요!";
		}
		System.out.println(result);
	}

}
