package 배열응용;

import java.util.Random;

public class 배열응용문제1 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] num = new int[100];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100);
			System.out.println(num[i]); 
		}
		System.out.println("첫번째 값: " + num[0] + " 마지막 값: " + num[99] + " 더한 값: " + num[0] + num[99]);
	}

}
