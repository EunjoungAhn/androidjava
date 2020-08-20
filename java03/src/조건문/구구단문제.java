package 조건문;

public class 구구단문제 {

	public static void main(String[] args) {
		for (int x = 2; x < 9; x++) {//먼저 처음 반복문으로 x의 값을 9번 출력
			if (x % 2 == 1) {//짝수만 출력하기 위해서 비교값 입력
				continue;//countinue(홀수를 제외하고)를 썼으니 아래 for문 구문을 else로 감싸고 
			} else {//else 안에서는 다시 for문으로 y의 값을 9번 출력해준다.
				for (int y = 1; y < 10; y++) {//y는 1부터 시작해서 9까지 출력해서 
					System.out.println(x + "x" + y + "=" + (x * y));//x와 y값을 곱주고 출력 
				}
				System.out.println("-----------");//단 구별을 위해 추가
			}
		} // for
	}// main
}// class
