package com.sist.time;
// Date, Calendar에서 처리가 안되는 기능 => 보완
/*
 *    오라클 => 날짜 저장 => Date
 *    MySQL => 날짜 저장 => LocalDateTime
 *    
 *    LocalDate
 *    LocalTime
 *    --------- + 
 *       = LocalDateTime
 */
import java.time.*;
public class MainClass_Time_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 현재 날짜 (시스템) ==> static => 오늘 날짜 읽기		
		// F => FinalClass 오버라이딩이 안됨		
		LocalDate date = LocalDate.now(); // 초기화
		System.out.println(date);
		
		// 현재 시간 (시스템_
		LocalTime time =LocalTime.now();
		System.out.println(time);
		
		// 날짜, 시간을 동시에 읽어 올때
		LocalDateTime dt =LocalDateTime.now();
		System.out.println(dt);
		
		// of() : 원하는 날짜 설정할 때 사용
		date=LocalDate.of(2022, 12 , 1); // 날짜 설정 ==> 생년월일, 예약일 등록...
		System.out.println(date);
				
		time= LocalTime.of(15, 30,45); // 시간 설정
		System.out.println(time);
	}

}
