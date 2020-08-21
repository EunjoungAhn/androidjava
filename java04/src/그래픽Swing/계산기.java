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

public class 계산기 {

	public static void main(String[] args) {
		//프레임1
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(169, 169, 169));
		//이미지1
		ImageIcon img = new ImageIcon("cal.png");
		//라벨4
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		l2.setFont(new Font("굴림", Font.BOLD, 75));
		JLabel l3 = new JLabel();
		l3.setFont(new Font("굴림", Font.BOLD, 75));
		//저장된 값 보여주기 위한 라벨
		JLabel result = new JLabel();
		result.setForeground(new Color(220, 20, 60));
		result.setFont(new Font("굴림", Font.BOLD, 30));
		result.setBackground(new Color(255, 255, 255));
		
		//텍스트입력2
		JTextField t1 = new JTextField(10);//()안에 텍스트 입력받을 크기 글자수 넣기
		t1.setFont(new Font("굴림", Font.PLAIN, 40));
		t1.setBackground(Color.YELLOW);
		JTextField t2 = new JTextField(10);
		t2.setFont(new Font("굴림", Font.PLAIN, 40));
		t2.setBackground(Color.YELLOW);
		//버튼1
		JButton	plus = new JButton();//버튼만 이벤트 설정이 가능하다.
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//t1, t2에 입력한 값을 가지고 와야함.
				//가지고 온 값의 데이터 타입은 무조건 String
				String s1 = t1.getText();
				String s2 = t2.getText();
				//값을 가져왔는지 확인 하는 법 console에 찍어보기
				System.out.println("t1값: " + s1);
				System.out.println("t2값: " + s2);
				//연산을 위해 String에서 int로 바꾸어 주기
				int ss1 = Integer.parseInt(s1);
				int ss2 = Integer.parseInt(s2);
				int sum = ss1 + ss2;
//				JOptionPane.showMessageDialog(f,show);
				//처리한 결과를 사용자에게 보여줌.(출력)
//				result.setText(sum +"");//편법-하나라도 스크링이면 모두다 스크링이 되는 방식
				String sum2 = String.valueOf(sum);//int에서 String으로 바꾸어 주는 부품
				result.setText(sum2);
			}
		});
		plus.setForeground(Color.RED);
		plus.setFont(new Font("굴림", Font.BOLD, 40));
		plus.setBackground(Color.BLUE);
		plus.setText("+");
		//레이아웃1
		FlowLayout flow = new FlowLayout();
		//사이즈
		f.setSize(400, 800);
		
		//레이아웃 설정
		f.getContentPane().setLayout(flow);//가운데 적용이 된다.
		//이미지 적용
		l1.setIcon(img);
		//라벨 적용
		f.getContentPane().add(l1);
		//글자 적용
		l2.setText("숫자1");//라벨에 글자를 넣기
		//라벨 적용
		f.getContentPane().add(l2);
		//입력란 적용
		f.getContentPane().add(t1);
		//글자 적용
		l3.setText("숫자2");
		//라벨 적용
		f.getContentPane().add(l3);
		//입력란 적용
		f.getContentPane().add(t2);
		//버튼 적용
		f.getContentPane().add(plus);
		
		JButton minus = new JButton();
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int ss1 = Integer.parseInt(s1);
				int ss2 = Integer.parseInt(s2);
				int sum = ss1 - ss2;
				String sum2 = String.valueOf(sum);
				result.setText(sum2);
			}
		});
		minus.setText("-");
		minus.setForeground(Color.RED);
		minus.setFont(new Font("굴림", Font.BOLD, 40));
		minus.setBackground(Color.BLUE);
		f.getContentPane().add(minus);
		
		JButton mul = new JButton();
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int ss1 = Integer.parseInt(s1);
				int ss2 = Integer.parseInt(s2);
				int sum = ss1 * ss2;
				String sum2 = String.valueOf(sum);
				result.setText(sum2);
			}
		});
		mul.setText("*");
		mul.setForeground(Color.RED);
		mul.setFont(new Font("굴림", Font.BOLD, 40));
		mul.setBackground(Color.BLUE);
		f.getContentPane().add(mul);
		
		JButton div = new JButton();
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int ss1 = Integer.parseInt(s1);
				int ss2 = Integer.parseInt(s2);
				int sum = ss1 / ss2;
				String sum2 = String.valueOf(sum);
				result.setText(sum2);
			}
		});
		div.setText("/");
		div.setForeground(Color.RED);
		div.setFont(new Font("굴림", Font.BOLD, 40));
		div.setBackground(Color.BLUE);
		f.getContentPane().add(div);
		//값보여주는 라벨 적용
		f.getContentPane().add(result);
		
		
		
		
		//출력 (보여주기)
		f.setVisible(true);
	}

}
