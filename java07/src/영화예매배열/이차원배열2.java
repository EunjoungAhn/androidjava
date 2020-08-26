package 영화예매배열;

import java.util.Scanner;

public class 이차원배열2 {

	public static void main(String[] args) {
		// 콘솔에 입력받을 부품 설정
		Scanner sc = new Scanner(System.in);
		// 이중배열 셋팅 [행][열]
		int[][] seat = new int[3][10];
		// 행에 알파벳 표기를 위한 배열 변수 선언
		String[] row = { "a", "b", "c" };
		// 열을 입력 받기위한 변수 선언
		int col = 0;
		// 입력을 반복적으로 받기위한 무한 반복문 설정
		while (true) {
			// 상단 콘솔 ui
			System.out.println("--------------------------------");
			System.out.print(" ");
			// 열을 표기하기 위한 반복문 설정
			for (int i = 0; i < 10; i++) {
				System.out.print(i + "열 ");
			}
			System.out.println();
			System.out.println("--------------------------------");
			// 이중배열 틀을 만들기 위한 이중 for문 작성
			for (int i = 0; i < seat.length; i++) { // 행의 개수
				// 좌측 a~c행을 표기하기 위한 반복문
				System.out.print(row[i]);

				for (int j = 0; j < seat[i].length; j++) {// 열의 개수
					// seat[i](3)행 만큼 반복하며 seat[j](10)만큼 열을 반복
					// int배열의 초기값이 0임으로 모든 행과 열을 출력한다.
					System.out.print(" " + seat[i][j] + " ");
				}
				System.out.print("행");
				System.out.println();
			}
			// 행을 입력받기 위한 scanner
			System.out.print("'행'을 입력해주세요.>>");
			// 입력 받은 값을 row에 저장
			String rowInput = sc.next();
			// 열을 입력받기 위한 scanner
			System.out.print("'열'을 입력해주세요.>>");
			// 입력 받은 값을 col에 저장
			col = sc.nextInt();
			//Strigng으로 받은 rowinpt을 숫자로 확인하여 비교 후 저장하기 위한 변수 선언
			int rowInputChange = 0;
			// row만 받아도 종료 될 수 있도록 row밑에 바로 조건문 위치 설정.
			if (rowInput.equals("a")) {
				// row와col로 받은 값이 있다면 row와col받은값 위치에 1로 초기화 하기
				rowInputChange = 1;
				if (rowInputChange == 1) {
					seat[0][col] = 1;
				}
			} else if (rowInput.equals("b")) {
				// row와col로 받은 값이 있다면 row와col받은값 위치에 1로 초기화 하기
				rowInputChange = 2;
				if (rowInputChange == 2) {
					seat[1][col] = 1;
				}
			} else if (rowInput.equals("c")) {
				// row와col로 받은 값이 있다면 row와col받은값 위치에 1로 초기화 하기
				rowInputChange = 3;
				if (rowInputChange == 3) {
					seat[2][col] = 1;
				}
			//행을 x로 입력 받고 열에 아무 값을 넣어도 종료되는 설정
			}else if(rowInput.equals("x")) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}

		}
	}
}
