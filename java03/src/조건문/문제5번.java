package 조건문;

import javax.swing.JOptionPane;

public class 문제5번 {

	public static void main(String[] args) {
		// 스티커 문제
		
		//사용자에게 갯수 입력 받기
		String user = JOptionPane.showInputDialog("스티커 몇개 사실 건가요?");
		String user2 = JOptionPane.showInputDialog("노트 몇개 사실 건가요?");
		
		//String으로 받은 갯수를 연산하기 위해 int로 변환
		int userNum = Integer.parseInt(user);
		int userNum2 = Integer.parseInt(user2);
		
		//각각의 입력 받은 값을 연산시키기 위해 변수 초기설정.
		int sticker = 3000;
		int note = 5000;
		int discountTotal = 0;
		
		//초기 변수 연산을 위한 초기화 설정
		int stickerSum = userNum * sticker;
		int noteSum = userNum2 * note;
		int total = stickerSum + noteSum;
		
		//할인 가격을 위한 비교
		//2만5천원 이상이면 3천원 할인
		if(total > 25000) {//25,000원인지 비교
			discountTotal =  total - 3000;//3천원 할인 후 대입
		}
		//출력
		System.out.println("스티커 개수: " + user);
		System.out.println("스티커 총 가격: " + stickerSum + "원");
		System.out.println("노트 개수: " + user2);
		System.out.println("노트 총 가격: " + noteSum + "원");
		System.out.println("총 결제금액: " + total + "원");
		System.out.println("할인된 총 결제금액(25,000원 이상일때 3,000천원 할인): " + discountTotal + "원");
	}

}
