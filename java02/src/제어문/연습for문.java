package 제어문;

public class 연습for문 {

	public static void main(String[] args) {
//2단
		int x = 2;
		int y = 1;

		for (int i = 0; i < 9; i++) {
			System.out.println(x + "x" + y + "=" + x * y);
			y++;
		}

		System.out.println("----------");
//구구단
		for (int x2 = 2; x2 <= 9; x2++) {
			for (int y2 = 1; y2 <= 9; y2++) {
				System.out.println(x2 + "x" + y2 + "=" + x2 * y2);
			}
		}
		
		System.out.println("----------");
//별모양으로 사각형 출력
		for (int a = 0; a <= 5; a++) {
			for (int b = 0; b <= 5; b++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}
