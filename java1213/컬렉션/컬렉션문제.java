package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 컬렉션문제 {

	public static void main(String[] args) {
		// 1번 문제
		System.out.println("1번문제-------");
		ArrayList list = new ArrayList();

		list.add("박소정");
		list.add("김정민");
		list.add("소지현");
		list.add("김개념");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "등:" + list.get(i));
		}

		System.out.println();

		System.out.println("2등 반칙 탈락!");
		list.remove(1);

		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "등:" + list.get(i));
		}
		
		System.out.println("2번문제-------");
		
		//2번문제
		HashMap client = new HashMap();
		client.put(100, "김데이");
		client.put(200, "김사전");
		client.put(300, "김구조");
		client.put(400, "김자료");
		client.remove(200);
		System.out.println(client);
		client.put(300, "김충성");
		System.out.println(client);
		
		//4번문제
		System.out.println("4번문제-------");
		
		HashSet trip = new HashSet();
		trip.add("유럽");
		trip.add("일본");
		trip.add("필리핀");
		trip.add("캐나다");
		trip.add("미국");
		System.out.println(trip);
		trip.add("유럽");//중복 제거하여 add가 안된다.
	}

}
