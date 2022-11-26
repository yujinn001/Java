package com.sist.music;
import java.lang.reflect.Array;
// 브라우저 => 사용자가 실행하는 위치
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MusicSystem ms = new MusicSystem();
		System.out.print("지니 뮤직(1), 멜론(2) 선택: ");
		int cno = sc.nextInt();
		
		ArrayList<Music> list =ms.movieCategoryData(cno);
		if(cno==1)
			System.out.println("======지니 뮤직 Top 100 ======");
		else
			System.out.println("======멜론 뮤직 Top 50 =======");
		
		for(Music m :list)
		{
			System.out.println(m.getMno()+"."+m.getTitle()+", "+m.getSinger());
		}
	}

}
