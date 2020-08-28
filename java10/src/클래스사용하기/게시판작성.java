package 클래스사용하기;

public class 게시판작성 {
	public String id;
	public String title;
	public String content;
	public String writer;
	
	public void 타이틀() {
		System.out.println("id, title, content, writer");
		System.out.println("----------------------------");
	}
	
	public void 글을쓰다() {
		System.out.println(id +","+title + "," +  content + "," + writer + " " + "게시물 작성");
	}
	
	public void 글을삭제하다() {
		System.out.println(id+ "," + title + "," +  content + "," + writer + " " + "게시물 삭제");
	}
	
	public void 글을읽다() {
		System.out.println(id + "," + title + "," +  content + writer + " " + "게시물 확인");
	}
	
	public void 글을수정하다() {
		System.out.println(id + "," + title + "," + content + "," +writer + " " + "게시물 수정");
	}
}
