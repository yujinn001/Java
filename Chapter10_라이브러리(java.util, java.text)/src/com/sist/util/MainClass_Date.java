package com.sist.util;
// Date : 시스템의 현재 날짜 / 시간을 읽어 온다 ===> 오라클 데이터형과 연결 (DATE)
// Date 클래스의 단점 : 기능 빈약하다 => 보완 (Calendar) => Date는 날짜 저장용으로 사용이 많다
import java.util.*;
import java.text.*;
public class MainClass_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성하는 과정
		
		/*
		 *   Format => 변환
		 *   -------------
		 *   <출력할 때>
		 *   년도 : yyyy (대소문자 구분)
		 *   월 : MM, M ==> MM (1~9월) => 01 02... M => 1 2 3...
		 *   일 : dd, d (소문자)
		 *   --------------------------------------------------> 실제 날짜를 계산 (dd, MM => d,m)
		 *      01,02,03,04,05..08,09 (오류) // 08, 09  8진법 오류(0이 앞에 붙어서) 
		 *   시간 : hh, h
		 *   분 : mm, m ==> MI
		 *   초 : ss, s
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		while(true)
		{
			Date date = new Date(); // SimpleDateFormat
			String today=sdf.format(date); // 스케줄러 ==> 경매
			System.out.println(today);
			try
			{
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}
	}
		

}





















