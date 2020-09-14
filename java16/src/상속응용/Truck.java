package 상속응용;

public class Truck extends Car{
	//변수, 메서드 1개씩 
	int year;
	
	public void start() {
		System.out.println("판매 시작합니다!");
	}

	@Override
	public String toString() {
		return "Truck [year=" + year + "]";
	}
}
