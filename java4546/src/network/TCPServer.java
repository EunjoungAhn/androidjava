package network;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		//1.연결 요청만 담당하는 서버용 socket필요
		//prototype(프로토타입) <-> singleton(싱글톤) 
		//필요할때마다 객체 생성 <-> 하나만 객체 생성 주소를 재사용
		//클라이언트가 들어오기를 기다리며 server 실행
		ServerSocket server = new ServerSocket(9100);//서버를 쪼개어 보내기 위해서 서버생성
		System.out.println("tcp 서버 시작됨");
		System.out.println("클라이언트의 요청을 기다리는 중....");
		
		int count = 0;//카운트 하기 위한 변수
		while (true) {//서버가 죽지 않고 클라이언트를 accept하기 위해 while적용
			//클라이언트가 들어오면 통신 연결을하겠다.
			Socket socket = server.accept();//클라이언트가 들어오면 accept하겠다.
			System.out.println(count +"번째 서버와의 연결 성공.");//클라이언트가 들어오면 콘솔에 알리겠다.
			count++;//반복 할 때마다 숫자가 증가
			
			//나가는 객체 생성
			//scanner 함수와 같다 생각하면 된다.      소켓으로 데이터를 내보내겠다. 
			PrintWriter	out = new PrintWriter(socket.getOutputStream(), true);
			out.println("i am a java programmer!!!");//내보낼 String 값
		}
	}

}
