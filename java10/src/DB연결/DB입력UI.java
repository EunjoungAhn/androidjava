package DB연결;

import javax.swing.JOptionPane;

public class DB입력UI {
	public static void main(String[] args) throws Exception {
		String id = JOptionPane.showInputDialog("id 입력");
		String pw = JOptionPane.showInputDialog("pw 입력");
		String name = JOptionPane.showInputDialog("name 입력");
		String tel = JOptionPane.showInputDialog("tel 입력");
		
		DB처리전담 db = new DB처리전담();
		db.create(id,pw,name,tel);
	}

}
