package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//CRUD 중심으로 기능을 정의
//데이터와 관련된 작업(Data Access Object: DAO)
public class MemberDAO {

	String url = "jdbc:mysql://localhost:3306/shop1";
	String user = "root";
	String password = "1234";
	Connection con;
	
	public MemberDAO() throws Exception {
		// 위해 메인으로 잠시 변경.
		// DB프로그램 절차에 맞추어서 코딩
		// 1. connector설정
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("1. connector 연결 성공.!!");

		// 2. db연결 - ip, user name과 pw가 필요하다.
		//String url = "연결하는 방법://ip/port/db명";

				con = DriverManager.getConnection(url, user, password);
				System.out.println("2. db 연결 성공.!!");
	}
	
	//tel에서 한 글자 기준으로 전체 검색
	public List<MemberVO> all2(String tel) throws Exception {
		String sql = "select * from member where tel like '"+ tel +"%'";
		//like 조건 검색을 할때에는 '(사이)" 사이에 공백에 있으면 되고 위와같이 처리해줘야 한다.
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		//부모 업캐스팅
		List<MemberVO> list = new ArrayList<MemberVO>();
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			//Object(vo) Relational DB(row) Mapping - (ORM)이라고 부른다.
			MemberVO bag = new MemberVO();// 가방만들어서,
			System.out.println("검색결과가 있어요.");
			//5. MemberVO 클래스를 통해 가방에 넣기
			bag.setId(rs.getString("id"));
			bag.setPw(rs.getString("pw"));
			bag.setName(rs.getString("name"));
			bag.setTel(rs.getString("tel"));
			list.add(bag);
		}
		rs.close();
		ps.close();
		con.close();
		return list;
	}
	
	//tel의 데이터 기준 검색
			public List<MemberVO> all(String tel) throws Exception {
				String sql = "select * from member where tel = ? ";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, tel);
				ResultSet rs = ps.executeQuery();
				System.out.println("4. SQL문 전송 성공.!!");
				//부모 업캐스팅
				List<MemberVO> list = new ArrayList<MemberVO>();
				while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
					//Object(vo) Relational DB(row) Mapping - (ORM)이라고 부른다.
					MemberVO bag = new MemberVO();// 가방만들어서,
					System.out.println("검색결과가 있어요.");
					//5. MemberVO 클래스를 통해 가방에 넣기
					bag.setId(rs.getString("id"));
					bag.setPw(rs.getString("pw"));
					bag.setName(rs.getString("name"));
					bag.setTel(rs.getString("tel"));
					list.add(bag);
				}
				rs.close();
				ps.close();
				con.close();
				return list;
			}
			
	//전체 검색
		public List<MemberVO> all() throws Exception {
			String sql = "select * from member";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 성공.!!");
			//부모 업캐스팅
			List<MemberVO> list = new ArrayList<MemberVO>();
			while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
				//Object(vo) Relational DB(row) Mapping - (ORM)이라고 부른다.
				MemberVO bag = new MemberVO();// 가방만들어서,
				System.out.println("검색결과가 있어요.");
				//5. MemberVO 클래스를 통해 가방에 넣기
				bag.setId(rs.getString("id"));
				bag.setPw(rs.getString("pw"));
				bag.setName(rs.getString("name"));
				bag.setTel(rs.getString("tel"));
				list.add(bag);
			}
			rs.close();
			ps.close();
			con.close();
			return list;
		}
	
	// 기능을 정의할 때는 메서드(함수)를 사용

	// create메서드 호출시 입력값을 받아주는 중간 매개체 역할의 변수
	// =>매개변수(parameter, 파라메터)
	public void create(String id, String pw, String name, String tel) throws Exception {// main이 없을시 실행이 안되므로 db 연결 확인을

		// 3. sql문을 만둔다.
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. sql 생성 성공.!!");

		// 4. sql문은 전송
		ps.executeUpdate();
		System.out.println("4. sql문 전송 성공.!!");
		ps.close();
		con.close();
	}

	//DTO = VO 의 bag에 넣어서 적용하려고
	//객체의 주소를 넘기는 것이다.
	public boolean create(MemberVO vo) throws Exception {// main이 없을시 실행이 안되므로 db 연결 확인을

// 3. sql문을 만둔다.
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getId());
		ps.setString(2, vo.getPw());
		ps.setString(3, vo.getName());
		ps.setString(4, vo.getTel());
		System.out.println("3. sql 생성 성공.!!");

// 4. sql문은 전송
		int row = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공.!!");
		boolean result = false;
		if(row == 1) {
			result = true;
		}
		ps.close();
		con.close();
		return result;
	}

	// id 중복 체크 용
	public boolean read(String id) throws Exception {
		String sql = "select * from member where id =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql 생성 성공.!!");

		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 성공.!!");
		boolean result = true;
		if (rs.next() == true) {// 결과가 있는지 없는지 체크해주는 메서드
			// if (rs.next())와 동일함.
			// if문은 rs.next()가 true때만 실행
			System.out.println("검색결과가 있어요.");
			result = false;
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			System.out.println("검색결과 id:" + id2);
			System.out.println("검색결과 pw:" + pw);
			System.out.println("검색결과 name:" + name);
			System.out.println("검색결과 tel:" + tel);
		} else {
			System.out.println("검색결과가 없어요.");
		}
		rs.close();
		ps.close();
		con.close();
		return result;
	}

	// id, pw 맞는지 로그인 처리
	public boolean read(String id, String pw) throws Exception {
	

		// 3. sql문을 만둔다.
		String sql = "select * from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3. sql 생성 성공.!!");

		// 4. sql문은 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// 내용에는 없을 수도 있고, 많은 수도 있음.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 성공.!!");
		boolean result = false;// 로그인이 아닌 상태.
		if (rs.next() == true) {// 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("로그인 ok.");
			result = true;// 있음.
		} else {
			System.out.println("로그인 not.");
		}
		rs.close();
		ps.close();
		con.close();
		return result;
		// false면 로그인 not.
		// true면 로그인 ok.

	}
	
	public MemberVO one(String id) throws Exception {

		String sql = "select * from member where id =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql 생성 성공.!!");

		ResultSet rs = ps.executeQuery();
		System.out.println("4. sql문 전송 성공.!!");
		MemberVO bag = new MemberVO();//3.묶음 값을 꺼내주기 위해 객체 생성.
		if (rs.next() == true) {
			System.out.println("검색결과가 있어요.");
			//4.쿼리를 통해 DB에서 받은 값을   
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			//5. MemberVO 클래스를 통해 가방에 넣기
			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
		} else {
			System.out.println("검색결과가 없어요.");
		}
		rs.close();
		ps.close();
		con.close();
		//6.bag은 참조형 변수에 넣은 값, 주소를 전달!
		return bag;//7.회원CURDUI에 전달.

	}

	public boolean update(MemberVO vo) throws Exception {

		// 3. sql문을 만둔다.
		String sql = "update member set pw=?, name=?, tel =? where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getPw());
		ps.setString(2, vo.getName());
		ps.setString(3, vo.getTel());
		ps.setString(4, vo.getId());
		System.out.println("3. sql 생성 성공.!!");

		// 4. sql문은 전송
		int row = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공.!!");
		ps.close();
		con.close();
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		return result;
	}

	// db에서 삭제 처리 전담 메서드
	public boolean delete(String id) throws Exception {

		// db에 있는 데이터를 삭제하기 위한 sql 명령문
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		// UI에서 받은 파라미터값을 받기 위한 설정.
		ps.setString(1, id);
		// sql생성 확인용 출력
		System.out.println("3. sql 생성 성공.!!");
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
	
}
