package 클래스만들기;

public class 휴대폰 {
	//속성: 색, 크기, 회사 -> 멤버변수
	String color;
	int size;
	String company;
	
	//기능(동작): 전화하다, 문자하다, 검색하다. -> 멤버메서드
	public void call() {
		System.out.println("전화를 겁니다.");
	}

	public void text() {
		System.out.println("카톡을 합니다.");
	}

	public void search() {
		System.out.println("인터넷 검색합니다.");
	}
	
}
