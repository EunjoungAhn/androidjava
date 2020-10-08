package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDTReceiver {
	//receiver가 먼저 실행되어야 한다.
	//skcket프로그램(소켓프로그램)
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(7100);
		System.out.println("받는 쪽 소켓 시작");
		System.out.println("받은 준비 끝");
		//빈 패킷 필요
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		socket.receive(packet);
		System.out.println("받은 데이터: " + new String(data));
		socket.close();
	}

}
