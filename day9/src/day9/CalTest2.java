package day9;

import java.util.Scanner;

public class CalTest2 {

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
				
				Calculator c = new Calculator(data1, data2, num);
				String calcResult = c.calc();
				System.out.println(calcResult);
				
			}
			else {
				System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�.");
			}			
		}		
	}
}//CalTest end

class Calculator {	
	int data1;
	int data2;
	int num;
	
	public Calculator(int data1, int dat2, int num) {
		this.data1 = data1;
		this.data2 = data2;
		this.num = num;
	}	
	String calc() {
		String op[] = {"+", "-", "*", "/"};
		String result = data1 + op[num-1] + data2 + "=";
		
		if(num ==1) {
			result += data1 + data2;
		} else if(num == 2) {
			result += data1 - data2;
		} else if(num == 3) {
			result += data1 * data2;
		} else {
			result += data1 / data2;
		}
		return result;
	}
	}

