package test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Demo02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL url = new URL("https://www.baidu.com/");
		Document doc = Jsoup.parse(url, 3000);
		System.out.println(doc);
		
	}

}
