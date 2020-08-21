package 그래픽Swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class 그래픽연습 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "신선해요");
			}
		});
		b1.setFont(new Font("궁서", Font.BOLD, 95));
		b1.setForeground(Color.BLUE);
		b1.setBackground(Color.YELLOW);
		JButton b2 = new JButton();
		b2.setVerticalAlignment(SwingConstants.TOP);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "더워요");
			}
		});
		b2.setFont(new Font("궁서", Font.BOLD, 95));
		b2.setForeground(Color.GREEN);
		b2.setBackground(Color.PINK);
		
		b1.setText(" 봄 ");
		b2.setText("여름");
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		
		f.setSize(300, 300);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		f.setVisible(true);
	}

}
