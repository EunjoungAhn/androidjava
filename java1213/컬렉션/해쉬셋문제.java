package 컬렉션;

import java.util.HashSet;

public class 해쉬셋문제 {

	public static void main(String[] args) {
		//팀을 구성하려고 합니다.
		//한 명씩만 필요하고,
		//디자이너, 프로그래머, DB관리자/
		//팀원 목록을 프린트!
		
		HashSet hashSet = new HashSet();
		hashSet.add("디자이너");
		hashSet.add("프로그래머");
		hashSet.add("관리자");
		System.out.println(hashSet);
	}

}
