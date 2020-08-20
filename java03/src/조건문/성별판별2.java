package 조건문;

import javax.swing.JOptionPane;

public class 성별판별2 {

	public static void main(String[] args) {
		String ssn = JOptionPane.showInputDialog("주민번호 입렵 '-'를 포함해주세요.");
		// 프로그램 언어(자바)로 문자를 char로 받을 수 있는 방법은 없다.
		// String으로 입력을 받아서, 원하는 char만 추출을 함.
		char gender = ssn.charAt(7);
		String sub = ssn.substring(5,7);//문자열을 추축하기 때문에 타입은 String이며 시작 값과 끝값을 입력하면
		//그 사이의 값을 추출해 준다.
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
