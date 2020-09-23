package 형변환Casting;

public class 기본형형변환 {

	public static void main(String[] args) {
		//primitive (원시적인, 가공되지 않은) data
		// <-> derive (파생된, 가공된) data
		// 크기에 대한 것을 고려해야함.
		//정수 byte(1)//-128 ~ 127 -> 
		// shot(2)//-3만 ~ 3만 -> 
		// int(4)//-21억 ~ 21억 -> 
		// long(8) -> 부품
		
		byte a = 100; 
		int b = a; // 기본형 복사
		//int(큰) <- byte(작): 자동형변환
		
		int c = 120; //byte가 넣을 수 있는 크기만 넣을 수 있다.
		byte d = (byte)c;
		//byte(작) <- int(큰): 강제형변환
		
	}

}
