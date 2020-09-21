package 스레드;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadRun4 extends JFrame {
	JLabel top = new JLabel("1"); // 전역변수, 글로벌변수
	JLabel mid = new JLabel("");
	JLabel bottom = new JLabel("3");

	public ThreadRun4() {// static 없이 사용하기위해서
		// 이안에 메개변수와 메서드를 정의하여
		// main 클래스에서 생성하여 사용한다.
		setTitle("나의 멀티스레드");
		setSize(800, 300);
		getContentPane().setLayout(null);

		top.setBounds(59, 10, 513, 41);
		top.setFont(new Font("굴림", Font.BOLD, 35));
		getContentPane().add(top);

		mid.setBounds(170, 65, 257, 121);
		getContentPane().add(mid);

		bottom.setBounds(59, 194, 597, 41);
		bottom.setFont(new Font("굴림", Font.BOLD, 35));
		getContentPane().add(bottom);
		setVisible(true);

		CounterThread2 counter = new CounterThread2();
		counter.start();
		TimerThread2 time = new TimerThread2();
		time.start();
		ImgThread2 img = new ImgThread2();
		img.start();

	}

	// 내부클래스(inner class)
	// 변수를 다른 클래스와 공유할 목적
	// 단점: 내부클래스는 독립적으로 사용 불가
	public class CounterThread2 extends Thread {
		// 장점:클래스안에 변수를 경우할 수 있다.
		// 단점:클래스안에 넣었을 경우는 독립적으로 쓸 수 없다.
		@Override
		public void run() {// 오버라이드 된 것은 상속할 수 없다.
			for (int i = 500; i > 0; i--) {
//				System.out.println("카운터 " + i);
				top.setText("카운트: " + i);
				try {// 그렇기 때문에 try, catch로 예외처리를 한다.
					Thread.sleep(500);
				} catch (InterruptedException e) {// 에러가 발생시 'e'에 에 정보를 담아 준다.
					e.printStackTrace();// 에러가 어디있는지 출력해주는 함수
				}
			}
		}
	}

	public class TimerThread2 extends Thread {
		// @ => hera@naver.com(at, -에)
		@Override // 오버라이드, 재정의 (지워도 된다.)
		// @ => Annotation(표시, 표기, 주석) : 기능없음, 지워도됨
		// @Component => 기능있음. (지우면 안됨) = new (객체생성) 기능 역할을 해준다.
		public void run() {
			for (int i = 0; i < 300; i++) {
				Date date = new Date();
//				System.out.println(date);
				SimpleDateFormat dateChange = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String date2 = dateChange.format(date);
				bottom.setText(date2 + "");
				try {// 그렇기 때문에 try, catch로 예외처리를 한다.
					Thread.sleep(1000);
				} catch (InterruptedException e) {// 에러가 발생시 'e'에 에 정보를 담아 준다.
					e.printStackTrace();// 에러가 어디있는지 출력해주는 함수
				}
			}
		}
	}

	public class ImgThread2 extends Thread {
		@Override
		public void run() {
			String[] img = { "1.png", "2.png", "3.png", "4.png", "5.png", };
			for (int i = 0; i < img.length; i++) {
//				System.out.println("이미지: "+img[i]);
				ImageIcon imgChange = new ImageIcon(img[i]);
				mid.setIcon(imgChange);
				try {// 그렇기 때문에 try, catch로 예외처리를 한다.
					Thread.sleep(3000);
				} catch (InterruptedException e) {// 에러가 발생시 'e'에 에 정보를 담아 준다.
					e.printStackTrace();// 에러가 어디있는지 출력해주는 함수
				}
			}
		}
	}

	public static void main(String[] args) {
		ThreadRun4 t4 = new ThreadRun4();
	}

}
