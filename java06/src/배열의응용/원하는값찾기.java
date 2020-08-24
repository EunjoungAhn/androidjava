package 배열의응용;

import java.util.Random;

public class 원하는값찾기 {

	public static void main(String[] args) {
		Random r = new Random(42);//랜덤 안에 아무거나 넣으면
		//랜덤이 매번 같은 값이 나온다.
		int[] number = new int[1000];
		for (int i = 0; i < number.length; i++) {
			number[i] = r.nextInt(1000);//0~999
			System.out.println(i + "번째: " + number[i]);
		}
		int target = 100;
		int count = 0;
		for (int i = 0; i < number.length; i++) {
//			System.out.println(number[i] == target); true, false로 알기에는 의미가 없어서
			if (number[i] == target) {
				System.out.println(target + "의 위치는 " + i + "번째");
				count++;
			}
			
		}
		System.out.println(target + "의 개수는 " + count + "개수");
	}

}
