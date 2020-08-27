package 클래스만들기;
//class(부류, 같은 성격을 가진 group)
//tv부류가 일반적으로 가져야하는 기능을 정의
public class 티비 {
	//함수정의->메서드(method, 방법을 정의)!
	public void on() {
		System.out.println("티비를 키다");
		System.out.println("코드를 꽂다");
	}

	public void off() {
		System.out.println("티비를 끄다");
		System.out.println("코드를 뽑다");
	}

	public void channelChange() {
		System.out.println("채널을 돌리다");
	}
}
