package com.sist.spring;

import java.util.StringJoiner;

/*
 *     471page
 *     -------
 *     String
 *     ------
 *     StringBuffer : append() 문자열 결합
 *                    toString()
 *     Math : random() / ceil() / round()
 *  ***Wrapper : Integer, Double, boolean  => 문자열을 해당 데이터형 변겨 
 *               parseInt(), parseDouble(), parseBoolean()
 *               => 박싱 / 언박싱
 *               => List<int> (X) ==> List<Integer>
 *     StringTokenizer : nextToken(), countToken(), hasMoreTokents
 *     Pattern / Matcher
 *     -------   ------- find(), group(), compile()
 *     -------------------------------------------------------------
 *     
 */
public class MainCalss_String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color ="red,green,blue,black,white,yellow,magenta";
		// 칼라별 분리
		String[] colors= color.split(",");
		for(String c : colors)
		{
			System.out.println(c);
		}
		System.out.println("====출력형식 (join)====");
		String ss =String.join("-", colors); // (구분자 ,)
		System.out.println(ss);
		System.out.println("=== 출력형식 ===");
		ss = color.replace(",", "-"); //일반 문자열
		System.out.println(ss);
		// 이미지 (여러개를 동시에 묶어서 저장) => 구분자 사용해서 저장 ==> 데이터를 나눠서 출력
		// 오라클 => ^
		StringJoiner sj = new StringJoiner(",","{","}"); //(구분자, 시작, 끝)
		for(String s : colors)
		{
			sj.add(s);
		}
		System.out.println(sj.toString());
	}

}




























