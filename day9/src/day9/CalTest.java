package day9;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {

		while(true) {
			System.out.println("���� �޴�");
			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("3. ����");
			System.out.println("4. ������");
			System.out.println("5. ����");
			System.out.println();
			System.out.print("��ȣ�Է� : "); //���� print�������� �ٹٲ� ��������
			
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			
			if(num == 5) {
				System.out.println("�ý����� �����մϴ�.");
				return; // ���� 5�޼ҵ忡�� ���ԵǸ� �޼ҵ� ����
			}
			else if(num >=1 && num <=4) { // 1-4������ ��
				System.out.print("ù��° ���� : ");
				int data1 = s.nextInt();
				System.out.print("�ι�° ���� : ");
				int data2 = s.nextInt();
				if(num == 1) {
					System.out.println("������� = " + (data1 + data2));
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
				System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�.");
			}
			
		}		
	}

}
