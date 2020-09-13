package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버영화크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://movie.naver.com/movie/bi/mi/basic.nhn?code=190010#");
		System.out.println("1. 사이트 연결 성공!");

		try {
			Document doc = con.get();// 해당 페이지 index.html를 가져오겠다.
			System.out.println("2. 해당 페이지 다운로드 성공!!");
			System.out.println("---------------------");
			System.out.println("3. 원하는 위치의 정보를 추출 성공!!");
			//html에서 dom 트리 구조로 해당 위치를 찾아서 가져오면 된다.
			Elements list = doc.select("h3 > a");// h3 바로 밑의 자식 중 a태그를 찾아라
//			 Elements list = doc.select("h3  a");//h3 밑의 모든 자식 a태그를 찾아라
			// Elmements == ArrayList + @@ 라고 생각하면 된다.
			System.out.println("개수: " + list.size());
			System.out.println(list.get(0).text());// 0번째 인덱스를 가져와라

			System.out.println("---감독--------------");

			Elements director = doc.select("dd > p > a");
			System.out.println("개수: " + director.size());
			System.out.println(director.get(0).text());

			System.out.println("---누적 관객 수------------");

			Elements audience = doc.select("div > p.count");
			System.out.println("개수: " + audience.size());
			System.out.println(audience.get(0).text());

			System.out.println("-----배우 이름-----------");

			Elements people = doc.select("div.people ul li a.tx_people");
			System.out.println("개수: " + people.size());
			for (int i = 0; i < people.size(); i++) {
				System.out.print(people.get(i).text() + ", ");
			}

			System.out.println();
			System.out.println("-----배우 이미지----------");

			Elements people_Img = doc.select("div.people ul li a img");
			System.out.println("개수: " + people_Img.size());
			for (int i = 0; i < people_Img.size(); i++) {
				System.out.println(people_Img.get(i) + ", ");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
