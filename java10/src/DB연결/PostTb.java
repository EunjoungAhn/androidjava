package DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class PostTb {
	public void createTb(String id_user, String date_post, String hash_post, String img_post, int like_post2) throws Exception {
		System.out.println("DB에 저장 처리 함.");
		// 1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 설정 성공");
		String url = "jdbc:mysql://localhost:3366/instabook";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. post_insta연결 성공!!");
		String sql = "insert into post_insta values (null,?,?,?,?,?)";//어떤 값을 받을지 아직 모른다.
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id_user);
		ps.setString(2, date_post);
		ps.setString(3, hash_post);
		ps.setString(4, img_post);
		ps.setInt(5, like_post2);
		System.out.println("3. SQL문 생성 성공!!");

		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL로 네트워크 전송 성공!!");
	}

}
