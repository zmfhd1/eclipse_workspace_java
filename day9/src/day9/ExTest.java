package day9;

import java.util.Scanner;

public class ExTest {

	public static void main(String[] args) {
		
		
		System.out.println("���� �޴�");
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ������");
		System.out.println("5. ����");
		System.out.println();
		System.out.print("��ȣ�Է� : "); //���� print�������� �ٹٲ� ��������
		
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		
		if(i == 1) {
			System.out.println("���� �ΰ��� �Է��ϼ���");			
//			if(s.hasNextInt()) {
				int first = s.nextInt();
				int second = s.nextInt();
				System.out.println("" + first + " + " + second + " = " + (first + second));			
//			}			
		}
		else if(i == 2) {
			System.out.println("���� �ΰ��� �Է��ϼ���");
//			if(s.hasNextInt()) {
				int first = s.nextInt();
				int second = s.nextInt();
				System.out.println("" + first + " - " + second + " = " + (first - second));			
//			}			
		}
		else if(i == 3) {
			System.out.println("���� �ΰ��� �Է��ϼ���");
//			if(s.hasNextInt()) {
				int first = s.nextInt();
				int second = s.nextInt();
				System.out.println("" + first + " + " + second + " = " + (first * second));			
//			}			
		}
		else if(i == 4) {
			System.out.println("���� �ΰ��� �Է��ϼ���");
//			if(s.hasNextInt()) {
				int first = s.nextInt();
				int second = s.nextInt();
				
				if (second == 0)
				{
					System.out.println("0���� ���� �� �����ϴ�.");
				}
				else {
					System.out.println("" + first + " + " + second + " = " + (first / second));			
				}
//			}			
		}
		else if(i == 5) {
			System.out.println("�ý����� �����մϴ�.");
			return; // ���� 5�޼ҵ忡�� ���ԵǸ� �޼ҵ� ����
		}
	}

}
