package com.sist.collection;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class MainClass_Set_4 {
	   public static Set musicGeine() {
		      Set set = new HashSet(); // 중복 없앨거란 의미
		      try {
		         int k=1;
		         for(int i=1;i<=2;i++) {
		            Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20221124&hh=15&rtm=Y&pg="+i).get();
		            Elements title=doc.select("table.list-wrap a.title");
		         //  -------- = ArrayList
		            for(int j=0;j<title.size();j++) {
		               System.out.println(k+"."+title.get(j).text());
		               set.add(title.get(j).text());
		               k++;
		            }
		         }
		      }catch(Exception ex) {}
		      return set;
		   }
	public static Set musicMelon()
	{
		TreeSet set = new TreeSet(); // 자동 정렬이 가능 (탐색에 좋음)
		try 
		{
				int k=1;		
				Document doc =Jsoup.connect("https://www.melon.com/chart/index.htm").get();
				Elements title =doc.select("div.wrap_song_info div.rank01 a "); //Elements -> 태그전체를 읽어온다
				for(int j =0; j<title.size(); j++)
				{
					System.out.println(k+"."+title.get(j).text());
					set.add(title.get(j).text());
					k++;
				}
			
		}catch(Exception ex) {}
		return set;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set genie =musicGeine();		
		Set melon=musicMelon();
		
		System.out.println("==지니뮤직==");
		System.out.println(genie);
		
		System.out.println("==멜론뮤직==");
		System.out.println(melon);
		
		System.out.println("==지니에만 있는 노래==");
		genie.removeAll(melon);
		System.out.println(genie);
		
		System.out.println("==멜론에만 있는 노래==");
		melon.removeAll(genie);
		System.out.println(genie);
		
		
	}

}
