package 그래픽Swing;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 나의그래픽 {

	public static void main(String[] args) {
		//자바는 부품조립식 코드 => 객체지향형 프로그래밍(OOP)
		//최근에는 거의 부품형식으로 코드를 프로그래밍하는 경향으로 바뀌었다.
		//틀(new) 가지고 부품을 불러온다.
		//ctrl + shift + o: 자동import
		JFrame f = new JFrame(); //new는 복사의 의미이다.
		JButton b1 = new JButton();
		b1.setBackground(Color.PINK);
		b1.addActionListener(new ActionListener() {//하단 탭에서 Design을 클릭 후 버튼을 더블클릭 하면 생긴다.
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "신선해요");
			}
		});
		JButton b2 = new JButton();
		b2.setBackground(Color.CYAN);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//버튼을 더블클릭하면 자동생성 된다.
				JOptionPane.showMessageDialog(f, "더워요");//버튼 클릭시 액션 설정
			}
		});
		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "난 이미지에요.");
			}
		});
//		String img = "sky.png";
		//이미지를 넣을때도 부품을 사용하여 이미지로 인식하게 처리한다.
		ImageIcon img = new ImageIcon("sky.png");
		b1.setText("봄");
		b2.setText("여름");
		b3.setIcon(img);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);//여기까지는 조립이 되었지만 안보인다.

		f.setSize(500, 700);//1차 프로젝트 사이즈
		FlowLayout flow = new FlowLayout();//순차 나열하는 부품, 하지만 버튼 크기 조절이 안된다.
		//자동으로 버튼 크기를 설정하는데 그 기준을 글자 크기에 둔다.
		f.getContentPane().setLayout(flow);
		
		//setVisible은 아래에 있어야 한다. (위의 모든것을 보여줘봐 하는 명령어 라서)
		f.setVisible(true);//setVisible로 보여줘야 한다.
		
		
	}

}
