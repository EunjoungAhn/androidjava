package 제어문;

public class 조건문 {

	public static void main(String[] args) {
//		조건이 여러개 일 때 - if~else if~.....~else
//		if,if,if,if...여러개와 if~else 쓰는차이
		//조건을 따로 따로 검사하고 싶으면 if 여러개
		//조건을 검사하다가 그만 검사하고 싶을때 else if
		int jumsu = 55;
		if (jumsu >= 90) {
			System.out.println("A");
		}else if (jumsu >= 80) {
			System.out.println("B");
		}else if (jumsu >= 70) {
			System.out.println("C");
		}else if (jumsu >= 60){
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
