package 컬렉션;

import java.util.LinkedList;

public class 큐형태 {

	public static void main(String[] args) {
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		milk.add("내일우유");
		for (int i = 0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}
		System.out.println("----");
		milk.remove();
		for (int i = 0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}
		System.out.println("----");
		milk.remove();
		for (int i = 0; i < milk.size(); i++) {
			System.out.println(milk.get(i));
		}
		System.out.println(milk);//주소값 대신 자동으로 값을 보여줌
	}

}
