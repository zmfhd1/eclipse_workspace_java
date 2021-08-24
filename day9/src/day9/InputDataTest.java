package day9;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student{
	String name;
	int score1, score2, score3;
	int sum, avg;
	
	public Student() {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;	
	}
	
	public int calc(){
		sum = score1 + score2 + score3;
		avg = sum / 3 ;
	}
	
	Student(){
		
	}
}

public class InputDataTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("원본파일명 : ");
		String sourcefile = s.next();
		System.out.println("목적파일명 : ");
		String destfile = s.next();
		
		
		FileReader fr = null;
		FileWriter fw = null;
				
		try {		
			fr = new FileReader("input.dat");
			fw = new FileWriter(s.next());
		Student st = new Student();
		
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
			fr.close();
			fw.close();
			}catch(IOException e) {
				e.printStackTrace(); 
			}
		}
		
		
		

	}

}
