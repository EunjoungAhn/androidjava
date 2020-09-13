package 크롤링;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class 크롤링UI {
	static JTextField textField;//텍스트 필드를 아무데서나 불러오게 설정
	static JTextArea textArea = new JTextArea();//텍스트에리어 지역 제한 없이 불어오기 설정
	static 네이버증권크롤링2 naver = new 네이버증권크롤링2();//클래스 접근 편하게 설정
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JButton t1 = new JButton("카카오");
		t1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String kakao = "035720";//주식 회사 코드 저장 변수
				String[] result = naver.crawl(kakao);//네이버증원크롤링 클래스에서 crawl매서드를 통해
				//kakao에 담긴 String 값을 넘기고 나서 네이버증권크롤링2 클래스 crawl(String code) 매서드에서 처리한 값을 return 받고
				//String배열 result 에 값을 받아서(배열로 받았기(return) 때문에 배열로 다시 자료형을 맞추어 주고) 넣어주고
				//텍스트에리어에서 불러온 값의 result[i]의 인덱스 값에 맞추어서 출력해준다.
				textArea.append("회사이름: "+ result[0] + "\n" + "회사코드: "+ result[1] + "\n"  + "현재가: "+ result[2] 
						+ "\n"  + "어제와의 차이: "+ result[3] + "\n"  + "증감비율: "+ result[4] + "\n");
			}
		});
		t1.setBounds(31, 23, 97, 23);
		f.getContentPane().add(t1);

		JButton t2 = new JButton("CJ ENM");
		t2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cjenm = "035760";
				String[] result = naver.crawl(cjenm);
				textArea.append("회사이름: "+ result[0] + "\n" + "회사코드: "+ result[1] + "\n"  + "현재가: "+ result[2] 
						+ "\n"  + "어제와의 차이: "+ result[3] + "\n"  + "증감비율: "+ result[4] + "\n");
			}
		});
		t2.setBounds(31, 56, 136, 23);
		f.getContentPane().add(t2);

		JButton t3 = new JButton("넷마블");
		t3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String netmarble = "251270";
				String[] result = naver.crawl(netmarble);
				textArea.append("회사이름: "+ result[0] + "\n" + "회사코드: "+ result[1] + "\n"  + "현재가: "+ result[2] 
						+ "\n"  + "어제와의 차이: "+ result[3] + "\n"  + "증감비율: "+ result[4] + "\n");
			}
		});
		t3.setBounds(31, 89, 97, 23);
		f.getContentPane().add(t3);

		JLabel code_label = new JLabel("code");
		code_label.setBounds(271, 27, 57, 15);
		f.getContentPane().add(code_label);

		textField = new JTextField();
		textField.setBounds(258, 57, 116, 21);
		f.getContentPane().add(textField);
		textField.setColumns(10);

		JButton t4 = new JButton("크롤링시작");
		t4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code = textField.getText();//입력받은 코드를 받아서 
				String[] result = naver.crawl(code);//네이버증권크롤링2 클래스로 넘겨 처리 후 값을 다시 저장 
				textArea.append("회사이름: "+ result[0] + "\n" + "회사코드: "+ result[1] + "\n"  + "현재가: "+ result[2] 
						+ "\n"  + "어제와의 차이: "+ result[3] + "\n"  + "증감비율: "+ result[4] + "\n");
			}
		});
		
		t4.setBounds(258, 99, 116, 23);
		f.getContentPane().add(t4);
		
		
		textArea.setBounds(43, 152, 328, 264);
		f.getContentPane().add(textArea);
		
		f.setVisible(true);

	}
}
