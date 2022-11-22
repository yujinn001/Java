package com.sist.exception;
// CheckException : 컴파일러가 검증(예외처리 했는지 여부 확인)
// 반드시 예외 처리를 해야 한다
/*
 *   파일 입출력(IO)
 *   URL이용
 *   쓰레드이용
 *   서버(Network)
 *   데이터베이스
 */
import java.io.*; // io는 무조건 예외처리를 해야한다!!!  
 
public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		FileReader fr = null; //try안에 지역변수로 사용하게 되면 fr을 닫을 때 문제가 생긴다.
//		try
//		{
//			fr = new FileReader("C:\\javaDev\\genie.txt");
//			int i = 0; // 한글자씩 읽어온다 (char ==> int)
//			while((i=fr.read())!=-1) //-1 EOF(파일의끝)
//			{
//				System.out.print((char)i);
//			}
//		}catch(IOException e)
//		{
//			System.out.println("파일이 존재하지 않습니다!");
//		}
//		finally
//		{
//			try
//			{
//			fr.close();
//			}catch(Exception ex)
//			{
//				System.out.println("파일 닫기 실패");
//			}
//		}
		try(FileReader fr = new FileReader("C:\\javaDev\\genie.txt"))
		{
			int i = 0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i
						);
			}
		}catch(IOException e)
		{
			System.out.println("파일이 존재하지 않는다!!");
		}
		
	}

}
