
import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class ScrapeNugNet {

	public static void main(String[] args){
		
		try{
			
			Document doc = Jsoup.connect("http://www.slate.com/articles/health_and_science/science"
					+ "/2013/05/state_bird_improvements_replace_cardinals_and_robins_with_warblers_"
					+ "and_hawks.html").userAgent("Mozilla/17.0").get();
		
			Elements temp = doc.select("div.text-3 text parbase section");
			
			int i = 0;
			for(Element downloadList:temp){
				
				++i;
				System.out.println(i + ", " + downloadList.getElementsByTag("p").text());
			}
			
		}catch(Exception e){
			System.out.print("error");
		}
		
		
	}
	
}
