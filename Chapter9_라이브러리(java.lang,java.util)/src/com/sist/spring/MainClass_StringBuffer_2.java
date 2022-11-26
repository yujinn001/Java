package com.sist.spring;
import java.io.*;
public class MainClass_StringBuffer_2 {
	// StringBuffer sb = new StringBuffer(); // 문자열을 저장하는 메모리 임시공간(Buffer)
	// 문자열이 많으면 append를 사용한당
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		try
		{
			fr = new FileReader("C:\\JavaDev\\movie1.txt");
			StringBuffer sb = new StringBuffer();
			int i =0;
			while((i=fr.read())!=-1) //파일 끝날 때까지 읽는다
			 {
				 sb.append(String.valueOf((char)i)); //문자열 결합 ==> 최적화
			 }	
			System.out.println(sb.toString());
			// 문자열 결합 => append(), String 변경 =>  toString()
			// public StringBuffer append(String s)
			// 오버로딩 ==> append(boolean b) append(char[] c) append(int i)... ==> 문자열로 변경된다
			// public String toString()
			// ==> 데이터 읽기가 끝나면 ==> String으로 변환 (String으로 제어)
				
		}catch(Exception ex) {}
		finally
		{
			try {
				fr.close();
			}catch(Exception ex) {}
		}
		
	}

}
