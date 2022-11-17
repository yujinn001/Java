package com.sist.exception;
/*
 *    컴파일(이진파일변경) , 인터프리터 (한줄씩 읽어서 출력)
 *    ---------------   -------------------------
 *        javac               java
 *          |                   |
 *       프로그래머 실수         사용자의 오류 
 *    ---------------   -------------------------  
 *       CheckException     UnCheckException -> (확인하지 않는다) => 예외처리를 생략할 수 있다
 *        L 컴파일러가 예외처리가 되었는지 여부 확인
 *        
 *        CheckException
 *            = IOException : 파일명, 경로명이 틀렸을 때
 *            = ClassNotFoundException : 클래스가 없는 경우 (리플렉션 => new없이 메모리 할당)
 *            = SQLException : 데이터베이스 연결 (오라클, MySQL)
 *            = InterruptedException : 쓰레드 충돌
 *            = MalformedURLException : IPO, URL주소가 틀린 경우 ==> 크롤링
 *        
 *        UnCheckException
 *            = ArrayIndexOutOfBoundsExceptiom : 배열범위가 초과시에  (인덱스번호 오류)
 *                                     => 12장 (컬렉션)
 *            = NumberFormatException : 정수변환 ==> 웹/윈도우는 정수를 전송할 수 없다 (문자열로 들어온다 그래서 변환시켜줘야 한다) 
 *            = NullPointerException : 객체 생성없이 선언후, 사용
 *                     모든 클래스는 기본 값 null => 메소드나 변수 사용이 안됨
 *            = ClassCastException : 클래스 형변환 ==> 제네릭스
 *            class A<T> ==> 임시 클래스 => Object ==> 12장(데이터베이스 = 기본)
 *            {
 *                T t; 
 *                public void setT(T t)
 *                {
 *                }
 *                public T getT()
 *                {
 *                
 *                }
 *            }
 *            A<String> -> T부분을 String으로 바꿔라?
 *            
 *            ---------------------------------------------
 *            1. 처리방법
 *           *** 1) 예외복구(직접처리) try~catch~finally ==> 프로그래머가 처리
 *           *** 2) 예외회피(간접처리) throws ==> 시스템에 알려준다. (예외 떠넘기기)
 *                  라이브러리에 많이 존재
 *                  sleep() throws InterrruptedException
 *               3) 예외던지기 (임의로 발생) throw ==> 사용빈도는 거의 없다
 *                  ------------------- 사용자 정의 예외처리
 *               
 *            2. 사용법
 *               try : 정상 수행이 가능한 코딩(예외가 발생 가능성) ==> 에러에 대비한 코딩
 *                     => 프로그래머 실수 
 *                     => 사용자 입력 오류
 *               catch : 오류가 발생시에 어떻게 처리할 지 코딩 (복구 => 에러확인)
 *                     => 프로그래머 실수 (복구) => 소스 수정
 *                     => 사용자 실수 => 다시 입력을 요청
 *                     => 예상되는 에러만큼 catch를 사용할 수 있다 (멀티) => 통합
 *                     => 전체예외처리가 가능한 클래스 : Exception / Throwable 
 *               finally : 무조건 수행
 *                         try에서 수행 ===> 정상 수행
 *                         catch에서 수행 ===> 오류 발생
 *                         try/catch 수행 상관없이 무조건 수행 (닫기: 파일, 서버연결 해제, 데이터베이스 닫기)
 *              ------------------------> finally는  생략이 가능 (필요시에만 사용)
 *              
 *              예)
 *                   사이트 => 오류 (다음화면이 없다), 로딩 시간 오래 걸린다 ==> 사이트 이동
 *                   String num =" 10";
 *                   => 정수 변환
 *                   int i = Integer.parseInt(num); ==> 오류발생 (오류에 대한 대비가 없는 경우) => 프로그램 종료
 *                   // 왜 오류인지? =>  num이 "공백 10"이여서 숫자로 변환을 해도 공백때문에 오류가 발생한다
 *                   // 그래서 num.trim()을 사용하여 공백을 제거하고 숫자로 변환시킨다
 *                   1--
 *                   2--
 *                   3--
 *                   4--
 *                   5--
 *                   -------------------------------- 정상 수행 (5번을 끝까지 수행)
 *                  
 *                  
 *                  에러발생에 대한 대비
 *                  ----------------
 *                  try
 *                  {
 *                      문장1 ==> 정상수행
 *                      문장2 ==> 정상수행
 *                      문장3 ==> 정상 수행 ==> try가 종료한 다음에 catch는 수행하지 않고 다음 문장으로 넘어간다.
 *                  }catch(A)
 *                  {
 *                      처리문장 4
 *                  }catch(B)
 *                  {
 *                      처리문장 5
 *                  }
 *                  catch(C)
 *                  {
 *                      처리문장 6
 *                  }
 *                  문장7
 *                  --------------------------
 *                  try
 *                  {
 *                      문장1 ==> 정상수행
 *                      문장2 ==> 오류 발생 (B) ==> B라는 오류를 찾는다
 *                      문장3 ==> 정상 수행 
 *                  }catch(A | B | C)
 *                  {
 *                      처리문장 4
 *                  }
 *                  문장7
 *                  ----------------------------
 *                  try
 *                  {
 *                      문장1 ==> 정상수행
 *                      문장2 ==> 오류 발생 (B) ==> B라는 오류를 찾는다
 *                      문장3 ==> 정상 수행 
 *                  }catch(Exception ) ==> 다중 조건문 (선택문) Exception ==> 모든 예외처리가 가능
 *                  {
 *                      처리문장 4
 *                  }
 *                  문장7
 *                  
 *                  
 *                  
 *                  
 */
import java.util.Scanner;
public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//UnCheckException => 예외처리 생략이 가능
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두개 입력(10 10):"); // 한칸 띄면 두개를 동시에 받을 수 있다
		int[] arr = new int[2];
		arr[0]=sc.nextInt();
		arr[2]=sc.nextInt(); // 오류 발생 (인덱스 번호 초과) ==> 프로그램 비정상 종료
		
		
		int res =arr[0]/arr[1];
		System.out.println("res="+res);
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			//System.out.println(ex.getMessage());
			ex.printStackTrace(); // 실행과정을 출력 (문장 + 에러위치) ==> 422page
		} 
		System.out.println("프로그램 종료");
				
	}

}









