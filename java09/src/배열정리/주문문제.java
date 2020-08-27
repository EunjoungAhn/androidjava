package 배열정리;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class 주문문제 {
	private static int count = 0;
	private static int countAll = 0;
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel 이미지 = new JLabel("New label");
		이미지.setBounds(57, 90, 348, 269);
		f.getContentPane().add(이미지);
		
		JTextField num = new JTextField();
		num.setBounds(340, 23, 116, 29);
		f.getContentPane().add(num);
		num.setColumns(10);
		
		JLabel sum = new JLabel("");
		sum.setBounds(212, 415, 208, 25);
		f.getContentPane().add(sum);
		
		JButton 짬뽕 = new JButton("짬뽕");
		짬뽕.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("짬뽕.jpg");
				이미지.setIcon(icon);
				count++;
				num.setText(count + "개");
				countAll += 4000;
				sum.setText(countAll + "원");
			}
		});
		짬뽕.setBounds(27, 23, 88, 36);
		f.getContentPane().add(짬뽕);
		
		JButton 우동 = new JButton("우동");
		우동.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("우동.jpg");
				이미지.setIcon(icon);
				count++;
				num.setText(count + "개");
				countAll += 4500;
				sum.setText(countAll + "원");
			}
		});
		우동.setBounds(135, 23, 88, 36);
		f.getContentPane().add(우동);
		
		JButton 짜장 = new JButton("짜장");
		짜장.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("짜장.jpg");
				이미지.setIcon(icon);
				count++;
				num.setText(count + "개");
				countAll += 5000;
				sum.setText(countAll + "원");
			}
		});
		짜장.setBounds(240, 23, 88, 36);
		f.getContentPane().add(짜장);
		
		JLabel lblNewLabel = new JLabel("지불할 총 금액");
		lblNewLabel.setBounds(57, 404, 145, 36);
		f.getContentPane().add(lblNewLabel);
		
		
		
		f.setVisible(true);
	}
}
