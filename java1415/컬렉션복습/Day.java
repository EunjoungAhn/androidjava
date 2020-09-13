package 컬렉션복습;

public class Day {
	String doing;
	int time;
	String location;
	//final은 이 설정이 끝! 변경 불가능!
	final static String company = "mega";
	//count 너는 가만히 있어서 값을 누적 시켜줘
	static int count; //전역 변수는 자동 초기화가 됨. 0으로 초기화!
	static int sum;
	static int dayCount;
	
	public Day(String doing, int time, String location) {
		dayCount++;
		count++;
		sum += time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}
	//static 메서드(정적 메서드): 객체생성하지 않아도, 이 기능을 바로 사용 가능
	//클래스 이름으로 바로 접근해서 사용할 수 있는 메서드로 만드는 것이 좋다.
	public static String getName() {
		return company;//static 메서드 내에서는 인스턴스변수 사용 불가
//		return company + time;//static 메서드 내에서는 인스턴스변수 사용 불가
		//인스턴스변수는 객체 생성 후 접근 가능한 변수이기 때문에 
	}//자주 사용하는 기능의 메서드는 바로바로 쓸 수 있게 만들어 주는 것이 좋다.
	//Interger.parseInt(), JOPionpane.showInputDialog()
	
	//일반 메서드: 객체생성후, 잠조형 변수의 주소로 접근 가능!
	public int getAvg() {
		return sum/count;
	}
	
	@Override //재정의, 오바라이드, 오버라이딩 
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}
