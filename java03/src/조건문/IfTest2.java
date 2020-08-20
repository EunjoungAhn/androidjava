package 조건문;

import javax.swing.JOptionPane;

public class IfTest2 {

	public static void main(String[] args) {
		//누적시키는 변수는 반복문안에 넣으면 안됨.
		//반복할 때마다 누적되지 않고, 초기화되기 때문에.!
		int countOk = 0, countNo = 0, countEtc =0;
		String ch = "";
		for (int i = 0; i < 5; i++) {
			String data = JOptionPane.showInputDialog("ok)긍정, no)부정, etc)기타");
			if (data.equals("ok")) {
				ch = "긍정";
				countOk++;
			} else if (data.equals("no")) {
				ch ="부정";
				countNo++;
			} else {
				ch ="잘모르겠어요.";
				countEtc++;
			}
			System.out.println(ch);
		}
		System.out.println("---총 횟수는?---");
		System.out.println("긍정 횟수: "+ countOk);
		System.out.println("부정 횟수: "+countNo);
		System.out.println("기타 횟수: "+countEtc);

	}

}
