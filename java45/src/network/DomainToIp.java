package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

//domain name: www.naver.com
//DNS(domain, 범위 name system) 서버 ==> ip주소
public class DomainToIp {

	public static void main(String[] args) throws Exception {
		String domain = "www.naver.com";
		String domain2 = "www.kakao.com";
		InetAddress ip = InetAddress.getByName(domain);
		InetAddress ip2 = InetAddress.getByName(domain2);
		
		System.out.println("ip주소: " + ip.getHostAddress());
		System.out.println("ip주소: " + ip2.getHostAddress());
	}

}
