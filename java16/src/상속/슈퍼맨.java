package 상속;

public class 슈퍼맨 extends 맨{
	//멤버변수 3개, 멤버메서드 2
	boolean fly;
	
	public 슈퍼맨(String name, int age, int power, boolean fly) {
		super(name, age, power);
		this.fly = fly;
	}

	public void space() {
		System.out.println("우주를 날다!");
	}

	@Override
	public String toString() {
		return "슈퍼맨 [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
}
