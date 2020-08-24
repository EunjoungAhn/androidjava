package 배열의응용;

public class 배열복사문제 {

	public static void main(String[] args) {
		// 과목명 배열
		String[] subject = { "국어", "수학", "과학", "컴퓨터", "영어" };
		//과목 배열만큼 반복하여 꺼내기
		for (String s : subject) {
			System.out.print(s + " ");
		}
		// 한줄 내리기
		System.out.println("");

		// 1학기 점수 배열
		int[] score = { 100, 99, 77, 87, 66 };
		//평균 값을 담기 위한 변수 선언
		int sum1 = 0;

		System.out.print("1학기 점수: ");
		// 1학기 점수를 반복 출력한다.
		for (int i : score) {
			System.out.print(i + " ");
			//배열의 값을 sum1에 누적시킨다.
			sum1 += i;
		}

		System.out.println("");
		// 배열 깊은 복사
		// 2학기 점수 배열
		int[] score2 = score.clone();
		// 평균값을 구하기 위한 변수
		int sum2 = 0;
		// 복사한 배열 값 변경
		score2[2] = 44;//과학
		score2[4] = 55;//영어

		System.out.print("2학기 점수: ");
		// 2학기 점수 반복
		for (int i : score2) {
			System.out.print(i + " ");
			//배열을 반복하며 sum2에 값을 누적시킨다.
			sum2 += i;
		}
		System.out.println("");
		// 점수가 변경된 과목수
		// 변경된 과목수를 세기위한 변수
		int count = 0;
		// 과목수 만큼 반복하기
		for (int i = 0; i < subject.length; i++) {
			// 1학기 점수와 2학기 점수가 다르면 카운터를 증가시킨다.
			if (score[i] != score2[i]) {
				count++;
			}
		}
		System.out.print("점수가 변경된 과목 수: " + count + "개");

		// 평균을 표기하기 위한 변수
		String win = null;
		// 1학기, 2학기 평균 구하는 조건식
		if (sum1 < sum2) {
			win = "2학기 평균이 더 좋습니다.";
		} else if (sum1 > sum2) {
			win = "1학기 평균이 더 좋습니다.";
		} else {
			win = "평균이 같습니다.";
		}

		System.out.println("");
		System.out.print(win);
		System.out.println("");

		System.out.print("점수가 변경된 과목 명: ");
		// 점수가 변경된 과목명
		// 과목 배열 기준으로 반복
		for (int i = 0; i < subject.length; i++) {
			// 배열의 크기가 1학기와 2학기가 같으므로 두 배열의 값 중
			// 다른 값이 있으면 출력해라
			if (score[i] != score2[i]) {
				System.out.print(subject[i] + " ");
			}
		}

	}

}
