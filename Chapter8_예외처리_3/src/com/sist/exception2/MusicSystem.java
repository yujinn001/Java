package com.sist.exception2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 *    https://www.genie.co.kr/chart/top200   : Top200
 *   https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0100 : 가요
 *   https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0200 : Pop
 *   https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0300 :OST
 *   https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0107 :트롯
 *   https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0500 : JAZZ
 *   https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0600 : classic
 *   
 */

public class MusicSystem {
	private String[] url = {
			"",
			 "https://www.genie.co.kr/chart/top200",   //: Top200"
		     "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0100",
		     "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0200",
			 "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0300",
			 "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0107",
			 "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0500", 
			 "https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0600"				 	
	};
	public MusicVO[] musicData(int type) throws Exception
	{
		MusicVO[] music  = new MusicVO[50];
		// URL 연결
		Document  doc = Jsoup.connect(url[type]).get(); //배열은 0번부터, type은 1번부터니까 url에 공백을 준다
		Elements title = doc.select("table.list-wrap td.info a.title");
		Elements singer = doc.select("table.list-wrap td.info a.artist");
		Elements album = doc.select("table.list-wrap td.info a.albumtitle");
		int k =0;
		for(int i =0; i<50; i++)
		{
			music[k] = new MusicVO();
			music[k].setTitle(title.get(i).text());
			music[k].setSinger(singer.get(i).text());
			music[k].setAlbum(album.get(i).text());
			k++;
		}
		return music;
	}
}
