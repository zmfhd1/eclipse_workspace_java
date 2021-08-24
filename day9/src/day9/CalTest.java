package day9;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {

		while(true) {
			System.out.println("계산기 메뉴");
			System.out.println("1. 덧셈");
			System.out.println("2. 뺄셈");
			System.out.println("3. 곱셈");
			System.out.println("4. 나눗셈");
			System.out.println("5. 종료");
			System.out.println();
			System.out.print("번호입력 : "); //같은 print문이지만 줄바꿈 하지않음
			
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			
			if(num == 5) {
				System.out.println("시스템을 종료합니다.");
				return; // 메인 5메소드에서 쓰게되면 메소드 종료
			}
			else if(num >=1 && num <=4) { // 1-4까지의 값
				System.out.print("첫번째 숫자 : ");
				int data1 = s.nextInt();
				System.out.print("두번째 숫자 : ");
				int data2 = s.nextInt();
				if(num == 1) {
					System.out.println("덧셈결과 = " + (data1 + data2));
				} else if(num == 2) {
					System.out.println(data1 - data2);
				} else if(num == 3) {
					System.out.println(data1 * data2);
				} else {
					if(data2 !=0) {
						System.out.println(data1 / data2);
					}
				}
			}
			else {
				System.out.println("잘못된 번호를 입력하셨습니다.");
			}
			
		}		
	}

}
