package 상속응용;

public class Car {
	// 변수, 메서드 2개씩 정의
	String owner;
	String company;

	public void run() {
		System.out.println("차가 달려 갑니다.");
	}

	@Override
	public String toString() {
		return "car [owner=" + owner + ", company=" + company + "]";
	}
}
