package 스레드;

import java.util.Date;

public class TimerThread extends Thread {
	//@ => hera@naver.com(at, -에)
	@Override //오버라이드, 재정의 (지워도 된다.)
	//@ => Annotation(표시, 표기, 주석) : 기능없음, 지워도됨
	//@Component => 기능있음. (지우면 안됨) = new (객체생성) 기능 역할을 해준다.
	public void run() {
		for (int i = 0; i < 300; i++) {
			Date date = new Date();
			System.out.println(date);
			try {//그렇기 때문에 try, catch로 예외처리를 한다.
				Thread.sleep(1000);
			} catch (InterruptedException e) {//에러가 발생시 'e'에 에 정보를 담아 준다.
				e.printStackTrace();//에러가 어디있는지 출력해주는 함수
			}
		}
	}
}
