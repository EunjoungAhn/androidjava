package 조건문;

public class 성별판별 {

	public static void main(String[] args) {
		String ssn = "880115-1056512";
		// 프로그램 언어(자바)로 문자를 char로 받을 수 있는 방법은 없다.
		// String으로 입력을 받아서, 원하는 char만 추출을 함.
		char gender = ssn.charAt(7);//인덱스의 한 값만 추출해서 가져오는 함수
		// 위치를 가지고 특정한 문자 한개를 추출하면 됨.
		// 위치 = index,인덱스
		// 인덱스는 0부텉 시작
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남");
			break;
		case '2':
		case '4':
			System.out.println("여");
			break;
		default:
			System.out.println("잘못된 값이 들어왔습니다.");
			break;
		}
	}

}
