package 배열의응용;

import javax.swing.JOptionPane;

public class 배열final {

	public static void main(String[] args) {
		// 1번문제
		int[] num = { 10, 20, 30, 40, 50 };
		System.out.println("----1번문제-----");
		System.out.println("첫번째 값과 두번째 값 더한 값:" + (num[0] + num[1]));

		// 2번문제

		String[] lang = new String[3];
		for (int i = 0; i < 3; i++) {
			String put = JOptionPane.showInputDialog("java, spring, jsp를 입력해주세요.");
			lang[i] = put;
		}
		System.out.println("----2번문제-----");
		System.out.println(lang[0] + " 보다는 " + lang[1]);

		// 3번문제
		int[] num2 = { 11, 22, 33, 44 };
		for (int i = 0; i < num2.length; i++) {
			if (num2[i] == 33) {
				System.out.println("----3번문제-----");
				System.out.println(num2[i] + "의 위치는: " + (i + 1) + "번째");
			}
		}

		// 4번 문제
		int[] num3 = new int[5];
		for (int i = 0; i < num3.length; i++) {
			String put2 = JOptionPane.showInputDialog("숫자를 입력해주세요.");
			num3[i] = Integer.parseInt(put2);
		}
		System.out.println("----4번문제-----");
		for (int i : num3) {
			System.out.println(i);
		}

		// 5번 문제
		int[] num4 = { 66, 77, 88, 99 };
		int max = num[0];
		for (int i = 0; i < num4.length; i++) {
			if (max < num4[i]) {
				max = num4[i];
			}
		}
		System.out.println("----5번문제-----");
		System.out.println("최대값: " + max);

		// 6번 문제
		System.out.println("----6번문제-----");
		int[] num5 = { 66, 77, 88, 99 };
		int imsi = num5[0]; //imsi <-66
		num5[0] = num5[3]; //num5[0] <-99
		num5[3] = imsi; //num5[3] <-imsi
		for (int x : num5) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
