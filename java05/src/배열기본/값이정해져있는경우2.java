package 배열기본;

public class 값이정해져있는경우2 {

	public static void main(String[] args) {
		String[] name = { "김", "이", "박", "최", "어" };
		for (String x : name) {
			System.out.println("이름: "+x);
		}

		int[] age = { 23, 24, 25, 26, 27 };
		for (int i : age) {
			System.out.println("나이: "+i);
		}
		char[] gender = { 'm', 'w', 'm', 'w', 'm' };
		for (char c : gender) {
			System.out.println("성별: "+c);
		}
		boolean[] BreakFast = { true, false, false, false, true };
		for (boolean b : BreakFast) {
			System.out.println("아침: "+b);
		}
		double[] weight = { 56.4, 55.6, 45.4, 67.6, 57.5 };
		for (double d : weight) {
			System.out.println("몸무개: "+d);
		}

		for (int i = 0; i < name.length; i++) {
			System.out.println(" 이름: " + name[i] + "| 나이: " + age[i] + "| 성별: " + gender[i] + "| 아침: " + BreakFast[i]
					+ "| 몸무개: " + weight[i]);
		}

	}

}
