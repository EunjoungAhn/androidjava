package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDTSender {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket();//자바에서는 임의의 5자리 포트 번호를 만들어서 전달.
		String str = "i am a android programmer!";
		byte[] data = str.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7100);

		socket.send(packet);
		socket.close();
	}

}
