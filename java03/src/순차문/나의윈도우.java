package 순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class 나의윈도우 {

	public static void main(String[] args) {
		JFrame f  = new JFrame();
		f.setSize(400, 600);
		
		JTextPane textPane = new JTextPane();
		f.getContentPane().add(textPane, BorderLayout.CENTER);
		f.setVisible(true);
		
		JButton btnNewButton = new JButton("홈");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나 홈이야!");
				textPane.setText("글자");
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		
		f.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
	}

}
