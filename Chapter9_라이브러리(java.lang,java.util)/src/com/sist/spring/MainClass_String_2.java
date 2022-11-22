package com.sist.spring;

import java.util.Arrays;
import java.util.StringJoiner;
/*
 * https://www.google.com/search?q=%EC%9E%90%EB%B0%94&rlz=1C1JJTC_koKR1029KR1029&oq=%EC%9E%90%EB%B0%94&aqs=chrome..69i57j0i433i512j0i131i433i512j0i512l4j0i433i512j0i512l2.858j0j15&sourceid=chrome&ie=UTF-8
 */
public class MainClass_String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//%EC%9E%90%EB%B0%94
			//EC9E90EBB094 ==> 인코딩 (byte[])
			String name ="자바";
			System.out.println("==== 인코딩 ====");
			byte[] b = name.getBytes("UTF-8");
			for(byte bb : b)
			{
				System.out.print(String.format("%02X", bb)); // 16진법
			}
			System.out.println("\n==== 디코딩 =====");
			byte[] b2 =name.getBytes("CP949"); // 자바
			for(byte bb : b2)
			{
				System.out.print(String.format("%02X", bb)); // 16진법
			}
		}catch(Exception ex) {}
	}

}
