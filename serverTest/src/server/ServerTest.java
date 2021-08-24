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
			ServerSocket ss = new ServerSocket(9876); // 9876번 포트 서버 객체 생성
			System.out.println("===로그인 서버는 9876포트로 시작합니다.===");
			
			while(true) {
				Socket socket = ss.accept(); //클라이언트 연결 요청 수락
				System.out.println("====" + socket.getInetAddress().getHostAddress() +"클라이언트와 연결되었습니다.====");
				
				//클라이언트로부터 아이디와 암호 전달받는다.
				InputStream is = socket.getInputStream(); //입력 스트림을 생성한다. InputStream은 바이트 기반 입력 스트림의 최상위 클래스.
				Scanner sc = new Scanner(is); //입력된 내용을 읽는다.
				String id = sc.next(); //클라이언트의 os.write()id.getBytes())값을 읽어온다. id값을 입력받는다. 입력된 내용의 String값을 읽는다.
				String pw = sc.next(); //클라이언트의 os.write()pw.getBytes())값을 읽어온다. pw값을 입력받는다. 
				System.out.println("===클라이언트가 전달한 아이디, 암호는" + id +", "+ pw + "입니다.===");
				
				//users맵의 KEY에 id가 존재하는지, value pw가 맞는지 확인한다.
				String toClient = "";
				boolean search = false;
				
				HashMap<String, String> users = new HashMap <String,String> (); //id, pw를 저장할 객체 생성
				users.put("multi", "campus");
				users.put("java", "program");
				users.put("oracle", "db");
				
				Set<String> idSet = users.keySet();
				for(String oneId : idSet) {
					if(oneId.equals(id)) { //id가 맵에 존재한다면
						search = true;
						String pwMap = users.get(oneId);
						if(pwMap.equals(pw)) {
							toClient = "정상 로그인 사용자 입니다.";
						}
						else {
							toClient = "암호를 다시 확인하세요.";
						}
					}
				}//for end
				
				if(search == false) {
					toClient = "회원가입부터 하세요.";
				}
				
				//로그인 처리결과를 클라이언트로 출력
				OutputStream os = socket.getOutputStream(); //
//				String server_reply = "잘지냅니다.";
				byte[] server_reply_byte = toClient.getBytes();
				os.write(server_reply_byte);
				System.out.println("===클라이언트로 응답했습니다.");
				
				
				
//				if(id == "multi") {
//					if(pw != users.get("multi")) {
//						System.out.println("암호를 확인하세요.");
//					}else {
//						return;
//					}
//					
//				}else if(id == "java"){
//					pw = users.get("java");
//					System.out.println("암호를 확인하세요.");
//				}else if(id == "java"){
//					pw = users.get("oracle");					
//					System.out.println("암호를 확인하세요.");
//				}else {
//					System.out.println("회원가입을 하세요.");
//				}
//				
//				System.out.println("===클라이언트가 전달한 아이디는" + id + " 입니다."); //입력된 내용 출력
//				
//				OutputStream os = socket.getOutputStream(); //출력 스트림을 생성한다. OutputStream은 바이트 기반 출력 스트림의 최상위 클래스.
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
