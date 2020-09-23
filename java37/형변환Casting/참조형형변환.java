package 형변환Casting;

import java.util.ArrayList;

public class 참조형형변환 {

	public static void main(String[] args) {
		//상속관계가 아니면 불가능하다.
		//상속관계이면 형변환(Casting, 캐스팅) 가능
		//Car(부모, 수퍼), Truck(자식, 서브)
		//클래스간의 대소비교할 때는 개몀적으로 접근
		//부모클래스가 크고, 자식클래스가 작다
		ArrayList list = new ArrayList();
		//모든 타입을 묶을 수 있음. 크키가 유동
		list.add("홍길동");
		//object(큰) <- String(작): 자동형변환 = Upcasting
		//자식이 부모자리에 들어가는 것을 - '업캐스팅'이라한다.
		//Object <-- (upcasting) -- Integer <-- (auto boxing) -- int
		list.add(100); //참조형 <- 기본형: 오토 박싱(auto boxing)
		list.add(11.22); //참조형 <- 기본형: 오토 박싱(auto boxing)
		list.add(true);
		list.add('A');
		list.add(new Vo()); // boxing과정 없이 upcasting만 이루어짐
		
		System.out.println("목록 내용: "+list);
		
		//업캐스팅(자동형변환)으로 String을 Object으로 형변환하여 넣은 것은 
		//꺼냈을 때 Object꺼내면 String에서 추가된 기능을 쓸 수 없다.
		//꺼낼 때, String으로 형변환하여 꺼내야 한다.
		//down casting(다운 캐스팅)
		String name = (String)list.get(0); // 강제형변환 
		int age = (Integer)list.get(1); //int의 경우 Integer를 쓰면 오토 언박싱 된다.
		//기본형 <-- (오토 언박싱) <-- Integer <-- (다운캐스팅) <-- Object
		
	}

}
