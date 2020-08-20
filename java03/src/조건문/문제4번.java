package 조건문;

import javax.swing.JOptionPane;

public class 문제4번 {

	public static void main(String[] args) {
		// 투표시스템(무한 루프)
		// 각 투료 횟수 카운터를 위한 변수 선언
		int iu = 0;
		int ujk = 0;
		int bts = 0;

		// 투표 반복 진행을 위한 while로 무한 루프 설정
		while (true) {
			String vote = JOptionPane.showInputDialog("1:아이유, 2:유재석, 3:방탄, 4:종료");
			// 2) 투료 진행 확인
			// 1) 종료가 되는지 확인
			
			//사용자가 '1' 혹은 '글자'를 적어도 횟수 카운트를 위한 논리 값 설정. 
			if (vote.equals("1") || vote.equals("아이유")) {
				iu++;
			}
			if (vote.equals("2") || vote.equals("유재석")) {
				ujk++;
			}
			if (vote.equals("3") || vote.equals("방탄")) {
				bts++;
			}
			if (vote.equals("4") || vote.equals("종료")) {
				System.out.println("시스템을 종료합니다.");
				System.out.println("아이유 투표수" + iu);
				System.out.println("유재석 투표수" + ujk);
				System.out.println("방탄 투표수" + bts);
				break;//반복을 종료하여 나가기 위해서(다시 입력값을 안띄우기 위해)
			}else {//보기 외의 값을 입력한 경우 출력
				System.out.println("투표 보기에서 뽑아주세요.");
			}
		}
	}

}
