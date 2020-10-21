package 인터페이스;

import java.util.ArrayList;

public class 캐스팅확인 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//object(크고)---> String, 맨, 슈퍼맨(작다)
		//자동형변환(upcasting)
		list.add("등산");
		list.add(new 맨());
		list.add(new 슈퍼맨());
		
		//String(작) <- object(큰)
		//강제형변환(downcasting)
		String l1 = (String)list.get(0);//오프젝이 크고 String에 넣으려해서 강제 형변환 하였다.
		맨 m1 = (맨)list.get(1);
		슈퍼맨 m2 = (슈퍼맨)list.get(2);
		m2.eat();
		m2.run();
		m2.sky();
		
		Object m3 = list.get(2);
		//m3.
	}
}
