package 스레드;

//import java.lang.*;//명시적으로 import가 되어있다.

public class StarThread extends Thread {
	//상속을 받았기 때문에 멤버변수와 멤버메서드가 다 정의되어 있을 것이다.
	@Override
	public void run() {//스레드에 이미 정의되어 있었다.
		for (int i = 0; i < 1000; i++) {
			System.out.println("★");
			
		}
	}
}
