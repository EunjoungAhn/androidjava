package 상속;

//아무 것도 상속 받지 않는 클래슨느 
//extends object 가 숨겨저 있는 것이다.
public class 사람 {
	//멤버변수, 멤버메서드
	String name;
	int age;
	
	public void eat() {
		System.out.println("먹다.");
	}

	@Override
	public String toString() {
		return "사람 [name=" + name + ", age=" + age + "]";
	}

	//파타메터있는 생성자를 정의하게 되면,
	//파라메터없는 기본 생성자는 자동으로 만들어지지 않는다.
	//new 사람(); //이렇게 쓸 수 없다.
	public 사람(String name, int age) {
		super();//object(); 을 부른 것과 같다. = object을 부르는 것.
		//object(); 부모의 기본 생성자이다.
		this.name = name;
		this.age = age;
	}
}
