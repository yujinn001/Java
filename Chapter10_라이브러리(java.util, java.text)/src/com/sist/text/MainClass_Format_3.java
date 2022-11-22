package com.sist.text;
import java.io.*;
import java.util.*;
import java.text.*;
public class MainClass_Format_3 {
// String msg ="INSERT INTO member VALUES('{0}','{1}','{2}','{3}','{4}','{5}','{6}')";
class Movie{
	private int rank;
	private String title;
	private String genre;
	private String poster;
	private String actor;
	private String regdate;
	private String grade;
	private String director;
	
	// 변수의 기능을 메소드화 ==> 읽기 / 쓰기 (getter/setter)
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileReader fr = new FileReader("C:\\JavaDev\\movie1.txt");
			// 파일을 읽어오는 클래스
			/*
			 *   FileInputStream(1byte) => 파일 업로드 / 파일 다운로드
			 *   FileReader(2byte) => 한글읽기
			 *   한글 => 한글자당 2byte 
			 */
			int i =0;
			StringBuffer sb = new StringBuffer(); // StringBuffer는 대용량 파일을 읽을때 사용
			//  문자열을 추가하거나 변경 할 때 주로 사용하는 자료형
			while((i=fr.read())!=-1)
			{
				sb.append(String.valueOf((char)i));
			}
			fr.close();
//			System.out.println(sb.toString());;
			String data =sb.toString();
			String[] movie =data.split("\n");
			for(String m:movie)
			{
				Object[] obj =m.split("\\|");
				String msg ="순위: {0}\n영화명:{1}\n장르:{2}\n출연:{4}\n개봉일:{5}\n등급:{6}\n";
				System.out.println(MessageFormat.format(msg, obj));
				System.out.println("====================================");
			}
		}catch(Exception ex) {}
		
	}

}























