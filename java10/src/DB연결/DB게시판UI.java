package DB연결;

import javax.swing.JOptionPane;

public class DB게시판UI {
	public static void main(String[] args) throws Exception {
		String title = JOptionPane.showInputDialog("title 입력");
		String content = JOptionPane.showInputDialog("content 입력");
		String writer = JOptionPane.showInputDialog("writer 입력");
		
		DB처리게시판전담 list = new DB처리게시판전담();
		list.create(title,content,writer);
	}

}
