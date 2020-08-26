package 영화예매배열;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		System.out.println("게임시작");
		Scanner sc = new Scanner(System.in);
		//0~2까지의 랜덤 값을 받기위한 랜덤 설정.
		Random r = new Random();
		int com = 0;//컴퓨터 입력값 변수 설정.
		int gawiGameWin = 0;//가위 이긴 횟수 변수 설정.
		int mukGameWin = 0;//가위 이긴 횟수 변수 설정.
		int boGameWin = 0;//바위 이긴 횟수 변수 설정.
		int gameCount = 0;//게임 총 횟수 변수 설정.
		int comW = 0;//COM이 이긴 횟수 변수 설정.
		int meW = 0;//내가 이긴 횟수 변수 설정.
		int same = 0;//COM과 비긴 횟수 변수 설정.
		while (true) {//가위바위보 게임을 계속하기 위해 무한 변수 설정
			System.out.println("0번 가위, 1번 바위, 2번 보 번호를 입력해주세요.");
			int me = sc.nextInt();//나에게 번호 입력값을 받기 위한 scanner 설정
			com = r.nextInt(2);//com이 랜덤한 변수를 갖기위해 설정.
			System.out.println("----------------------");
			if (me == 0) {//내가 가위일때
				if (com == me) {//나와 com의 숫자가 같다면
					System.out.println("비겼습니다.");
					same++;//비긴 횟수 카운트
				}else if (com == 1) {//com이 1이면 진걸로 설정
					System.out.println("졌습니다.");
					comW++;//com이 이긴 증가값 설정
				}else{//그외의 랜덤 값이 들어오면 내가 이기는 것으로
					//그외의 값은 랜덤값을 0~2로 설정했기 때문에 else로 들어올 값은
					//2 밖에 남지 않는다.
					System.out.println("이겼습니다.");
					meW++;//내가 이긴 횟수 카운트 증가값 설정
					gawiGameWin++;//가위로 이긴 횟수 카운트 증가값 설정
				}
			}

			if(me == 1) {//내가 바위일때
				if (com == me) {//나와 com의 숫자가 같다면
					System.out.println("비겼습니다.");
					same++;//비긴 횟수 카운트
				}else if (com == 2) {//com이 2이면 진걸로 설정
					System.out.println("졌습니다.");
					comW++;//com이 이긴 증가값 설정
				}else{//그외의 랜덤 값이 들어오면 내가 이기는 것으로
					System.out.println("이겼습니다.");
					meW++;//내가 이긴 횟수 카운트 증가값 설정
					mukGameWin++;//바위로 이긴 횟수 카운트 증가값 설정
				}
			}
			if(me == 2) {//보
				if (com == me) {//나와 com의 숫자가 같다면
					System.out.println("비겼습니다.");
					same++;//비긴 횟수 카운트
				}else if (com == 0) {//com이 0이면 진걸로 설정
					System.out.println("졌습니다.");
					comW++;//com이 이긴 증가값 설정
				}else{//그외의 랜덤 값이 들어오면 내가 이기는 것으로
					System.out.println("이겼습니다.");
					meW++;//내가 이긴 횟수 카운트 증가값 설정
				}
				boGameWin++;//보로 이긴 횟수 카운트 증가값 설정
			}
			gameCount++;//전체 게임 횟수 카운트 설정
			//모든 횟수 카운트 출력
			System.out.println("게임 횟수" + gameCount);
			System.out.println("가위 게임 이긴 횟수" + gawiGameWin);
			System.out.println("바위 게임 이긴 횟수" + mukGameWin);
			System.out.println("보 게임 이긴 횟수" + boGameWin);
		}

	}

}
