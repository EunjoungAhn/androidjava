package 컬렉션복습;

public class 직원뽑기 {
	String name;
	String gender;
	int age;
	static int personCount;//다른 클래스에서 전근 할 수 있도록 static 설정
	static int ageAverage;//다른 클래스에서 전근 할 수 있도록 static 설정

	//직원들의 정보를 받는 생성자 메서드
	public 직원뽑기(String name, String gender, int age) {//3개의 매개변수를 받지 않으면 못쓴다.
		ageAverage += age;//age의 총합을 담기위한 변수
		personCount++;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	//전체값을 출력하기 위해서 재정의
	@Override
	public String toString() {
		return "직원뽑기 [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
}
