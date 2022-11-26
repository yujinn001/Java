package com.sist.main;
import java.util.*;
public class MainClass_Calendar_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Calendar ==> Date(*****) => 오라클에 저장
		Calendar cal = Calendar.getInstance();
		Date date = new Date(cal.getTimeInMillis()); // 날짜 => long
		// Calendar를 Date로 만드는 방법
		System.out.println(date);
		
		// 2. Date ==> Calendar(*****) => 오라클에서 날짜를 읽어서 제어 (Date클래스는 기능(메소드) 사용금지)
		Date date2 = new Date();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		System.out.println("년도 : "+cal2.get(Calendar.YEAR));
		System.out.println("년도 : "+(cal2.get(Calendar.MONTH)+1));
		System.out.println("년도 : "+cal2.get(Calendar.DATE));
		// month(0-11), week(1(일)~7(토)
	}

}
