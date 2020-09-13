package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링 {

	public static void main(String[] args) {
		//크롤링 순서 
		//웹사이트에서 정보를 가지고 오는 것
		//단순: 스크랩핑
		//단순+@: 크롤링
		//1. 사이트 연결
		//2. 해당 페이지 다운로드(html)
		//3. 원하는 위치의 정보를 추출해냄
		Connection con = Jsoup.connect("https://www.naver.com/");//https://www. 처음에는 안보이지만 defult로 기본값 처럼 처리 된다.
		System.out.println("1. 사이트 연결 성공!");
		
		try {
			Document doc = con.get();//해당 페이지  index.html를 가져오겠다.
			System.out.println("2. 해당 페이지 다운로드 성공!!");
			System.out.println("---------------------");
//			System.out.println(doc);
//			System.out.println(doc.select("a.nav"));
			System.out.println("3. 원하는 위치의 정보를 추출 성공!!");
			 Elements list = doc.select("a.nav");
			 //Elmements == ArrayList + @@ 라고 생각하면 된다.
			 System.out.println("개수: "+list.size());
			 for (int i = 0; i < list.size(); i++) {
				 Element tag = list.get(i);
//				 System.out.println(tag);
			 String text = tag.text();//tag의 텍스트 추출
			 System.out.print(text + ", ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
