package 영화예매배열;

import java.util.Scanner;

public class 이차원배열 {

	public static void main(String[] args) {
		// 콘솔에 입력받을 부품 설정
		Scanner sc = new Scanner(System.in);
		// 이중배열 셋팅 [행][열]
		int[][] seat = new int[3][10];
		// 행을 입력 받기위한 변수 선언
		int row = 0;
		// 열을 입력 받기위한 변수 선언
		int col = 0;
		// 입력을 반복적으로 받기위한 무한 반복문 설정
		while (true) {
			// 상단 콘솔 ui
			System.out.println("---------------------");
			System.out.println("\t\t             열");
			System.out.print(" ");
			// 열을 표기하기 위한 반복문 설정
			for (int i = 0; i < 10; i++) {
				System.out.print(" " + i);
			}
			System.out.println();
			System.out.println("---------------------");
			// 이중배열 틀을 위한 이중 for문 작성
			for (int i = 0; i < seat.length; i++) { // 행의 개수
				// 좌측 0~2행을 표기하기 위한 반복문
				System.out.print(i + " ");
				for (int j = 0; j < seat[i].length; j++) {// 열의 개수
					// seat[i](3)행 만큼 반복하며 seat[j](10)만큼 열을 반복
					// 0으로 모든 행과 열을 출력한다.
					System.out.print(seat[i][j] + " ");
				}
				System.out.print("행");
				System.out.println(" ");
			}
			// 행을 입력받기 위한 scanner
			System.out.print("'행'을 입력해주세요.>>");
			// 입력 받은 값을 row에 저장
			row = sc.nextInt();
			// -1을 받으면 종료하라는 조건문
			// row만 받아도 종료 될 수 있도록 row밑에 바로 조건문 위치 설정.
			if (row == -1) {
				System.out.println("프로그램 종료");
				break;// 입력 반복을 중단 받기 위해 무한루프를 나간다.
			} else {
				// row와col로 받은 값이 있다면 row와col받은값 위치에 1로 초기화 하기
				seat[row][col] = 1;
			}
			// 열을 입력받기 위한 scanner
			System.out.print("'열'을 입력해주세요.>>");
			// 입력 받은 값을 col에 저장
			col = sc.nextInt();
		}
	}
}
