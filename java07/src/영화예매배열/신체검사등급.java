package 영화예매배열;

import java.util.Scanner;

public class 신체검사등급 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 면제 대상자 카운트 변수
		int noAmy = 0;
		// 현역 대상자 카운트 변수
		int yesAmy = 0;
		// 모든 대상자의 평균 점수
		while (true) {
			// 스캐너를 이용한 각각의 입력값 받기
			System.out.println("신체검사 등급 조회 아래의 항목을 입력해 주세요.");
			System.out.print("주민번호: ");
			String jumin = sc.next();
			System.out.print("키: ");
			double hight = sc.nextDouble();
			System.out.print("몸무게: ");
			double weight = sc.nextDouble();
			System.out.print("시력: ");
			double eye = sc.nextDouble();
			System.out.print("병명: 1.없음 2.평방 3.고혈암");
			int disease = sc.nextInt();

			// 검사 스코어 변수
			//각 대상자 마다 점수를 초기회하여 출력해야 하기 때문에 무한 반복에 넣어 0으로 계속 초기화
			int score = 0;
			
			// bmi 수치 계산
			double BMI = weight /((hight/100) * (hight/100));
//			System.out.println("BMI 수치: " + BMI);

			// 면제대상 확인 조건문
			// 키 (150~190)사이 외
			if (hight < 150 || hight > 190 || BMI >= 30 || eye <= 0.0) {
				System.out.println("면제 대상입니다.");
				noAmy++;
				// 키 150~190사이 => +20점 하기위한 조건문
			} else {
				// 몸무게 스코어 값 초기화 시키기 위한 조건문
				if (weight >= 35 || weight <= 100) {
					score += 20;// 스코어 값 추가해주기
				}
				if (hight >= 150 || hight <= 190) {
					score += 20; // 키 검사 스코어 값 초기화 시키기
				}
				
				if (eye >= 1.0) {// 각각의 시력에 따라 스코어 점수 따로 설정 조건문
					score += 30;
				} else if (eye >= 0.5) {
					score += 20;
				} else if (eye >= 0.1) {
					score += 10;
				}
				if (disease == 1) {
					score += 30;
				}else if (disease == 2) {
					score += 20;
				} else if (disease == 3) {
					score += 10;
				}
				// 스코어 총합으로 면제 or 현역 판정 조건문
				if (score >= 40) {
					System.out.println("현역 대상자 입니다.");
					yesAmy++;
				}
			}
			// 대상자 현황 출력
			System.out.println("면제 대상자 숫자: " + noAmy);
			System.out.println("현역 대상자 숫자: " + yesAmy);
			System.out.println("대상자 점수: " + score);
			System.out.println("------------------------");
		}

	}

}
