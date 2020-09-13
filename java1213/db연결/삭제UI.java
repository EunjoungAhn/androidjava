package db연결;

import javax.swing.JOptionPane;

public class 삭제UI {

	public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("삭제할 id");
		//db에 삭제 명령을 보낼 부풀(class) 객체 생성
		MemberDAO db = new MemberDAO();
		//메서드 호출 후 id 변수를 매개변수로 메서드에 전달.
		db.delete(id);
	}

}
