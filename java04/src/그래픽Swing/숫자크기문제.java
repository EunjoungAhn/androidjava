package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 숫자크기문제 {

	public static void main(String[] args) {
		//프레임1
		JFrame f = new JFrame();
		//텍스트입력2
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		
		//2번째 문제 텍스트 입력란
		JTextField userNmae = new JTextField(10);
		JTextField year = new JTextField(10);
		
		//라벨
		JLabel result = new JLabel();
		result.setForeground(new Color(218, 112, 214));
		result.setFont(new Font("굴림", Font.BOLD, 20));
		
		//2번문제 결과 라벨
		JLabel result2 = new JLabel();
		
		//2번 문제 라벨
		JLabel name = new JLabel();
		//버튼1
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//사용자의 값 가져오기
				String num1 = t1.getText();
				String num2 = t2.getText();
				//String에서 int로 변경
				int nn1 = Integer.parseInt(num1);
				int nn2 = Integer.parseInt(num2);
				
				//비교한 값을 넣기 위한 변수
				int sum = 0;
				//큰값을 비교하는 조건 
				if(nn1 > nn2) {
					 sum = nn1;
				}else {
					 sum = nn2;
				}
				
				String lsum = String.valueOf(sum);
				result.setText(lsum);
			}
		});
		b1.setText("큰 숫자 표기");
		
		//2번문제 버튼
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//사용자의 값 가져오기
				String userName = userNmae.getText();
				String yeun = year.getText();
				//String에서 int로 변경
				int yeun2 = Integer.parseInt(yeun);
				
				//성인 판별 변수
				String songIn = "";
				
				//성인인지 비교하는 조건 
				if( yeun2 > 2002 ) {
					songIn = "성인이 아닙니다.";
				}else {
					songIn = "성인입니다";
				}
				
				result2.setText(userName + "은 " + songIn);
			}
		});
		
		//레이아웃1
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);;
		
		f.setSize(280,300);
		f.getContentPane().add(t1);
		f.getContentPane().add(t2);
		f.getContentPane().add(b1);
		f.getContentPane().add(result);
		//2번째 문제
		//라벨 글자
		name.setText("2번째 연도 입력 받는 문제");
		f.getContentPane().add(name);
		f.getContentPane().add(userNmae);
		f.getContentPane().add(year);
		f.getContentPane().add(b2);
		b2.setText("성인 판별");
		f.getContentPane().add(result2);
		
		//출력 (보여주기)
		f.setVisible(true);
	}

}
