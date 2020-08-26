package 영화예매배열;

import java.util.Scanner;

public class 영화예매문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] seat = new int[10];//좌석마다 예매상황을 저장할 공간들
		while (true) {
			System.out.println("----------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + "  ");
			}
			System.out.println();
			System.out.println("----------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "  ");
			}
			System.out.println();
			System.out.print("원하시는 좌석을 입력해주세요. (종료는 -1)>>");
			int choice = scan.nextInt();
			if (choice == -1) {
				System.out.println("프로그램 종료");
				break;
			}
			//선택한 번호의 좌석을 예약하세요.
			seat[choice] = 1;
			System.out.println("예약을 완교하였습니다.");
			
			//1번 문제 - 이미 예약된 자리는 예약불가 다른 자리 선택하라고 알려주세요.
			
			//2번 문제 - 종료시 몇좌석이 예매가 되었는지 프린트 한 장당 10000원, 결제금액 프린트
			
			//3번문제 - 좌석번호가 1번부터 시작되게해주세요.
		}
	}

}
