package 연산자;

public class 기본형형변환 {

	public static void main(String[] args) {
		//큰 <-작: 자동형변화
		int x = 100; //int -21억~21억, 4바이트 
		//쓸때 없는 메모리를 낭비하기 때문에 더 작은 형으로 바꾸어 준다.
		byte y = 120; //-128~127까지만 넣을 수 있다, 1바이트
		x = y;
		System.out.println("x: "+ x);
		int z = 127;
		//작<-큰: 강제형변환()를 사용
		//(자르고 싶은 데이터형)변수명
		byte w = (byte)z;
		System.out.println("z: "+ z);
		
		int q = 1000;
//		byte t = q;
//		강제형변환하는 경우는 
//		강제로 변환하고자 하는 타입 번위에
//		값이 들어가야 한다. 
	}

}
