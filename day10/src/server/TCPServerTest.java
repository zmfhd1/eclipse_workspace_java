package server;

import java.io.OutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//���� 1�� - Ŭ���̾�Ʈ ������
public class TCPServerTest {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(9999);
			System.out.println("====������ 9999 ��Ʈ�� �����մϴ�====");
			
			while(true) {
				Socket s = ss.accept();
				System.out.println("====" + s.getInetAddress().getHostAddress() +"Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.====");
				
//				������ Ŭ���̾�Ʈ�κ��� �����͸� �Է¹��1
//				byte[] id_byte_server = new byte[5]; // ����ִ�
//				InputStream is = s.getInputStream();
//				is.read(id_byte_server); //Ŭ���̾�Ʈ�κ��� ���޹޾� �迭�� �����Ѵ�.
//				String id = new String(id_byte_server);
//				System.out.println("===Ŭ���̾�Ʈ�� ������ ���̵��" + id + " �Դϴ�.");
				

//				������ Ŭ���̾�Ʈ�κ��� �����͸� �Է¹��2
				InputStream is = s.getInputStream();
				Scanner sc = new Scanner(is); //Ű����inputstream�� ���� ���ϳ��뵵 ����
				String id = sc.nextLine();
				System.out.println("===Ŭ���̾�Ʈ�� ������ ���̵��" + id + " �Դϴ�.");
				
				
				OutputStream os = s.getOutputStream();
				String server_reply = "�������ϴ�.";
				byte[] server_reply_byte = server_reply.getBytes();
				os.write(server_reply_byte);
				
//				byte[] id_byte_server = new byte[5]; // ����ִ�
//				InputStream is = s.getInputStream();
//				is.read(id_byte_server); //Ŭ���̾�Ʈ�κ��� ���޹޾� �迭�� �����Ѵ�.
//				String id = new String(id_byte_server);
//				System.out.println("===Ŭ���̾�Ʈ�� ������ ���̵��" + id + " �Դϴ�.");
				
				
				
				
				s.close();
				System.out.println("====Ŭ���̾�Ʈ�� �������� �Ǿ����ϴ�.====");
			} //while end		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
