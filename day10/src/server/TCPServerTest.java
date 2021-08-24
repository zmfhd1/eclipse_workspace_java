package server;

import java.io.OutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//서버 1개 - 클라이언트 여러개
public class TCPServerTest {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(9999);
			System.out.println("====서버는 9999 포트로 시작합니다====");
			
			while(true) {
				Socket s = ss.accept();
				System.out.println("====" + s.getInetAddress().getHostAddress() +"클라이언트와 연결되었습니다.====");
				
//				서버가 클라이언트로부터 데이터를 입력방법1
//				byte[] id_byte_server = new byte[5]; // 비어있다
//				InputStream is = s.getInputStream();
//				is.read(id_byte_server); //클라이언트로부터 전달받아 배열을 저장한다.
//				String id = new String(id_byte_server);
//				System.out.println("===클라이언트가 전달한 아이디는" + id + " 입니다.");
				

//				서버가 클라이언트로부터 데이터를 입력방법2
				InputStream is = s.getInputStream();
				Scanner sc = new Scanner(is); //키보드inputstream도 가능 파일내용도 가능
				String id = sc.nextLine();
				System.out.println("===클라이언트가 전달한 아이디는" + id + " 입니다.");
				
				
				OutputStream os = s.getOutputStream();
				String server_reply = "잘지냅니다.";
				byte[] server_reply_byte = server_reply.getBytes();
				os.write(server_reply_byte);
				
//				byte[] id_byte_server = new byte[5]; // 비어있다
//				InputStream is = s.getInputStream();
//				is.read(id_byte_server); //클라이언트로부터 전달받아 배열을 저장한다.
//				String id = new String(id_byte_server);
//				System.out.println("===클라이언트가 전달한 아이디는" + id + " 입니다.");
				
				
				
				
				s.close();
				System.out.println("====클라이언트와 연결해제 되었습니다.====");
			} //while end		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
