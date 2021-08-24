package day9;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileClassTest {

	public static void main(String[] args) throws IOException {
		//명령행 매개변수 입력 : a.txt, . --> 
		File f = new File(args[0]);
		if(f.exists()) {
			//파일인지
			if(f.isFile()) {
				System.out.println("파일 읽기 가능여부 : " + f.canRead());
				System.out.println("파일의 쓰기 가능여부 : " + f.canWrite());
				System.out.println("파일경로 = " + f.getCanonicalPath() );
				System.out.println("파일 크기(byte단위) = " + f.length() );
				
				Date d = new Date(f.lastModified());				
				System.out.println("최종수정시각 = " + d);
			}
			else {
				//디렉토리인지
				String details[] = f.list();
				for(String one : details) {
					System.out.println(one);
				}
			}
		}
		else {
			System.out.println(args[0] + " 는 존재하지 않습니다.");
		}
	}

}
