package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 로또번호생성중복제거 {

	public static void main(String[] args) {
		Random r = new Random();
		HashSet hashSet = new HashSet();

		for (int i = 0; i < 6; i++) {
			int num = r.nextInt(45) + 1;// 1~45
			System.out.println(num);
			System.out.println(hashSet.contains(num));
			if (hashSet.contains(num)) {
				i--;
			} else {
				hashSet.add(num);
			}
		}
		System.out.println(hashSet);

		while (hashSet.size() < 6) {
			hashSet.add(r.nextInt(46) + 1);// 1~45
		}
		System.out.println(hashSet);

	}

}
