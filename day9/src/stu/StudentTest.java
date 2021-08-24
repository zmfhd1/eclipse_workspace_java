package stu;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
	String name;
	int kor, eng, mat, sum, avg;
	
	
	Student(String name, int kor, int eng, int mat){
//		super(); //�̰� �׻� ���� �Ȱ�
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}
	
	void calc() {
		sum = kor + eng + mat;
		avg = sum / 3 ;
	}

	@Override
	public String toString() {
		return name + "-" + kor + "-" + eng + "-" + mat+ "-" + sum + "-" + avg + "\n";
//		return super.toString();
	}
	
	
}

public class StudentTest {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		//input.dat ���� �Է�
		FileReader fr = new FileReader("input.dat");
		Scanner s = new Scanner(fr); // fr.read()�� ����ϸ� 2����Ʈ ���ڷθ� �о�´�.
		
		while(s.hasNextLine() == true) //hasNextLine() �����ٿ� �����Ͱ� �ִ�??��� ���� �޼ҵ�
		{
//			Ver.1
//			String line = s.nextLine(); // ���� �о����
//			String inform[] = line.split(""); //������ �������� ������
//			Student s1 = new Student(inform[0], Integer.parseInt(inform[1]), 
//					Integer.parseInt(inform[2]), Integer.parseInt(inform[3]) );
//				s1.calc(); //�о�� ������ ����� ���ض�
//				System.out.println(s1.toString());
			
//			Ver.2
			while(s.hasNext() == true) {
				s.next();
				s.nextInt();
				s.nextInt();
				s.nextInt();
				Student s1 = new Student(s.next(), s.nextInt(), s.nextInt(), s.nextInt());
				s1.calc(); //�о�� ������ ����� ���ض�
//				System.out.println(s1.toString());
				list.add(s1);
			}
			
//			s1.calc(); //�о�� ������ ����� ���ض�
//			System.out.println(s1.toString());
			
			
//			�о�� �����͵��� ���� ���� ����������� ����
			int maxSum = 0;
			int rank = 0; //�ִ����� �л� list���� ��� index�� �ִ���
//			for(Student one : list)
			for(int i =0; i < list.size(); i++) {
//				System.out.println(one);
				if(list.get(i).sum > maxSum) {
					maxSum = list.get(i).sum;
					rank = i;
				}
			}
			
			//���� ������ ���� ���� ���Ͽ� ���
			FileWriter fw = new FileWriter("out.dat");
			for(Student one : list) {
				fw.write(one.toString());
			}
			
			fw.write("\n");
			fw.write("1�� : " + list.get(rank).name + " " + list.get(rank).sum + " " + list.get(rank).avg);
			fr.close();
			fw.close();
			
			
		}
		
	}

}
