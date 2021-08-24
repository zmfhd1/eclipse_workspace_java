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
//		super(); //이건 항상 생략 된것
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
		
		//input.dat 파일 입력
		FileReader fr = new FileReader("input.dat");
		Scanner s = new Scanner(fr); // fr.read()를 사용하면 2바이트 문자로만 읽어온다.
		
		while(s.hasNextLine() == true) //hasNextLine() 다음줄에 데이터가 있니??라고 묻는 메소드
		{
//			Ver.1
//			String line = s.nextLine(); // 한줄 읽어오기
//			String inform[] = line.split(""); //내용을 공백으로 나눠라
//			Student s1 = new Student(inform[0], Integer.parseInt(inform[1]), 
//					Integer.parseInt(inform[2]), Integer.parseInt(inform[3]) );
//				s1.calc(); //읽어온 내용의 평균을 구해라
//				System.out.println(s1.toString());
			
//			Ver.2
			while(s.hasNext() == true) {
				s.next();
				s.nextInt();
				s.nextInt();
				s.nextInt();
				Student s1 = new Student(s.next(), s.nextInt(), s.nextInt(), s.nextInt());
				s1.calc(); //읽어온 내용의 평균을 구해라
//				System.out.println(s1.toString());
				list.add(s1);
			}
			
//			s1.calc(); //읽어온 내용의 평균을 구해라
//			System.out.println(s1.toString());
			
			
//			읽어온 데이터들을 이제 높은 점수순서대로 정렬
			int maxSum = 0;
			int rank = 0; //최대총점 학생 list에서 몇번 index에 있는지
//			for(Student one : list)
			for(int i =0; i < list.size(); i++) {
//				System.out.println(one);
				if(list.get(i).sum > maxSum) {
					maxSum = list.get(i).sum;
					rank = i;
				}
			}
			
			//이제 위에서 계산된 것을 파일에 출력
			FileWriter fw = new FileWriter("out.dat");
			for(Student one : list) {
				fw.write(one.toString());
			}
			
			fw.write("\n");
			fw.write("1등 : " + list.get(rank).name + " " + list.get(rank).sum + " " + list.get(rank).avg);
			fr.close();
			fw.close();
			
			
		}
		
	}

}
