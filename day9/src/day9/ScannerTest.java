package day9;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Ű���� ����2���� �Է��� ������");
		
		if(s.hasNextInt()) { //NextInt�� �� �ִ�
		int first = s.nextInt();
		int second = s.nextInt();
		System.out.println(first+second);
		}
		s.nextLine(); //10 20 �� �Է� ���� �о��
		System.out.println("Ű����� �ѱ� �����͸� �Է��� ������");
		String word = s.next();
		System.out.println(word);
		

	}

}
