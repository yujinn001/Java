package com.sist.io;
// 보조 스트림을 이용한 파일 읽기
import java.util.*;
import java.io.*;
/*
 *   Input /reader => 읽기
 *   Output / writer => 쓰기
 */
public class MainClass_BufferedInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\java_data\\student.txt"));
					int i =0;
					 while((i=bis.read())!=-1)
					 {
						 System.out.println((char)i);
					 }
					 bis.close();
					 
					 
		}catch(Exception ex) {}
	}

}
