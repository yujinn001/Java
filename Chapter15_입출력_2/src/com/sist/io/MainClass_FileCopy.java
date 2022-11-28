package com.sist.io;
import java.util.*; 
import java.io.*;
// 업로드
public class MainClass_FileCopy {
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis= new FileInputStream("c:\\javaDev\\movie.txt");
			FileOutputStream fos = new FileOutputStream("c:\\download\\movie.txt");
			//			int i =0; // 한글자 읽기 ==> 글자마다 번호를 출력
//			while((i =fis.read())!=-1) // -1이면 EOF(파일의 끝)
//			{
//				fos.write(i); // 1byte씩 읽는 방법
//			}
//			fis.close();		
//			fos.close();
			byte[] buffer = new byte[1024]; // 클라이언트에서 서버로 파일을 전송하는 방법
			int i =0; // 글자 번호가 아니다 (읽은 byte 수)
			while((i=fis.read(buffer,0,1024))!=-1)
			{
				fos.write(buffer,0,i); //1024씩 읽는 방법 (1byte보다 빠르다) ==> 파일 업로드 방식
			}
			fis.close();
			fos.close();
			System.out.println("파일 복사 완료");
		}catch(Exception ex ) {}
	}
}
