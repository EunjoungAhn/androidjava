package db연결;

import javax.swing.JOptionPane;

public class 회원가입UI2 {

	public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("id입력");
		String pw = JOptionPane.showInputDialog("pw입력");
		String name = JOptionPane.showInputDialog("name입력");
		String tel = JOptionPane.showInputDialog("tel입력");
		
		//가방을 만들고
		MemberVO bag = new MemberVO();
		//set메서드를 통해서 가방에 각 값들을 하나씩 넣으세요!
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		
		//가방을 전달해야 한다.
		MemberDAO dao = new MemberDAO();
		//MemberVO bag로 생성된 객에서 주소 담겨있고
		//결국 주소값을 넘기는 것이다.
		dao.create(bag);
		
		
	}

}
