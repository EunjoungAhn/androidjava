package DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

//특정한 방법을 처리하는 클래스: 방법(model, db처리)클래스
public class DB처리전담 {
//DB처리하는 방법이 4단계로 정해져 있다.

	// 테스트하기 위해 main 설치
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		System.out.println("DB에 저장 처리 함.");
//		// 1. connector 설정
//		Class.forName("com.mysql.jdbc.Driver");
//		// 자바에서는 에러가 너무 많이 발생할 것 같은 상황에ㅔ서는 반드시
//		// 에러처리를 반드시 해주어야 함.
//		// 에러가 생길 여지가 있는 것 - 네트워크 연결, db연결, 파일연결, cpu연결
//		System.out.println("1. connector 설정 성공");
//		// 2. db연결
//		// 1) ip + port + db명
//		// 2) username: root
//		// 3) password: 1234
//		// java db connect
//		String url = "jdbc:mysql://localhost:3366/shop";
//		String user = "root";
//		String password = "1234";
//		Connection con = DriverManager.getConnection(url, user, password);
//		System.out.println("2. shop연결 성공!!");
//		
//		//db연동하는 index는 1부터 시작!
////		String sql = "delete from member where id = 'a' ";
//		String sql = "insert into member values (?,?,?,?)";//어떤 값을 받을지 아직 모른다.
//		// 컴퓨터는 이 문장을 그냥 String으로 인식!
//		PreparedStatement ps = con.prepareStatement(sql);
//		ps.setString(1, "test");
//		ps.setString(2, "test");
//		ps.setString(3, "test");
//		ps.setString(4, "test");
//		System.out.println("3. SQL문 생성 성공!!");
//
//		ps.executeUpdate();
//		System.out.println("4. SQL문을 mySQL로 네트워크 전송 성공!!");
//	}

	public void create(String id, String pw, String name, String tel) throws Exception {
		// JOptionPane.showMessageDialog(null,"DB에 저장 처리 함.");
		System.out.println("DB에 저장 처리 함.");
		// 1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		// 자바에서는 에러가 너무 많이 발생할 것 같은 상황에ㅔ서는 반드시
		// 에러처리를 반드시 해주어야 함.
		// 에러가 생길 여지가 있는 것 - 네트워크 연결, db연결, 파일연결, cpu연결
		System.out.println("1. connector 설정 성공");
		// 2. db연결
		// 1) ip + port + db명
		// 2) username: root
		// 3) password: 1234
		// java db connect
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. shop연결 성공!!");
		
		//db연동하는 index는 1부터 시작!
//		String sql = "delete from member where id = 'a' ";
		String sql = "insert into member values (?,?,?,?)";//어떤 값을 받을지 아직 모른다.
		// 컴퓨터는 이 문장을 그냥 String으로 인식!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL문 생성 성공!!");

		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL로 네트워크 전송 성공!!");
	}

	public void read() {
		JOptionPane.showMessageDialog(null, "DB에 검색 처리 함.");
	}

	public void update() {
		JOptionPane.showMessageDialog(null, "DB에 수정 처리 함.");
	}

	public void delete() {
		JOptionPane.showMessageDialog(null, "DB에 삭제 처리 함.");
	}
}
