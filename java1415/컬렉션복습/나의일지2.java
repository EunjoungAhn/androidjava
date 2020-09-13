package 컬렉션복습;

public class 나의일지2 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남");
		System.out.println(Day.count + "개 생성됨");
		System.out.println("전체 누적 시간: "+Day.sum);
		
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(Day.count + "개 생성됨");
		System.out.println("전체 누적 시간: "+Day.sum);
		
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(Day.count + "개 생성됨");
		System.out.println("전체 누적 시간: "+Day.sum);
		
//		System.out.println("평균 시간은: "+Day.sum/Day.count + "시간");
		System.out.println("평균 시간은: "+ day3.getAvg() + "시간");
		System.out.println("회사이름은 " + Day.getName());
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
	}
}
