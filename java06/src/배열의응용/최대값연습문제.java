package 배열의응용;

import java.util.Random;

public class 최대값연습문제 {

	public static void main(String[] args) {
		//랜덤 선언
		Random r = new Random();
		//배열 크기 설정
		int[] number = new int[1000];
		//배열 크기 만큼 랜덤 값 저장
		for (int i = 0; i < number.length; i++) {
			//랜던값 1000개로 설정 후 배열에 저장 반복
			number[i] = r.nextInt(1000)+1;//1~1000
		}
		//최소값을 구하기 위해 배열의 첫번째 인덱스를 저장
		int min = number[0];
		//최대값을 구하기 위해 배열의 첫번째 인덱스를 저장
		int max = number[0];

		for (int i = 0; i < number.length; i++) {

			System.out.println(i + "번째: " + number[i]);
			//최소값 비교
			if (min > number[i]) {
				min = number[i];
			}
			//최대값 비교
			if (max < number[i]) {
				max = number[i];
				System.out.println(i + "번째: " + number[i]);
			}

		}
		//최대값 갯수
		int count = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == max) {
				count++;
				System.out.println("-------------");
				System.out.println("최대값:" + max);
				System.out.println("최대값 의 위치: " + i);
			}
		}
		System.out.println("-------------");
		System.out.println("최소값:" + min);
		System.out.println("최소값 " + max + "의 개수: " + count);
	}
}
