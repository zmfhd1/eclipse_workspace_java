package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ServerTest {

	public static void main(String[] args) {	
		
		
		try {
			ServerSocket ss = new ServerSocket(9876); // 9876�� ��Ʈ ���� ��ü ����
			System.out.println("===�α��� ������ 9876��Ʈ�� �����մϴ�.===");
			
			while(true) {
				Socket socket = ss.accept(); //Ŭ���̾�Ʈ ���� ��û ����
				System.out.println("====" + socket.getInetAddress().getHostAddress() +"Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.====");
				
				//Ŭ���̾�Ʈ�κ��� ���̵�� ��ȣ ���޹޴´�.
				InputStream is = socket.getInputStream(); //�Է� ��Ʈ���� �����Ѵ�. InputStream�� ����Ʈ ��� �Է� ��Ʈ���� �ֻ��� Ŭ����.
				Scanner sc = new Scanner(is); //�Էµ� ������ �д´�.
				String id = sc.next(); //Ŭ���̾�Ʈ�� os.write()id.getBytes())���� �о�´�. id���� �Է¹޴´�. �Էµ� ������ String���� �д´�.
				String pw = sc.next(); //Ŭ���̾�Ʈ�� os.write()pw.getBytes())���� �о�´�. pw���� �Է¹޴´�. 
				System.out.println("===Ŭ���̾�Ʈ�� ������ ���̵�, ��ȣ��" + id +", "+ pw + "�Դϴ�.===");
				
				//users���� KEY�� id�� �����ϴ���, value pw�� �´��� Ȯ���Ѵ�.
				String toClient = "";
				boolean search = false;
				
				HashMap<String, String> users = new HashMap <String,String> (); //id, pw�� ������ ��ü ����
				users.put("multi", "campus");
				users.put("java", "program");
				users.put("oracle", "db");
				
				Set<String> idSet = users.keySet();
				for(String oneId : idSet) {
					if(oneId.equals(id)) { //id�� �ʿ� �����Ѵٸ�
						search = true;
						String pwMap = users.get(oneId);
						if(pwMap.equals(pw)) {
							toClient = "���� �α��� ����� �Դϴ�.";
						}
						else {
							toClient = "��ȣ�� �ٽ� Ȯ���ϼ���.";
						}
					}
				}//for end
				
				if(search == false) {
					toClient = "ȸ�����Ժ��� �ϼ���.";
				}
				
				//�α��� ó������� Ŭ���̾�Ʈ�� ���
				OutputStream os = socket.getOutputStream(); //
//				String server_reply = "�������ϴ�.";
				byte[] server_reply_byte = toClient.getBytes();
				os.write(server_reply_byte);
				System.out.println("===Ŭ���̾�Ʈ�� �����߽��ϴ�.");
				
				
				
//				if(id == "multi") {
//					if(pw != users.get("multi")) {
//						System.out.println("��ȣ�� Ȯ���ϼ���.");
//					}else {
//						return;
//					}
//					
//				}else if(id == "java"){
//					pw = users.get("java");
//					System.out.println("��ȣ�� Ȯ���ϼ���.");
//				}else if(id == "java"){
//					pw = users.get("oracle");					
//					System.out.println("��ȣ�� Ȯ���ϼ���.");
//				}else {
//					System.out.println("ȸ�������� �ϼ���.");
//				}
//				
//				System.out.println("===Ŭ���̾�Ʈ�� ������ ���̵��" + id + " �Դϴ�."); //�Էµ� ���� ���
//				
//				OutputStream os = socket.getOutputStream(); //��� ��Ʈ���� �����Ѵ�. OutputStream�� ����Ʈ ��� ��� ��Ʈ���� �ֻ��� Ŭ����.
//				
//				String id_reply;
//				
				
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
