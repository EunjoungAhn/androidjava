package 배열기본;

public class 배열개념2 {

	public static void main(String[] args) {
		//배열은 일반적으로 같은 타입을 묶을 때 사용!
		//다양한 타입을 묶을 떄는 배열을 쓰지 않음.!(가능 하나 비효율적이다.)
		//배열은 고정되니 크기를 가진다. (크기변경 불가)
		//크기가 고정이여서 남는 공간에 대한 메모리 방치로 효과 적이지는 않다.
		//기본값과 참조값의 주소 찾는 것이 다르니 에러를 잡을때 다르다.
		double[] ondo = new double[7];
		ondo[0] = 32.2;
		ondo[1] = 21.1;
		ondo[2] = 31.5;
		ondo[3] = 24.3;
		ondo[4] = 21.9;
		ondo[5] = 23.4;
		ondo[6] = 33.3;
		
		int day = 1;
		
		System.out.println("일주일간 온도");
		for (int i = 0; i < ondo.length; i++) {
			System.out.println(day + "일 온도: " + ondo[i]);
			day++;
		}
	}

}
