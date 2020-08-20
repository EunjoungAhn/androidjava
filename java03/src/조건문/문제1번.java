package 조건문;

import javax.swing.JOptionPane;

public class 문제1번 {

	public static void main(String[] args) {
		//반복해서 물어보고 종료 하는 문제

		//누적시키는 변수는 반복문안에 넣으면 안됨.
		//반복할 때마다 누적되지 않고, 초기화되기 때문에.!
		int countOk = 0, countNo = 0, countEtc =0; //각각의 답변에 카운터 하기 위해 변수 생성.
		String ch = ""; //중복된 답변 코드를 제거 하기 위해 변수 설정. 
		while(true) {//졸료 되기 전까지 true로 므한 반복 설정. 
			//사용자에게 답변 요정
			String data = JOptionPane.showInputDialog("ok)긍정, no)부정, etc)기타, exit)종료");
			if (data.equals("ok")) {//사용자가 ok라고 입력하면  
				ch = "긍정";//긍정 답변을 출력하고 
				countOk++;//긍정 횟수 증감
			} else if (data.equals("no")) {
				ch ="부정";//부정 답변을 출력하고
				countNo++;//부정 횟수 증감
			} else if (data.equals("etc")){
				ch ="잘모르겠어요.";//기타 답변을 출력하고
				countEtc++;//기타 횟수 증감
			}else if (data.equals("exit")){//시스텀 종료를 위한 입력값
				System.out.println("종료합니다.");
				System.exit(0);//시스템 종료 함수
			}
			//모든 카운터과 사용자가 적은 카운터 출력
			System.out.println("---내가 적은 답---");
			System.out.println(ch);
			System.out.println("---총 횟수는?---");
			System.out.println("긍정 횟수: "+ countOk);
			System.out.println("부정 횟수: "+countNo);
			System.out.println("기타 횟수: "+countEtc);
		}

	}

}
