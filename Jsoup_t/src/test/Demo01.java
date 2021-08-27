package test;

import java.io.File;
import java.net.URLDecoder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Demo01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path = Demo01.class.getClassLoader().
				getResource("student.xml").getPath();
		path = URLDecoder.decode(path);
		
		System.out.println(path);
		
		Document doc = Jsoup.parse(new File(path), "utf-8");
		
		Elements elements = doc.getElementsByTag("student");
		
		System.out.println(elements.size());
	}

}
