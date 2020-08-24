package 배열의응용;

public class 식구정리문제 {

	public static void main(String[] args) {
		String[] f = {"아버지", "어머니", "형", "나", "동생"};
		int[] fage = {100, 88, 33, 24, 10};
		double[] fhi = {177.5, 152.2, 190.3, 167.7, 155.3};
		
		
			System.out.println("우리집 식구 정리");
			System.out.println("------------");
			System.out.println("이름   나이   키");

			for (int i = 0; i < fage.length; i++) {
				System.out.println(f[i] +" "+ fage[i] +" "+ fhi[i]);
			}
	}

}
