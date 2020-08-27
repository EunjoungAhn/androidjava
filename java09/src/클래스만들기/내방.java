package 클래스만들기;

public class 내방 {

	public static void main(String[] args) {
		휴대폰 phone = new 휴대폰();
		//color, size, company 멤버변수 복사 -> 자동초기화
		//phone변수 생성 -> 멤버변수들을 가츠키는 주소가 들어감.
		phone.color = "흰색";
		phone.size = 7;
		phone.company= "삼성";
		
		System.out.println("phone의 색은 " + phone.color);
		System.out.println("phone의 크기는 " + phone.size);
		System.out.println("phone의 회사는 " + phone.company);
		phone.text();
		
		System.out.println("----------------");
		
		휴대폰 phone2 = new 휴대폰();
		phone2.color = "빨강";
		phone2.size = 11;
		phone2.company = "애플";
		
		System.out.println("phone의 색은 " + phone2.color);
		System.out.println("phone의 크기는 " + phone2.size);
		System.out.println("phone의 회사는 " + phone2.company);
		phone2.call();
		
		System.out.println("-----------------");
		
		강아지 dog = new 강아지();
		dog.name = "장고";
		dog.color = "흰색";
		dog.age = 5;
		dog.size = "30cm";
		System.out.println( dog.name + " 의 색은" + dog.color + " 크기는 " + dog.size + " 나이는 " + dog.age);
		
		강아지 dog2 = new 강아지();
		dog2.name = "망고";
		dog2.bark();
		System.out.println("나의 2번째 개이름: " + dog2.name);

	}

}
