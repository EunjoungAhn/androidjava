package dbcp;

public class SingletonTest {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			ConManager con = ConManager.getInstance();
			System.out.println(con);
		}
		ConManager con2 = ConManager.getInstance();
		System.out.println(con2);//새로운 객체가 생성 안된다.
		//하나만 객체를 생성하여서 계속 사용하는 것이다.
	}
}
