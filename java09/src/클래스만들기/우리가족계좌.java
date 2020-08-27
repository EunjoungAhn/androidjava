package 클래스만들기;

public class 우리가족계좌 {
	String name;
	String bankBookName;
	int money;
	
	public void putMoney() {
		System.out.println(name + "   " + bankBookName + "   " + money);
	}
	
	public void takeOutMoney() {
		System.out.println(name + "   " + bankBookName + "   " + money);
	}
	
	public void putResult() {
		System.out.println(name + " 님은 입금하셨습니다.");
	}
	
	public void takeOutResult() {
		System.out.println(name + " 님은 출금하셨습니다.");
	}
	
	public void title() {
		System.out.println("우리     가족     계좌정보");
		System.out.println("-----------------");
		System.out.println("이름     계좌이름    금액");
		System.out.println("-----------------");
	}
}
