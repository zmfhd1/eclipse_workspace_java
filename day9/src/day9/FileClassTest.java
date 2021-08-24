package day9;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileClassTest {

	public static void main(String[] args) throws IOException {
		//����� �Ű����� �Է� : a.txt, . --> 
		File f = new File(args[0]);
		if(f.exists()) {
			//��������
			if(f.isFile()) {
				System.out.println("���� �б� ���ɿ��� : " + f.canRead());
				System.out.println("������ ���� ���ɿ��� : " + f.canWrite());
				System.out.println("���ϰ�� = " + f.getCanonicalPath() );
				System.out.println("���� ũ��(byte����) = " + f.length() );
				
				Date d = new Date(f.lastModified());				
				System.out.println("���������ð� = " + d);
			}
			else {
				//���丮����
				String details[] = f.list();
				for(String one : details) {
					System.out.println(one);
				}
			}
		}
		else {
			System.out.println(args[0] + " �� �������� �ʽ��ϴ�.");
		}
	}

}
