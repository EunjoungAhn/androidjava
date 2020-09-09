package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class 회원CURDUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static MemberDAO dao = new MemberDAO();

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(47, 130, 57, 15);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setBounds(47, 176, 57, 15);
		f.getContentPane().add(lblPw);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(47, 231, 57, 15);
		f.getContentPane().add(lblName);
		
		JLabel lblTel = new JLabel("TEL");
		lblTel.setBounds(47, 283, 57, 15);
		f.getContentPane().add(lblTel);
		
		t1 = new JTextField();
		t1.setBounds(141, 127, 116, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(141, 173, 116, 21);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(141, 228, 116, 21);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(141, 280, 116, 21);
		f.getContentPane().add(t4);
		f.setVisible(true);
		
		JButton create = new JButton("회원가입");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  id = t1.getText();
				String  pw = t2.getText();
				String  name = t3.getText();
				String  tel = t4.getText();
				
				try {
					dao.create(id, pw, name, tel);
				} catch (Exception e1) {
					e1.printStackTrace();
					System.out.println("sql 전달 실패");
				}
			}
		});
		create.setBounds(22, 342, 97, 23);
		f.getContentPane().add(create);
		
		JButton Read = new JButton("회원검색");
		Read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  id = t1.getText();//id로 검색
				
				try {
					int result = dao.read(id);//0이나 1이 리턴되어옴.
					if (result == 1) {//검색결과가 있음.
						t1.setText("있음");
						t2.setText("있음");
						t3.setText("있음");
						t4.setText("있음");
					}else {//검색결과가 없음.
						t1.setText("없음");
						t2.setText("없음");
						t3.setText("없음");
						t4.setText("없음");
						t1.setBackground(Color.green);
						t2.setBackground(Color.green);
						t3.setBackground(Color.green);
						t4.setBackground(Color.green);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		Read.setBounds(142, 342, 97, 23);
		f.getContentPane().add(Read);
		
		JButton Update = new JButton("회원수정");
		Update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  id = t1.getText();
				String  tel = t4.getText();
				try {
					dao.update(tel, id);
				} catch (Exception e1) {
					e1.printStackTrace();
					System.out.println("sql 전달 실패");
				}
			}
		});
		Update.setBounds(251, 342, 97, 23);
		f.getContentPane().add(Update);
		
		JButton Delete = new JButton("회원삭제");
		Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  id = t1.getText();
				
				try {
					dao.delete(id);
				} catch (Exception e1) {
					e1.printStackTrace();
					System.out.println("sql 전달 실패");
				}
			}
		});
		Delete.setBounds(360, 342, 97, 23);
		f.getContentPane().add(Delete);
	}
}
