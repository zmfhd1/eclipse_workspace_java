package client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("localhost", 9876); //Socket 생성하여 연결 요청
			System.out.println("=== " + socket.getInetAddress().getHostAddress() + " 9876포트 접속 성공.===");
	
//			키보드로부터 아이디와 압호를 입력받는다.
//			System.in.read();를 입력 받거나 Scanner()를 사용한다. 스캐너가 한글도 입력 받기 편하니까 스캐너쓰자.
			Scanner keyboard = new Scanner(System.in);
			System.out.print("아이디 입력 : ");
			String id = keyboard.next() + " "; //키보드로부터 입력받는 내용을 id에 저장
			System.out.print("암호 입력 : ");
			String pw = keyboard.next() + " "; //키보드로부터 입력받는 내용을 id에 저장
			
			System.out.println("=== 서버로 " + id + "," + pw + " 전송했습니다.===");
			
			
			
//			위의 키보드 입력내용을 서버로 출력
			OutputStream os = socket.getOutputStream();
//			os.write((id + "-" + pw).getBytes()); //아이디와 암호를 한번아 받아,"-" split을 시킨다.
			os.write(id.getBytes()); //sc.next(); //공백으로 분리하여 두번 읽겠다.
			os.write(pw.getBytes()); //sc.next();
			
//			서버로부터 처리결과 입력
			InputStream is = socket.getInputStream();
			Scanner sc = new Scanner(is);
			String server_reply = sc.nextLine();
			System.out.println("===" + server_reply + "");
			
			
			is.close();
			os.close();
			socket.close();
			System.out.println("접속 해제합니다.");
			
		}catch(IOException e){
			e.printStackTrace();			
		}

	}

}
