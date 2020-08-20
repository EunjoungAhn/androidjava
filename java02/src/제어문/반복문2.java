package 제어문;

public class 반복문2 {

	public static void main(String[] args) {
		//정해진 횟수만큼 반복해보자.
		int start = 1; //시작값
		int end = 5; //끝값
		int add = 1; //증가값
		
		while (start <= end) {
			System.out.println(start);
			start  = start + add;//아직 cup가 연산을 하는데 렘은 아직 1이기 때문에
			//ram 저장을 위해 다시 start를 ram 에 초기화  
			
		}
		System.out.println("-----------");
//1번문제-100부터 1까지 출력
		int s = 100; //시작값
		int e = 1; //끝값
//		int ad = 1; //증가값
		while (s >= e) {//s가 e보다 작거나 같을때 까지 true이면 반복
			System.out.println(s);//출력
//			s = s - ad;//100-1을 cpu에서 계산 후 ram 에 있는 s에 초기화
			s--;//1씩 감소하는 것은 --를 쓸 수 있다.
			//while의 조건이 false가 될때까지 반복
		}
		System.out.println("-----------");
//2번문제- 5부터 10까지 출력
		int s2 = 5; //시작값
		int e2 = 10; //끝값
//		int add2 = 1; //증가값
		while (s2 <= e2) {//s가 e보다 크거나 같을때까지 true이면 반복
			System.out.println(s2);//출력
//			s2 = s2 + add2;//5+1을 cpu에서 계산 후 ram 에 있는 s에 초기화
			s2++; //증감연산자
			//while의 조건이 false가 될때까지 반복
		}
		System.out.println("-----------");
//3번 문제- 1부터 2씩 증가하여 100까지 출력
		int s3 = 1; //시작값
		int e3 = 101; //끝값
		int add3 = 2; //증가값
		while (s3 < e3) {//s가 e보다 클때까지 반복
			System.out.println(s3);//출력
			s3 = s3 + add3;//1+2를 cpu에서 계산 후 ram 에 있는 s에 초기화
			//while의 조건이 false가 될때까지 반복
		}
		
	}

}
