package 배열의응용;


import javax.swing.JOptionPane;

public class 투표풀이 {

	public static void main(String[] args) {
		String[] names = { "블랙핑크", "유재석", "아이유", "이효리", "비" };
		//각각의 투표자들의 투표수를 저장하기 위한 배열 선언
		int[] 투표수 = {0,0,0,0,0};
		for (int i = 0; i < 10; i++) {
			String choice = JOptionPane.showInputDialog("1번:블랙핑크, 2번:유재석,3번:아이유,4번:이효리 5번:비");
			int choice2 = Integer.parseInt(choice);
//			if (!(choice2<0 || choice2 > 4)) {
			// 0~4
				투표수[choice2]++;
//			}
		}
//		for (int x : 투표수) {
//			System.out.println(x + " ");
//		}
		for (int i = 0; i < 투표수.length; i++) {
			System.out.println(i + "번은 " + 투표수[i] + "표");
		}
		
		int max = 투표수[0];
		for (int i = 0; i < 투표수.length; i++) {
			if (투표수[i] > max) {
				max = 투표수[i];
			}
		}
		for (int i = 0; i < 투표수.length; i++) {
			if (투표수[i] == max) {
				System.out.println(i + ": " + names[i]);
			}
		}

}
}
