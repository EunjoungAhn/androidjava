package 크롤링;

import java.io.FileWriter;

public class 네이버증권UI {

	public static void main(String[] args) {
		String[] codes = {"035720","035760","251270", "193250","061970"};
		
		네이버증권크롤링2 naver = new 네이버증권크롤링2();
		for (int i = 0; i < codes.length; i++) {
			String[] result = naver.crawl(codes[i]);
			
			try {
				FileWriter file = new FileWriter(result[0] + ".txt");
				file.write(result[0] + "\n");//이름
				file.write(result[1] + "\n");//code
				file.write(result[2] + "\n");//현재가
				file.write(result[3] + "\n");//어제와의 차이
				file.write(result[4] + "\n");//증감비율
				file.close();
			} catch (Exception e) {
				System.out.println("파일저장중 에러 발생함");
			}
		}
	}

}
