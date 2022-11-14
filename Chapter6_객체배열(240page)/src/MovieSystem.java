import java.io.*;
import java.util.Scanner;
public class MovieSystem {
	Movie[] movie = new Movie[1938];
	{   /*
	    *  movie[0].mno=1
	    */
		//  데이터값 대입
		/*
		 * int mno; //영화 고유 번호
			String title;
			String genre;
			String poster;
			String actor;
			String regdate;
			String grade;
			String director;
		 */
		try
		{
			int k =0;//배열번호
			FileReader fr = new FileReader("C:\\JavaDev\\JavaStudy\\movie1.txt");
			StringBuffer sb = new StringBuffer();
			int i =0;
			while ((i=fr.read())!=-1) //-1 EOF
			{
				sb.append(String.valueOf((char)i));
			}
			String data = sb.toString();
			String[] temp = data.split("\n");
			for(String s: temp)
			{
				String[] m=s.split("\\|");
				movie[k]=new Movie();
				movie[k].mno = Integer.parseInt(m[0]);
				movie[k].title =m[1];
				movie[k].genre =m[2];
				movie[k].poster =m[3];
				movie[k].actor =m[4];
				movie[k].regdate =m[5];
				movie[k].grade =m[6];
				movie[k].director =m[7];
				k++;
			}
		}catch(Exception ex) {}
	}
	public static void main(String [] args)
	{
		MovieSystem ms = new MovieSystem();
		// 1. 출력(영화 제목)
		for(Movie m : ms.movie)
		{
			System.out.println(m.mno+". "+m.title);
		}
		System.out.println("========================");
			Scanner sc = new Scanner(System.in);
			System.out.print("장르 입력 : ");
			String genre = sc.next();
			for(Movie m : ms.movie)
			{
				if(m.genre.contains(genre))
				{
					System.out.println(m.title+"("+m.genre+")");
				}
			}
		
			
	}
}




































