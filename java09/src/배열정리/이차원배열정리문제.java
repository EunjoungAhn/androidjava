package 배열정리;

public class 이차원배열정리문제 {

	public static void main(String[] args) {
		int[][] classScore = new int[4][];

		int[] lit = { 50, 60, 70, 80, 90 };
		int[] math = { 66, 77, 88 };
		int[] eng = { 90, 80, 70, 60 };
		int[] sic = { 77, 100 };

		classScore[0] = lit;
		classScore[1] = math;
		classScore[2] = eng;
		classScore[3] = sic;

		for (int i = 0; i < classScore.length; i++) {// 0,1,2
			for (int j = 0; j < classScore[i].length; j++) {// 각줄(행)마다 길이만큼 반복
				System.out.print(classScore[i][j] + " ");
			}
			System.out.println();
		}

	}
}
