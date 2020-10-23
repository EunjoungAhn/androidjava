package 추상클래스;
//추상 클래스는 객체 생성 불가능

public abstract class ApplePhone implements MegaPhone {
	String tel = "010-1111-1111";
	//추상 메서드가 하나라도 포함되어 있으면,
	//추상 클래스라고 부른다!
	public abstract void camera();

	@Override
	public void internet() {
		System.out.println("애플폰으로 인터넷");
	}
	
	@Override
	public void call() {
		System.out.println("애플폰으로 전화");
	}

	@Override
	public void text() {
		System.out.println("애플폰으로 문자");
	}

	@Override
	public void kakao() {
		System.out.println("애플폰으로 카카오");
	}

	@Override
	public void map() {
		System.out.println("애플폰으로 지도");
	}

	@Override
	public void siri() {
		System.out.println("애플폰으로 시리");
	}

}
