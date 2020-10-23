package 제너릭프로그래밍;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		//Car c1 = new Car(); <- 제너릭이 아니다.
		//Car<String> c1 = new Car<String>("큰 사이즈"); <- 제너릭이면
		Car<String> c1 = new Car<>("큰 사이즈");//두번째 <>는 안써도 된다.
		System.out.println(c1.getSize());
		
		//Car<int> c2 = new Car<>("큰 사이즈");//여기서는 오토box이 안된다.
		Car<Integer> c2 = new Car<>(1);
		System.out.println(c2.getSize());
		
		Car<VO> c3 = new Car<>(new VO());//참조형 주소가 들어가야함으로 new VO()로 객체를 생성해 준다.
		System.out.println(c3.getSize());
		
		ArrayList<VO> list = new ArrayList<>();
		list.add(new VO());
		System.out.println(list);
	}

}
