package 배열의응용;

import javax.swing.JOptionPane;

public class 투표문제 {

	public static void main(String[] args) {
		String[] names = { "블랙핑크", "유재석", "아이유", "이효리", "비" };
		int black = 0;
		int you = 0;
		int iu = 0;
		int e = 0;
		int b = 0;
				
		for (int i = 0; i < 10; i++) {
			String vote = JOptionPane.showInputDialog("1번:블랙핑크, 2번:유재석,3번:아이유,4번:이효리 5번:비");
//			int v = Integer.parseInt(vote);
			if (names[0].equals(vote) || vote.equals("1")){
				black++;
			} else if (names[1].equals(vote) || vote.equals("2")) {
				you++;
				
			} else if (names[2].equals(vote) || vote.equals("3")) {
				iu++;
				
			} else if (names[3].equals(vote) || vote.equals("4")) {
				e++; 
				
			} else if (names[4].equals(vote) || vote.equals("5")) {
				b++;
				
			}else {
				System.out.println("무효 표 입니다.");
			}
			
		}
		
		int[] vnums = {black, you, iu, e, b};
		int vip = vnums[0];
		
		for (int i = 0; i < vnums.length; i++) {
			if (vip < vnums[i]) {
				vip = vnums[i];
			}
		}
		
		for (int i = 0; i < vnums.length; i++) {
			if (vnums[i] == vip) {
				System.out.println("----3번문제----");
				System.out.println(names[i] + " 가 " + vip + "표 로 우승!");
			}
		}
		
		System.out.println("----1번문제----");
		System.out.println(names[0] + black + " 표");
		System.out.println(names[1] + you+ " 표");
		System.out.println(names[2] + iu + " 표");
		System.out.println(names[3] + e + " 표");
		System.out.println(names[4] + b + " 표");
		System.out.println("----2번문제----");
		System.out.println("블랙핑크는 " + black + "표");
		System.out.println("유재석은 " + you+ "표");
		System.out.println("아이유는 " + iu + "표");
		System.out.println("이효리는 " + e + "표");
		System.out.println("비는 " + b + "표");
		
	}

}
