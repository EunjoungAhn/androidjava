package 클래스만들기;

public class 계산기사용가게 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.plus();
		System.out.println("--------");
		//tv부품을  사용해서, 켜고 꺼보세요!
		티비 tv = new 티비();
		tv.on();
		System.out.println("--------");
		tv.off();
		System.out.println("--------");
		//학생들이 왔습니다.
		학생 student = new 학생();
		student.study();
		student.goSchool();
	}

}
