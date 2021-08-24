package day9;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("키모드로 정수2개를 입력해 보세요");
		
		if(s.hasNextInt()) { //NextInt할 수 있니
		int first = s.nextInt();
		int second = s.nextInt();
		System.out.println(first+second);
		}
		s.nextLine(); //10 20 뒤 입력 엔터 읽어라
		System.out.println("키보드로 한글 데이터를 입력해 보세요");
		String word = s.next();
		System.out.println(word);
		

	}

}
