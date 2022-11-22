package com.sist.time;
import java.time.*;
import java.util.*;
// 비교 => compareTo() => 같으면 0, 이전 음수 , 이후 양수
// 
// isAfter(), isBefore(),isEqual() ==> boolean
// 기간 , 동안 ...
public class MainClass_Time_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력(2022 11 22) :");
		int year =sc.nextInt();
		int month = sc.nextInt();
		int day =sc.nextInt();
		
		LocalDate date1 =LocalDate.now(); // 초기화
		LocalDate date2 = LocalDate.of(year,month,day);
		
//		int result =date2.compareTo(date1); // date1과 date2의차이
//		System.out.println("result="+result);
//		if(result ==0)
//		{
//			System.out.println("마감일입니다");
//		}
//		else if(result<0) // 음수
//			System.out.println("아직 이벤트 기간입니다");
//		else if(result >0) // 양수
//			System.out.println("기간이 지났습니다");
		if(date2.isAfter(date1)) // isAfter ==> 이후
		{
			System.out.println("기간이 지났습니다");
		}
		else if(date2.isBefore(date1))
			System.out.println("아직 이벤트 기간입니다");
		else if(date2.isEqual(date1))
			System.out.println("마감일입니다");
	}

}


























