package db연결;

public class BbsVO {
	private int no;
	private String title;
	private String content;
	private String writer;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	//이 주소가 가르치는 값들을 표기해 주는 설정 - 메뉴 source에  Generate toString() 클릭! 
	//아래처럼 자동으로 만들어줌
	@Override
	public String toString() {
		return "가르키는 값들 [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
}
