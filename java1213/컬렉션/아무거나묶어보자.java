package 컬렉션;

import java.util.ArrayList;

import db연결.BbsVO;

public class 아무거나묶어보자 {

	public static void main(String[] args) {
		//배열과 다르게 중간에 값을 뺏다가 넣을 수 있다.
		ArrayList list = new ArrayList();
		//넣을 때는 add(값) 메서드 사용
		list.add(19);
		list.add("자바과정");
		list.add(25.5);
		list.add(false);
		list.add(new BbsVO());
		//list에 개수는 list.size()
		//꺼낼때는 get(index) 메서드 사용
		System.out.println(list.size() + "개 들어있어요.");
		System.out.println(list.get(0));//19
		System.out.println(list.get(1));//자바과정
		//지울 때는 remove(index) 메서드 사용
		list.remove(0);
		System.out.println(list.size() + "개 들어있어요.");
		System.out.println(list.get(0));//자바과정 ->19가 사자진 index자리로 위치변경
		//중간에 끼워 넣을 때는 add(끼워넣을 위치, 값) 메서드 사용
		list.add(0, "홍길동");
		System.out.println(list.size() + "개 들어있어요.");
		System.out.println(list.get(0));//자바과정 이 0번째 였지만 홍길동을 0번자리에 넣어서 홍길동이 출력
		//값을 변경할 때는 set(변경할 위치, 값) 메서드 사용
		list.set(0, "김길동");
		System.out.println(list.size() + "개 들어있어요.");
		System.out.println(list.get(0));//김길동
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
	}

}
