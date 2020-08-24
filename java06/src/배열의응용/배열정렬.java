package 배열의응용;

import java.util.Arrays;

public class 배열정렬 {

	public static void main(String[] args) {
		int[] 나이 = {100, 98, 33, 24, 10, 88, 23, 2, 278};
		//파괴함수 - ram에 저장되있는 값까지 바꾼다.
		Arrays.sort(나이);//배열 값 정렬하기
		for (int i : 나이) {
			System.out.print(i + " ");
		}
		System.out.println("\n---------");
		//비파괴함수 - cpu에서만 처리된다.
		//배열 복사할때는 clone()함수 사용!
		//깊은 복사, 배열은 깊은 복사를 해야 한다.
		int[] 나이2 = 나이.clone();//cpu에 있으므로 변수 선언을 해주어야 한다.
		나이2[0] = 999;
		for (int i : 나이) {
			System.out.print(i + " ");
		}
		System.out.println("\n---------");
		for (int i : 나이2) {
			System.out.print(i + " ");
		}
	}

}
