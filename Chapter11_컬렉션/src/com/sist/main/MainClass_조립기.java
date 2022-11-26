package com.sist.main;
// JSP 
import java.util.*;
import com.sist.movie.*;
public class MainClass_조립기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int curpage=1;// 현재 페이지
        MovieSystem ms=new MovieSystem();
		int totalpage=ms.movieTotalPage();
		Scanner scan=new Scanner(System.in);
		System.out.print("페이지 입력(1~"+totalpage+"):");
		curpage=scan.nextInt();
		// 해당 페이지에 있는 영화목록 얻기
		ArrayList list=ms.movieAllData(curpage);
		System.out.println("======"+curpage+"page 영화목록======");
		for(int i=0;i<list.size();i++)
		{
			Movie m=(Movie)list.get(i);
			System.out.println(m.getMno()+"."+m.getTitle());
		}
		
		System.out.println("==================================");
		System.out.print("상세볼 영화 번호 입력:");
		int mno=scan.nextInt();
		
		Movie m=ms.movieDetailData(mno);
		System.out.println("순위:"+m.getMno());
		System.out.println("영화명:"+m.getTitle());
		System.out.println("출연자:"+m.getActor());
		System.out.println("감독:"+m.getDirector());
		System.out.println("장르:"+m.getGenre());
		System.out.println("등급:"+m.getGrade());
		System.out.println("개봉일:"+m.getRegdate());
		
	}

}