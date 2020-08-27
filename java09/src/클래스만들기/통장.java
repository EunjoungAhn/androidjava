package 클래스만들기;

import java.io.ObjectOutputStream.PutField;

public class 통장 {

	public static void main(String[] args) {
		우리가족계좌 dad = new 우리가족계좌();
		dad.name = "홍길동";
		dad.bankBookName = "튼튼적금";
		dad.money = 1000;
		
		우리가족계좌 mom = new 우리가족계좌();
		mom.name = "박길동";
		mom.bankBookName = "튼튼예금";
		mom.money = 2000;
		
		우리가족계좌 daughter = new 우리가족계좌();
		daughter.name = "홍기사";
		daughter.bankBookName = "다음적금";
		daughter.money = 3000;
		
		우리가족계좌 title = new 우리가족계좌();
		title.title();
		
		dad.putMoney();
		mom.putMoney();
		daughter.putMoney();
		System.out.println();
		dad.putResult();
		daughter.takeOutResult();
		
		
	}

}
