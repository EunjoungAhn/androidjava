package 클래스만들기;

import 클래스사용하기.게시판작성;

public class 게시물 {

	public static void main(String[] args) {
		게시판작성 list = new 게시판작성();
		list.id = "1";
		list.title = "java";
		list.content = "fun java";
		list.writer = "park";
		
		게시판작성 list2 = new 게시판작성();
		list2.id = "2";
		list2.title = "jsp";
		list2.content = "fun jsp";
		list2.writer = "kim";
		
		list.타이틀();
		
		list.글을쓰다();
		list2.글을쓰다();
		
		list.글을읽다();
		list.글을수정하다();
		list2.글을삭제하다();
		
		
	}
}
