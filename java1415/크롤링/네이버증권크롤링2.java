package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링2 {

	public String[] crawl(String code) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + code);
		System.out.println("1. 사이트 연결 성공!");
		String[] result = null;
		try {
			Document doc = con.get();// 해당 페이지 index.html를 가져오겠다.
			System.out.println("2. 해당 페이지 다운로드 성공!!");
			System.out.println("3. 원하는 위치의 정보를 추출 성공!!");
			//html에서 dom 트리 구조로 해당 위치를 찾아서 가져오면 된다.
			Elements list = doc.select("h2 > a");
			String name = list.get(0).text();
			System.out.println("회사이름: "+name);
			
			Elements list2 = doc.select("span.code");
			String code2 = list2.get(0).text();
			System.out.println("회사코드: "+ code2);
			
			Elements list3 = doc.select("div.today span.blind");
			String now = list3.get(0).text();//현재가
			String dif = list3.get(1).text();//차이
			String percent = list3.get(2).text();//증감비율
			System.out.println("현재가: "+ now);
			System.out.println("어제와의 차이: "+ dif);
			System.out.println("증감비율: "+ percent);
			
			result = new String[] {name, code2, now, dif, percent};
			
			System.out.println("-----------------------------");
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

}
