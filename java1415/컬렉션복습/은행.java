package 컬렉션복습;

import java.util.ArrayList;

public class 은행 {

	public static void main(String[] args) {
		계좌 account1 = new 계좌("홍길동", "정기적금", 1000);
		System.out.println(account1);
		
		계좌 account2 = new 계좌("김길동", "정기예금", 2000);
		System.out.println(account2);
		
//		계좌 account3 = new 계좌();
		
		ArrayList<계좌> list = new ArrayList<>();
		list.add(account1);
		list.add(account2);
		
		파일로저장 file = new 파일로저장();
		file.bankBook(list);
	}

}
