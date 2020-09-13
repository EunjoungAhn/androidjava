package 컬렉션복습;

public class 창업 {

	public static void main(String[] args) {
		직원뽑기 gotcha = new 직원뽑기("안나무", "남", 23);//3개의 값을 넣지 않으면 안된다.
		//직원들의 고용 인원을 카운트하기 위해 static을 클래스의 원본영역에 설정하고
		System.out.println("직원 고용 인원 체크: " + 직원뽑기.personCount);
		
		직원뽑기 gotcha2 = new 직원뽑기("김길동", "여", 26);
		//정적변수(static)로 값을 누적시킨다. 
		System.out.println("직원 고용 인원 체크: " + 직원뽑기.personCount);
		
		직원뽑기 gotcha3 = new 직원뽑기("홍길동", "남", 30);
		System.out.println("직원 고용 인원 체크: " + 직원뽑기.personCount);

		System.out.println("----직원정보----");
		System.out.println(gotcha);//오버라이드 된 정보로 
		System.out.println(gotcha2);//주소값 대신
		System.out.println(gotcha3);//toString() 매서드로 으로 잘 출력된다.
		System.out.println("직원 평균 나이: " + 직원뽑기.ageAverage/직원뽑기.personCount);
		
	}
}
