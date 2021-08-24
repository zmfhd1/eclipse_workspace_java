package day10;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPTest {

	public static void main(String[] args) {
		try {
			InetAddress myip = InetAddress.getLocalHost();
			System.out.println(myip.getHostAddress()); // ������ǻ�� ip
			System.out.println(myip.getHostName()); //������ǻ�� ����
		
			// www.daum.net - ���� ���� ����(���� ������)
			InetAddress[] otherip = InetAddress.getAllByName("www.naver.com");
			for( InetAddress one : otherip) {
				System.out.println(one.getHostAddress());
			}
		
		
		
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
