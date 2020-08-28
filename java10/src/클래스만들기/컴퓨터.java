package 클래스만들기;

public class 컴퓨터 {
	//상태정의 -> "멤버변수", "전역변수"("global 변수", 글로벌 변수)
	//객체 생성 후, 멤버변수는 객체마자 다 별도로 복사되게 된다.
	//복사된 멤버변수에는 생성된 객체의 실제값이 들어가게 된다.
	//멤버변수는 실제값이 들어가는 변수("인스턴스 변수")
	//전역변수 -> 클래스 전체 영역에서 사용 가능
	//틀을 만들때는 변수에 값을 넣지 않는다.
	//변수는 선언의 위치가 중요!
	//선언의 위치가 이 변수를 쑬 수 있는 범위를 결정
	
    //다른 패키지에서도 사용하려면 public을 선언해주어야 한다.
	public int price; //가격
	public String company; //제조회사
	public int size; //모니터의 크기 
	
	//동작벙의 -> 멤버메서드
	public void internet() {
		System.out.println("인터넷하다.");
	}
	public void doc() {
		System.out.println("문서작성하다.");
	}
	
	//원래 toString()은 기초형이면 기초형값, 참조형이면 주소를 찍어주는 메서드
	//toString()를 내가 원하는 프린트모양대로 변경해ㅐ서 사용할 수 있다.
	//eclipse의 Source에 가서 toString()메서드 코드자동 생성
	@Override//는 지워도 되고 뜻은 내가 다시 썻다라는 의미이다.
	public String toString() {
		return "컴퓨터 [price=" + price + ", company=" + company + ", size=" + size + "]";
	}
}
