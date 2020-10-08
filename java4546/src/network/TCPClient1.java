package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient1 {

	public static void main(String[] args) throws Exception{
		for (int i = 0; i < 1000; i++) {//천면의 클라이언트를 생성하겠다.
			Socket socket = new Socket("localhost", 9100);//(접속할 host를 나를 기준으로,포트 설정)
			System.out.println("clinet1 서버와 연결됨.");
//BufferedReader는 문자로 읽겠다고 한다,   다리역할 new InputStreamReader,  socket.getInputStream()은 파일이다.
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//BufferedReader로 서버에서 보낸 것을 받아와야 하지만 받아오는 socket.getInputStream()과
			//다르므로 컨버터 역할을 하기 위해 new InputStreamReader를 사용하여 변환하여 BufferedReader으로 받아준다.
			//BufferedReader input으로 받은 값을 .readLine(); 불러와서 String data에 넣어주고
			String data = input.readLine();
			System.out.println("받은 데이터: " + data);//최종적으로 프린트.
		}
		
	}
}
