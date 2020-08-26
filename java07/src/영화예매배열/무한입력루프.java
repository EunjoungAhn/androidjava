package 영화예매배열;

import java.util.Scanner;

public class 무한입력루프 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] seat = new int[10];// 좌석마다 예매상황을 저장할 공간들
		while (true) {
			System.out.println("----------------------------");
			for (int i = 0; i < seat.length; i++) {
				// 3번문제 - 좌석번호가 1번부터 시작되게해주세요.
				System.out.print(i + 1 + "  ");
			}
			System.out.println();
			System.out.println("----------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "  ");
			}
			System.out.println();
			System.out.print("원하시는 좌석을 입력해주세요. (종료는 -1)>>");
			
			// 3번문제 - 좌석번호가 1번 예약되게해주세요.
			//입력받는 곳
			int choice = scan.nextInt()-1;
			
			if (choice == -1) {
				System.out.println("프로그램 종료");
				break;
			}
			
			// 1번 문제 - 이미 예약된 자리는 예약불가 다른 자리 선택하라고 알려주세요.
			if (seat[choice] == 1) {
				System.out.println();
				System.out.println("----------------------------");
				System.out.println("!!! 이미 예약 된 자리입니니다. !!!");
				System.out.println();
				System.out.println("----------------------------");
			}else {
			seat[choice] = 1;
			}
			
			System.out.println();
			System.out.println("----------------------------");
			
			// 2번 문제 - 종료시 몇좌석이 예매가 되었는지 프린트 한 장당 10000원, 결제금액 프린트
			System.out.println("좌석당 금액: 10000원");
			int count = 0;
			int print = 0;
			for (int i = 0; i < seat.length; i++) {
				if (seat[i] == 1) {
					System.out.println(i+1 + "번째 좌석을" + "예약 되었습니다.");
					count++;
					print += 10000;
				}
			}
			System.out.println("총 예매 좌석: " + count);
			System.out.println("총 예약 좌석 금액: " + print);


		}
	}

}
