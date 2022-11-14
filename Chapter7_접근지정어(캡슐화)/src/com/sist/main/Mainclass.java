package com.sist.main;
import com.sist.manager.*;
import com.sist.VO.*;
import java.util.Scanner;
public class Mainclass {
	public static void main(String[] args)
	{
		MusicManager m = new MusicManager();
		MusicVO[] music = m.musicListData();
		for(MusicVO vo : music)
		{
			System.out.println(vo.getTitle());
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("뮤직 선택: ");
		int index =sc.nextInt();
		String key =m.musicDetailData(index);
		
		
		try
		{
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"
					+ "http://youtube.com/embed/"+key);
			
		}catch(Exception ex)
		{}
	}
}
