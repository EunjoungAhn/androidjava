package bean;

public class MemberVO {
	//공간을 만들어 주어야 한다.
	//private라고 쓰면, 이 클래스내에서만 변수에 접근해서 쓸 수 있음.
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	//자동으로 만드려면 Source -> Generate getter and setter 클릭
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//각 변수에 값을 넣는, 뺴는 메서드를 정의하면 됨.!
	//가방에 넣을 때는 set메서드로 정의: setters (set이 여러개)
	//가방에서 꺼낼 떄는 get메서드로 정의: getters (get이 여러개)
	//set 넣어줄 때
//	public void setId(String id) {
//		//변수의 이름이 같으면 가장 가까운 동일한 이름과 같다고 생각한다.
//		//그래서 전역 변수에 있는 id를 써야 하므로 this(여기 클라스의 id와 같다.)
//		 this.id = id;
//	}
//	
//	public void setPw(String pw) {
//		this.pw = pw;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setTel(String tel) {
//		this.tel = tel;
//	}
//	
//	//get은 꺼내올때 쓰는 것
//	public String getId() {
//		return id;
//	}
//	
//	public String getPw() {
//		return pw;
//	}
	
	
}
