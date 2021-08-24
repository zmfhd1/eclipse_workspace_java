package client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientTest {

	public static void main(String[] args) {
		try {
		Socket s = new Socket("127.0.0.1", 9);
		System.out.println("===���� ��ǻ�� 9999 ��Ʈ ���ӿ�û�մϴ�.===");
		System.out.println("===" + s.getInetAddress().getHostAddress() + "���� ����.===");
		
		//Ŭ���̾�Ʈ�� ������ ����
		String id = "�ȳ� �ϼ���\n"; //�ѱ� 5�� = 10����Ʈ, ����5�����̸� 5����Ʈ
		byte id_byte [] = id.getBytes();
					
		OutputStream os = s.getOutputStream();
		os.write(id_byte);
		
		System.out.println("=== "+ id_byte.length + " ===");
		System.out.println("=== ������ ���̵� �����߽��ϴ�. ===");
		
		//�����κ��� �Է�
		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is);
		String server_reply = sc.nextLine();
		System.out.println("===�����κ��� " + server_reply + " ������ �޾ҽ��ϴ�. ===");
		
		s.close();
		System.out.println("=== ���� ��ǻ�� 9990 ��Ʈ ���� �����մϴ�. ===");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
