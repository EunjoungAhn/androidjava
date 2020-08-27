package 배열정리;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범 {
    //클릭했을때 연상을 하고 싶으면 함수 밖으로 빼야한다.
	static int now = 2;//현재 위치를 체크할 수 있는 변수//연산 할때는 함수안에 넣으면 안된다.

	public static void main(String[] args) {
		
		//영화제목목록, 이미지목록, 감독, 평점목록
		String[] titles = {"짱구극장판", "오케이마담", "테넷", "다만악에서구하소서", "이별식당"};
		String[] images = {"짱구극장판.jpg", "오케이마담.jpg", "테넷.jpg", "다만악에서구하소서.jpg", "이별식당.jpg"};
		String[] directors = {"하시모토마사카즈", "이철화", "크리스토퍼 놀란", "홍원찬", "임왕태"};
		double[] rates = {9.21, 6.61, 8.63, 7.79, 0.0};
		
		
		JFrame f = new JFrame();
		f.setTitle("나의 영화 앨범");
		
		
		f.setSize(400,400);
		f.getContentPane().setLayout(null);
		
		JLabel title = new JLabel(titles[2]);
		title.setFont(new Font("굴림", Font.BOLD, 25));
		title.setBounds(80, 32, 229, 66);
		f.getContentPane().add(title);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon(images[2]));
		img.setBounds(80, 95, 111, 166);
		f.getContentPane().add(img);
		
		JLabel director = new JLabel("감독");
		director.setFont(new Font("굴림", Font.BOLD, 12));
		director.setBounds(216, 108, 57, 15);
		f.getContentPane().add(director);
		
		JLabel director_name = new JLabel(directors[2]);
		director_name.setBounds(216, 135, 116, 15);
		f.getContentPane().add(director_name);
		
		JLabel rate = new JLabel("평점");
		rate.setFont(new Font("굴림", Font.BOLD, 12));
		rate.setBounds(216, 169, 57, 15);
		f.getContentPane().add(rate);
		
		JLabel rate_num = new JLabel(rates[2] + " ");//라벨에 string만 들어가기 때문에 string을 붙여서 string으로 만들어 줌.
		rate_num.setBounds(216, 194, 93, 15);
		f.getContentPane().add(rate_num);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now--;//1
				if (now == -1) {
					now = 4;
				}
				title.setText(titles[now]);
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				director_name.setText(directors[now]);
				rate_num.setText(rates[now]+" ");
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 13));
		btnNewButton.setBounds(0, 0, 50, 361);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				now++;//3
				if (now == 5) {
					now = 0;
				}
				title.setText(titles[now]);
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				director_name.setText(directors[now]);
				rate_num.setText(rates[now]+" ");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 13));
		btnNewButton_1.setBounds(334, 0, 50, 361);
		f.getContentPane().add(btnNewButton_1);
		
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
