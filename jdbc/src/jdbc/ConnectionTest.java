package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		try {
		//0. oracle jdbc driver ȣ�� - ojdbc6.jar
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//1. db����(db����, ip, port, ����, ��ȣ)
		Connection con = DriverManager.getConnection
		("jdbc:oracle:thin:@211.46.26.223:1521:xe", "hr", "hr");
		System.out.println("���Ἲ��");
		
		//sql ���� - ��� �̿�
		//4. db ���� ����
		con.close();
		System.out.println("���������Ϸ�");
		}catch(ClassNotFoundException e){
			System.out.println("����̹� Ŭ���� ��ġ Ȯ�ο��");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
