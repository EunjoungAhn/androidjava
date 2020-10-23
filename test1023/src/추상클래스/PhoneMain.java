package 추상클래스;

public class PhoneMain {

	public static void main(String[] args) {
		ApplePhone11 a11 = new ApplePhone11();
		ApplePhone12 a12 = new ApplePhone12();
		a11.camera();
		a12.camera();
		//추상 클래스는(ApplePhone, Phone) 객체 생성이 불가능하다.
		//ApplePhone a = new ApplePhone();		
		//Phone p = new Phone() {
			
		}
}