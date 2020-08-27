package 배열정리;

public class 이차원배열2 {

	public static void main(String[] args) {
		int[][] seat = new int[3][];//열의 공간면 각 줄마다 크기가 다른 열을 만들 수 있다.
		//2차원 배열은 1차원 배열을 연결!
		int[] s1 = new int[3];
		int[] s2 = new int[4];
		int[] s3 = new int[5];
		//열의 개수가 다르면 각 행에게 삽입한다.
		seat[0] = s1;
		seat[1] = s2;
		seat[2] = s3;
		
		for (int i = 0; i < seat.length; i++) {//0,1,2
			for (int j = 0; j < seat[i].length; j++) {//각줄(행)마다 길이만큼 반복
				System.out.print(seat[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
