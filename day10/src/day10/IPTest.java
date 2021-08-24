package day10;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPTest {

	public static void main(String[] args) {
		try {
			InetAddress myip = InetAddress.getLocalHost();
			System.out.println(myip.getHostAddress()); // 현재컴퓨터 ip
			System.out.println(myip.getHostName()); //현재컴퓨터 네임
		
			// www.daum.net - 다음 서버 접속(다음 아이피)
			InetAddress[] otherip = InetAddress.getAllByName("www.naver.com");
			for( InetAddress one : otherip) {
				System.out.println(one.getHostAddress());
			}
		
		
		
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
