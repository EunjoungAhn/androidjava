package 배열응용;

import java.util.Random;

public class 입력해서넣어보자3 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] data = new int[10];
		for (int i = 0; i < 10; i++) {
			data[i] = r.nextInt(100);
			//숫자를 출력해 주는 클라스 (범위) 범위를 적으면 그 사이의 숫자 값을 출력해 준다.
			}
		for (int x : data) {
			System.out.println(x);
		}
	}
}
