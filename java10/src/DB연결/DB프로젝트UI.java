package DB연결;

import javax.swing.JOptionPane;

public class DB프로젝트UI {
	public static void main(String[] args) throws Exception {
		String id_user = JOptionPane.showInputDialog("id_user 입력");
		String date_post = JOptionPane.showInputDialog("date_post 입력");
		String hash_post = JOptionPane.showInputDialog("hash_post 입력");
		String img_post = JOptionPane.showInputDialog("img_post 입력");
		String like_post = JOptionPane.showInputDialog("like_post 입력");
		int like_post2 = Integer.parseInt(like_post); 
		
		PostTb PostTb = new PostTb();
		PostTb.createTb(id_user,date_post,hash_post,img_post,like_post2);
	}

}
