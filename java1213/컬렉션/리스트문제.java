package 컬렉션;

import java.util.ArrayList;

public class 리스트문제 {

	public static void main(String[] args) {
		// 스키대회에서
		// 1등 박스키, 2등이 송스키, 3등이 김스키, 4등이 정스키, 2등이 반칙하여 탈락함.
		// 스키태회 시상자 목록으 프린트!

		ArrayList list = new ArrayList();
		
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println( i+1 + "등:" + list.get(i));
		}
		
		System.out.println();
		
		System.out.println("2등 반칙 탈락!");
		list.remove(1);
		
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println( i+1 + "등:" + list.get(i));
		}
		
	}

}
