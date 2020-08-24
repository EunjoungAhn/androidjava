package 배열기본;

public class 배열개념 {

	public static void main(String[] args) {
		//많은 양의 데이터를 한꺼번에 다룰 때 편리
//		new int[1000];//메모리에 천개의 저장소를 만들게 된다.(int + int + int + int ...)
//		new char[500];//char + char + char + .... + char 
		//↑저장소만 만들었지 이름을 안만들었다.
//		jumsu = new int[1000];
//		gender =  new char[500];
//		char[] gender =  new char[500];
		int[] jumsu = new int[1000];//int 변수 1000개가 모두 이름이 jumsu
		//참조형 변수↑
		System.out.println(jumsu);//2층 같은 주소가 들어감
		//jumsu를 인덱스(위치값)로 구분
		//첫번째 jumsu는 index는 0이다 -> junsu[0]
		//두번째 jumsu는 index는 1이다 -> junsu[1]
		//마지막 jumsu는 index는 전체개수-1 -> junsu[전체개수-1]
		
		//기본형 변수: 기본형 데이터만 저장괸 변수
//				->기본형 변수는 변수 안에 해당 타입의 '값'이ㅣ 저장 된다.
		jumsu[0] = 100;
		jumsu[10] = 200;
		jumsu[999] = 1000;
//		jumsu[1000] 0부터 시작해서 존재하지 않음.
		
		
		System.out.println("첫번째 값: " + jumsu[0]);
		System.out.println("11번째 값: " + jumsu[10]);
		System.out.println("마지막번째 값: " + jumsu[999]);
		System.out.println("500번째 값: " + jumsu[499]);//쓰레기 값이 아니라 0이들어가 있다.
		//왜냐면 배열은 자동초기화가 됨.
		
		//인클립스에서는 for문 위에 배열을 기준으로 자동으로 완성해 준다.
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(i + ": " + jumsu[i]);
		}
		
		//참조형 변수를 배열로 선언하면 null로 자동 초기화가 된다.
		String[] names = new String[1000];//스트링 변수가 참조형이니가 총 변수는 1001개가 생긴다.
		System.out.println("String 값: " + names[0]);
		System.out.println("String 값: " + names.length);//하지만 length 보이지 않는 변수가 하나 더 있어서 총 1002개의 변수가 있다.
		System.out.println("String 값: " + names[names.length]);
		
	}

}
