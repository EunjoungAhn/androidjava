package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		//비교연산자의 결과가 boolean(논리형!)
		int x = 200;
		int y = 100;
		
		System.out.println("동일한지:"+ (x == y));
		System.out.println("다른지:"+ (x != y));
		System.out.println("크거나 같은지:"+ (x >= y));
		System.out.println("큰지:"+ (x > y));
	}

}
