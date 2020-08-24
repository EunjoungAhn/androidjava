package 배열응용;

import java.util.Random;

public class 문제1000문제 {

	public static void main(String[] args) {
		// 원래 답안지 0~3까지 중 1000개를 만들기
		// 내답안지 0~3까지 중 1000개를 만들기
		// 채점해 보기
		System.out.println("문항\t정답\t내답\t처리");
		System.out.println("---------------------------");
		//랜덤 선언
		Random answer = new Random();
		//배열 선언 및 크기 설정
		int[] ans = new int[1000];
		int[] me = new int[1000];
		//반복문으로 문제와 정답 번호 각각의 배열 변수에 저장 
		for (int i = 0; i < ans.length; i++) {//배열의 크기만큼 반복
			ans[i] = answer.nextInt(4);//랜덤 숫자 값 정하기
			me[i] = answer.nextInt(4);//랜덤 숫자 값 설정하기
		}
		//정답 횟수 변수 선언
		int corret = 0;
		//처리 답변 변수 선언(String)을 받기 위해 null로 처리
		//처리 답변을 담기위한 반복문 설정
		for (int i = 0; i < me.length; i++) {//배열의 크기만큼 반복
			//답변 확인 조건문
			String cans = "오답";
			if (ans[i] == me[i]) {
				corret++;
				cans = "정답";//조건이 맞으면 담기
			}
			//문항 정답 내답 처리 반복 
			System.out.println(i+"\t"+ ans[i] +"\t"+ me[i] +"\t"+ cans);
		}
		//마지막 총 맞은 갯수 출력
		System.out.println("정답 총 갯수:" + corret);
	}

}
