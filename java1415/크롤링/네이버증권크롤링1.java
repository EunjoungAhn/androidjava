package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링1 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=293490");
		System.out.println("1. 사이트 연결 성공!");

		try {
			Document doc = con.get();// 해당 페이지 index.html를 가져오겠다.
			System.out.println("2. 해당 페이지 다운로드 성공!!");
			System.out.println("3. 원하는 위치의 정보를 추출 성공!!");
			//html에서 dom 트리 구조로 해당 위치를 찾아서 가져오면 된다.
			Elements list = doc.select("h2 > a");
			String name = list.get(0).text();
			System.out.println("회사이름: "+name);
			
			Elements list2 = doc.select("span.code");
			String code = list2.get(0).text();
			System.out.println("회사코드: "+ code);
			
			Elements list3 = doc.select("div.today span.blind");
			String now = list3.get(0).text();//현재가
			String dif = list3.get(1).text();//차이
			String percent = list3.get(2).text();//증감비율
			System.out.println("현재가: "+ now);
			System.out.println("어제와의 차이: "+ dif);
			System.out.println("증감비율: "+ percent);
			
			Elements list4 = doc.select("td.first span.sptxt");
			String yesterdayTitle = list4.get(0).text();
			
			Elements list5 = doc.select("td.first span.blind");
			String yesterdayMarketPrice = list5.get(0).text();
			System.out.println( yesterdayTitle + ": " + yesterdayMarketPrice);
			
			Elements list6 = doc.select("td.first span.sptxt");
			String marketPriceTitle = list6.get(1).text();
			
			Elements list7 = doc.select("td.first span.blind");
			String marketPrice = list7.get(1).text();
			System.out.println(marketPriceTitle + ": "+ marketPrice);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
