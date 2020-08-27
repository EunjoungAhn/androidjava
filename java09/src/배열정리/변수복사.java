package 배열정리;

public class 변수복사 {

	public static void main(String[] args) {
		int x = 300; //-21억 ~21억
		int y = x; //값 복사
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("----------");
		x = 500;
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}

}
