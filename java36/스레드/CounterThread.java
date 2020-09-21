package 스레드;

public class CounterThread extends Thread {
	@Override
	public void run() {//오버라이드 된 것은 상속할 수 없다.
		for (int i = 500; i > 0; i--) {
			System.out.println("카운터 " + i);
			try {//그렇기 때문에 try, catch로 예외처리를 한다.
				Thread.sleep(500);
			} catch (InterruptedException e) {//에러가 발생시 'e'에 에 정보를 담아 준다.
				e.printStackTrace();//에러가 어디있는지 출력해주는 함수
			}
		}
	}
}
