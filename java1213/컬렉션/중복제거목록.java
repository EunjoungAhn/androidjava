package 컬렉션;

import java.util.HashSet;

public class 중복제거목록 {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("볼팬");
		bag.add("휴지");
		bag.add("휴대폰");
		bag.add("휴지");
		//hashset은 자동으로 중복제거를 해준다.
		System.out.println(bag.size());//3
		//자동으로 주소값을 값으로 바꾸어 보여준다.
		System.out.println(bag);
	}

}
