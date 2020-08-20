package 제어문;

public class 반복문4 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 100; i++) {
//			System.out.println(i%2 == 0);
			//4의 배수를 출력하려면 조건이 들어가야 한다.
			//조건은 비교이기 때문에 true, false의 결과를 보여주는 
			//if문을 for문 사이에 넣어서 4의 배수를 반복 출력해 준다.
			//4의배수 조건식이 false가 될때까지 반복.
			if (i%4 == 0) {
				System.out.println(i);
				count++;//반복이 될때 만다. 횟수를 더한다.
				//4의 배수가 총 몇개 인지 확인을 위해 count에 계속 하나씩 증가값을 추가함으로
				//4의 배수의 총 갯수를 구할 수 있다.
			}
		}
		System.out.println("4의배수 몇개:"+ count);
	}

}
