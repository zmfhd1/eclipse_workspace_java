package day9;

import java.io.IOException;

public class SytemInTest {
	public static void main(String[] args) {
		try {
			System.in.read();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
