package 조건문;

public class 별찍기 {

	public static void main(String[] args) {
		for (int c = 0; c < 5; c++) {//우측으로 c<5보다 작을때 까지 ""(공벡)을 찍으려 하는데 
			//아래에(for문 안에 for문)for문이 있어서 먼저 실행 
			for (int r = 0; r < c+1; r++) {//r은 0부터 시작하고 
				//r이 c+1이면 r값을 증가한다.
				//예) c가 0 이면 아래의 for문은 c+1이기 때문에 r보다 큰< 1이되며
				//조건식이 참(r보다<c+1이 크기)이 되기 때문에 별("*")을 출력하고
				//r++를 증가시킨다. cup에서
				System.out.print("*");
			}
			System.out.println("");//나머지 부분을 우측으로 c<5보다 작을때 까지 ""(공벡)을 찍는다. 
		}
		
//		*
//		**
//		***
//		****
//		*****
		
		for (int c = 0; c < 5; c++) {//우측부터 별을 찍기 위해
			for (int r = 0; r < 5-c; r++) {//예)5-0은 5이기에 별 5개를 찍고
				System.out.print("*");
			}
			System.out.println("");//예)나머지 부분을 공백으로 채운다.
		}

	}
	
//	*****
//	****
//	***
//	**
//	*

}
