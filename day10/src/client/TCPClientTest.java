package client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientTest {

	public static void main(String[] args) {
		try {
		Socket s = new Socket("127.0.0.1", 9);
		System.out.println("===로컬 컴퓨터 9999 포트 접속요청합니다.===");
		System.out.println("===" + s.getInetAddress().getHostAddress() + "접속 성공.===");
		
		//클라이언트가 서버로 전달
		String id = "안녕 하세요\n"; //한글 5개 = 10바이트, 영문5글자이면 5바이트
		byte id_byte [] = id.getBytes();
					
		OutputStream os = s.getOutputStream();
		os.write(id_byte);
		
		System.out.println("=== "+ id_byte.length + " ===");
		System.out.println("=== 서버로 아이디 전송했습니다. ===");
		
		//서버로부터 입력
		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is);
		String server_reply = sc.nextLine();
		System.out.println("===서버로부터 " + server_reply + " 응답을 받았습니다. ===");
		
		s.close();
		System.out.println("=== 로컬 컴퓨터 9990 포트 접속 해제합니다. ===");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
