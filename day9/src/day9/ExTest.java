package day9;

import java.util.Scanner;

public class ExTest {

	public static void main(String[] args) {
		
		
		System.out.println("계산기 메뉴");
		System.out.println("1. 덧셈");
		System.out.println("2. 뺄셈");
		System.out.println("3. 곱셈");
		System.out.println("4. 나눗셈");
		System.out.println("5. 종료");
		System.out.println();
		System.out.print("번호입력 : "); //같은 print문이지만 줄바꿈 하지않음
		
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		
		if(i == 1) {
			System.out.println("숫자 두개를 입력하세요");			
//			if(s.hasNextInt()) {
				int first = s.nextInt();
				int second = s.nextInt();
				System.out.println("" + first + " + " + second + " = " + (first + second));			
//			}			
		}
		else if(i == 2) {
			System.out.println("숫자 두개를 입력하세요");
//			if(s.hasNextInt()) {
				int first = s.nextInt();
				int second = s.nextInt();
				System.out.println("" + first + " - " + second + " = " + (first - second));			
//			}			
		}
		else if(i == 3) {
			System.out.println("숫자 두개를 입력하세요");
//			if(s.hasNextInt()) {
				int first = s.nextInt();
				int second = s.nextInt();
				System.out.println("" + first + " + " + second + " = " + (first * second));			
//			}			
		}
		else if(i == 4) {
			System.out.println("숫자 두개를 입력하세요");
//			if(s.hasNextInt()) {
				int first = s.nextInt();
				int second = s.nextInt();
				
				if (second == 0)
				{
					System.out.println("0으로 나눌 수 없습니다.");
				}
				else {
					System.out.println("" + first + " + " + second + " = " + (first / second));			
				}
//			}			
		}
		else if(i == 5) {
			System.out.println("시스템을 종료합니다.");
			return; // 메인 5메소드에서 쓰게되면 메소드 종료
		}
	}

}
