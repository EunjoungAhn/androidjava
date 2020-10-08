package network;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class 메신저B extends JFrame{
	private JTextField input;
	private JTextArea list;
	
	public 메신저B() {
		setTitle("메신저B");
		setSize(300,500);
		
		list = new JTextArea();
		list.setFont(new Font("Monospaced", Font.PLAIN, 25));
		getContentPane().add(list, BorderLayout.CENTER);
		
		input = new JTextField();
		input.setFont(new Font("굴림", Font.PLAIN, 25));
		getContentPane().add(input, BorderLayout.SOUTH);
		input.setColumns(10);
		
		list.setEditable(false);//list를 건들지 마라
		list.setFont(new Font("궁서", Font.BOLD, 15));
		
		input.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String data = input.getText();
				//입력한 값 가지고 와서, list up!
				list.append("me >>>" + data + "\n");
				input.setText("");
				try {
					//상대방에게 네트워크 전송!
					DatagramSocket socket = new DatagramSocket();//자바에서는 임의의 5자리 포트 번호를 만들어서 전달.
					byte[] data2 = data.getBytes();//byte로 바꾸어서 보내야한다.
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet = new DatagramPacket(data2, data2.length, ip, 5000);
					socket.send(packet);
					socket.close();
				} catch (Exception e2) {
					System.out.println("데이터 보내는 도중 에러발생");
				}
			}
		});
		setVisible(true);
	}
	
	public void process() {
		while (true) {
			try {
				DatagramSocket socket = new DatagramSocket(6000);
				//빈 패킷 필요
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);
				socket.receive(packet);
				System.out.println("받은 데이터: " + new String(data));
				list.append("you >>>" +new String(data)+ "\n");
				socket.close();
			} catch (Exception e) {
				System.out.println("데이터 받는 도중 에러발생");
			} 
		}
	}
	
	public static void main(String[] args) throws Exception {
		메신저B m = new 메신저B();
		m.process();
	}

}
