package 클래스사용하기;

import 클래스만들기.용돈계산기;

public class 내용돈계산해보자 {

	public static void main(String[] args) {
		//기간 6개원, 한달 용돈 10000
		//전체 금액이 50만원이 안되면, 15만원을 더주고
		//전체 금액이 50만원이 넘은면 추가 용돈 없음.
		용돈계산기	moneyCal = new 용돈계산기();
		int period = 6;
		int monthMoney = 100000;

		int sum = moneyCal.mul(period, monthMoney);
		if (sum >= 50) {
			System.out.println("내 6개월 용돈: " + sum);
		}else {
			System.out.println("내 6개월 용돈: " + (sum + 150000));
		}
		
		//상반기 받은 금액 60만원
		int money1 = 60;
		//하반기 받은 금액 50만원
		int money2 = 50;
		//일년 동안 받은 용돈을 출력해 보세요.
		
		moneyCal.add(money1, money2);
	}

}
