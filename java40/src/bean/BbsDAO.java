package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BbsDAO {

	String url = "jdbc:mysql://localhost:3306/shop1";
	String user = "root";
	String password = "1234";
	Connection con;

	public BbsDAO() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공.!!");

		// 2. db연결 - ip, user name과 pw가 필요하다.
//		String url = "연결하는 방법://ip/port/db명";

		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db 연결 성공.!!");
	}

	public boolean create(BbsVO vo) throws Exception {

		// 3. sql문을 만둔다.
		String sql = "insert into bbs values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, vo.getNo());
		ps.setString(2, vo.getTitle());
		ps.setString(3, vo.getContent());
		ps.setString(4, vo.getWriter());
		System.out.println("3. sql 생성 성공.!!");

		// 4. sql문은 전송
		int row = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공.!!");

		boolean result = false;
		if (row == 1) {
			result = true;
		}
		ps.close();
		con.close();

		return result;
	}

	// 검색 기능
	public BbsVO one(int no) throws Exception {
//      DB프로그램 절차에 맞추어서 코딩

		// 3. sql문을 만든다.
		String sql = "select * from bbs where no = ?";
		// select * from member where id = 'park' //setString
		// select * from bbs where no = 1 //setInt
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);

		// 4. sql문은 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// 내용에는 없을 수도 있고, 많은 수도 있음.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		BbsVO bag = new BbsVO();// 가방만들어서,
		if (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("검색결과가 있어요.");
			int no2 = rs.getInt("no");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writer = rs.getString("writer");
			// 가방에 넣기
			bag.setNo(no2);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);
			System.out.println("검색결과 title: " + title);
			System.out.println("검색결과 content: " + content);
			System.out.println("검색결과 writer: " + writer);
		} else {
			System.out.println("검색결과가 없어요.");
		}
		rs.close();
		ps.close();
		con.close();
		return bag;
		// bag은 참조형 변수, 주소를 전달!
	}

	public boolean update(BbsVO vo) throws Exception {

		// 3. sql문을 만둔다.
		String sql = "update bbs set title=?, content=?, writer=? where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getTitle());
		ps.setString(2, vo.getContent());
		ps.setString(3, vo.getWriter());
		ps.setInt(4, vo.getNo());
		System.out.println("3. sql 생성 성공.!!");

		// 4. sql문은 전송
		int row = ps.executeUpdate();
		System.out.println("4.sql문 전송 성공.!!");
		ps.close();
		con.close();
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		return result;
	}

	//삭제
	public boolean delete(int no) throws Exception {

		// 3. sql문을 만둔다.
		String sql = "delete from bbs where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		// sql문 전송
		int row = ps.executeUpdate();
		// sql문 전송 확인용 출력
		System.out.println("4. sql문 전송 성공.!!");
		ps.close();
		con.close();
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		return result;
	}

	// content에서 한 글자 기준으로 전체 검색
	public List<BbsVO> all2(String content) throws Exception {
		String sql = "select * from bbs where content like '" + content + "%'";
		// like 조건 검색을 할때에는 '(사이)" 사이에 공백에 있으면 되고 위와같이 처리해줘야 한다.
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		// 부모 업캐스팅
		List<BbsVO> list = new ArrayList<BbsVO>();
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			// Object(vo) Relational DB(row) Mapping - (ORM)이라고 부른다.
			BbsVO bag = new BbsVO();// 가방만들어서,
			System.out.println("검색결과가 있어요.");
			bag.setNo(rs.getInt("no"));
			bag.setTitle(rs.getString("title"));
			bag.setContent(rs.getString("content"));
			bag.setWriter(rs.getString("writer"));
			list.add(bag);
		}
		rs.close();
		ps.close();
		con.close();
		return list;
	}

	// title의 데이터 기준 검색
	public List<BbsVO> all(String title) throws Exception {
		String sql = "select * from bbs where title = ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, title);
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		// 부모 업캐스팅
		List<BbsVO> list = new ArrayList<BbsVO>();
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			// Object(vo) Relational DB(row) Mapping - (ORM)이라고 부른다.
			BbsVO bag = new BbsVO();// 가방만들어서,
			System.out.println("검색결과가 있어요.");
			bag.setNo(rs.getInt("no"));
			bag.setTitle(rs.getString("title"));
			bag.setContent(rs.getString("content"));
			bag.setWriter(rs.getString("writer"));
			list.add(bag);
		}
		rs.close();
		ps.close();
		con.close();
		return list;
	}

	public List<BbsVO> all() throws Exception {
		// 가방을 넣는 컨테이너 역할을 하게 됨!
		// <>안에는 컨테이너에 무엇을 넣을지 지정! 꺾세는 형변환 필요없이 넣고 꺼낼 수 있다.
		List<BbsVO> list = new ArrayList<BbsVO>();

		// 3. sql문을 만든다.
		String sql = "select * from bbs";
		// select * from member where id = 'park' //setString
		// select * from bbs where no = 1 //setInt
		// PreparedStatement: 데이터베이스에 매개변수화된 SQL 문을 전송하기 위한 PreparedStatement 객체 생성
		PreparedStatement ps = con.prepareStatement(sql);

		// 4. sql문은 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// ResultSet: 데이터베이스의 데이터 집합을 나타내는 데이터 표로, 데이터베이스에 쿼리문을 실행하여 생성된다.
		// 복수의 데이터를 가져올때 사용
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			// 가방을 여러개 만들어야 해서 while문 안에 넣는다.
			BbsVO bag = new BbsVO();// 가방만들어서,
			System.out.println("검색결과가 있어요.");
			int no2 = rs.getInt("no");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writer = rs.getString("writer");
			// 가방에 넣기
			bag.setNo(no2);
			bag.setTitle(title);
			bag.setContent(content);
			bag.setWriter(writer);
			// 컨테이너에 넣는다.
			list.add(bag);
		}
		rs.close();
		ps.close();
		con.close();
		return list;
		// bag은 참조형 변수, 주소를 전달!
	}

}
