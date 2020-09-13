package db연결;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class BbsUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static BbsDAO dao = new BbsDAO();

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("제목");
		lblNewLabel.setBounds(91, 10, 57, 15);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("글쓴이");
		lblNewLabel_1.setBounds(393, 10, 57, 15);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("No.");
		lblNewLabel_1_1.setBounds(22, 10, 57, 15);
		f.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("내용");
		lblNewLabel_1_2.setBounds(220, 10, 57, 15);
		f.getContentPane().add(lblNewLabel_1_2);

		t1 = new JTextField();
		t1.setBounds(12, 35, 57, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(81, 35, 127, 21);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(220, 35, 157, 21);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(389, 35, 83, 21);
		f.getContentPane().add(t4);
		f.setVisible(true);

		JButton create = new JButton("글쓰기");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no = Integer.parseInt(t1.getText());
				String content = t3.getText();
				BbsDAO dao = new BbsDAO();
				try {
					dao.update(no, content);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		create.setBounds(22, 66, 83, 23);
		f.getContentPane().add(create);
		
		JTextArea all = new JTextArea();

		JButton readAll = new JButton("전체목록");
		readAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BbsDAO dao = new BbsDAO();
					ArrayList<BbsVO> list = dao.all();
					System.out.println("게시판의 개수:" + list.size() + "개");
					for (int i = 0; i < list.size(); i++) {// 5번 돌아간다.
						BbsVO bag = list.get(i);
						all.append(bag.getNo() +", " + bag.getTitle() +", " + bag.getContent() + ", " +  bag.getWriter() + "\n");
						
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		readAll.setBounds(117, 66, 93, 23);
		f.getContentPane().add(readAll);

		JButton read = new JButton("검색");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = t1.getText();
				BbsDAO dao = new BbsDAO();
				try {
					BbsVO bag = dao.one(Integer.parseInt(no));
					t1.setText(String.valueOf(bag.getNo()));
					t2.setText(bag.getTitle());
					t3.setText(bag.getContent());
					t4.setText(bag.getWriter());
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		read.setBounds(220, 66, 67, 23);
		f.getContentPane().add(read);

		JButton update = new JButton("글수정");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no = Integer.parseInt(t1.getText());
				String content = t3.getText();
				BbsDAO dao = new BbsDAO();
				try {
					dao.update(no, content);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		update.setBounds(299, 66, 78, 23);
		f.getContentPane().add(update);

		JButton delete = new JButton("글삭제");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no = Integer.parseInt(t1.getText());
				BbsDAO dao = new BbsDAO();
				try {
					dao.delete(no);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		delete.setBounds(385, 66, 83, 23);
		f.getContentPane().add(delete);

		
		all.setBounds(48, 126, 400, 273);
		f.getContentPane().add(all);

	}
}
