package 데이터;

public class 문자열 {
// 코드 자동 정리: ctrl + shift + f 
	public static void main(String[] args) {
//		기본데이터는 아닌데, 사람이 워낙 많이 쓰는 데이터의 형태이므로 
//		기본데이터처럼 쓰게 해놓은 문자열을 나타내는 키워드가 String 이다. 
		String name = "호랑이";
//		String은 name 이라는 변수에 들어갈 데이터의 유형
//		data type(자료형)
		
		String company = "메가더조은";
		System.out.println(name + "은 " + company + " 소속이다.");
//		+ : 하나라도 String이면 모두 다 String 결합의 의미!
		int age = 100;
		System.out.println(name + "의 나이는 " + age);
//		하나라도 String이면 모두가 String 이다.
		String subject; //선언! => 메모리가 할당
		subject ="자바"; //값을 넣음, 대입연산자, 할당연산자(=)
		//한번 스트링으로 선언된 변수는 도중에 바꿀 수 없다.
		//int subject
		System.out.println("내 과목은 " + subject);
		
		String day;
//		System.out.println(day);//쓰레기값 상태인 경우, 연산도 안되고, 출력도 안됨.
		
	}

}
