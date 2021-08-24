package client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("localhost", 9876); //Socket �����Ͽ� ���� ��û
			System.out.println("=== " + socket.getInetAddress().getHostAddress() + " 9876��Ʈ ���� ����.===");
	
//			Ű����κ��� ���̵�� ��ȣ�� �Է¹޴´�.
//			System.in.read();�� �Է� �ްų� Scanner()�� ����Ѵ�. ��ĳ�ʰ� �ѱ۵� �Է� �ޱ� ���ϴϱ� ��ĳ�ʾ���.
			Scanner keyboard = new Scanner(System.in);
			System.out.print("���̵� �Է� : ");
			String id = keyboard.next() + " "; //Ű����κ��� �Է¹޴� ������ id�� ����
			System.out.print("��ȣ �Է� : ");
			String pw = keyboard.next() + " "; //Ű����κ��� �Է¹޴� ������ id�� ����
			
			System.out.println("=== ������ " + id + "," + pw + " �����߽��ϴ�.===");
			
			
			
//			���� Ű���� �Է³����� ������ ���
			OutputStream os = socket.getOutputStream();
//			os.write((id + "-" + pw).getBytes()); //���̵�� ��ȣ�� �ѹ��� �޾�,"-" split�� ��Ų��.
			os.write(id.getBytes()); //sc.next(); //�������� �и��Ͽ� �ι� �аڴ�.
			os.write(pw.getBytes()); //sc.next();
			
//			�����κ��� ó����� �Է�
			InputStream is = socket.getInputStream();
			Scanner sc = new Scanner(is);
			String server_reply = sc.nextLine();
			System.out.println("===" + server_reply + "");
			
			
			is.close();
			os.close();
			socket.close();
			System.out.println("���� �����մϴ�.");
			
		}catch(IOException e){
			e.printStackTrace();			
		}

	}

}
