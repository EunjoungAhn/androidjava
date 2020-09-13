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
	private static JTextField t5;
	private static MemberDAO dao = new MemberDAO();

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,360);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(37, 13, 57, 15);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setBounds(37, 59, 57, 15);
		f.getContentPane().add(lblPw);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(37, 114, 57, 15);
		f.getContentPane().add(lblName);
		
		JLabel lblTel = new JLabel("TEL");
		lblTel.setBounds(37, 166, 57, 15);
		f.getContentPane().add(lblTel);
		
		t1 = new JTextField();
		t1.setBounds(131, 10, 116, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(131, 56, 116, 21);
		t2.setColumns(10);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setBounds(131, 111, 116, 21);
		t3.setColumns(10);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setBounds(131, 163, 116, 21);
		t4.setColumns(10);
		f.getContentPane().add(t4);
		f.setVisible(true);
		
		t5 = new JTextField();
		t5.setBounds(131, 194, 116, 21);
		t5.setColumns(10);
		f.getContentPane().add(t5);
		
		JButton create = new JButton("회원가입");
		create.setBounds(12, 225, 97, 23);
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
		f.getContentPane().add(create);
		
		JButton Read = new JButton("중복체크");
		Read.setBounds(132, 225, 97, 23);
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
		f.getContentPane().add(Read);
		
		JButton Update = new JButton("회원수정");
		Update.setBounds(241, 225, 97, 23);
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
		f.getContentPane().add(Update);
		
		JButton Delete = new JButton("회원삭제");
		Delete.setBounds(350, 225, 97, 23);
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
		f.getContentPane().add(Delete);
		
		JButton logIn = new JButton("로그인");
		logIn.setBounds(12, 192, 97, 23);
		logIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String  id = t1.getText();
				String  pw = t2.getText();
				try {
					boolean result = dao.read(id, pw);
					if (result) {
						t5.setText("로그인 ok");
					}else{
						t5.setText("로그인 not ok");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		f.getContentPane().add(logIn);
		
		JButton Read_1 = new JButton("회원검색");
		Read_1.setBounds(12, 264, 97, 23);
		Read_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();//UI에서 값을 입력 받고
				MemberDAO dao = new MemberDAO();//입력 받은 값을 DB처리 하기 위해 객체를 생성하고
				try {//2.dao클래스에 one 메서드에 자료형인 MemberVO를 입력 UI에서 받은 String id값을 넘겨준다.
					MemberVO bag = dao.one(id);//1.받은 아이디 값을 통해 bag에 넣기위해
					//8.MemberVO bag에서 묶인 값을 MemberDAO one메서도를 통해 bag라는 
					//주소값으로 하나씩 꺼내서 다시 UI의 JTextField에 보여준다. 
					t1.setText(bag.getId());
					t2.setText(bag.getPw());
					t3.setText(bag.getName());
					t4.setText(bag.getTel());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		f.getContentPane().add(Read_1);
		
	}
}
