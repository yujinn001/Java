package com.sist.lang;
/*
 *    java./lang => 프로그램에서 가장 많이 사용되는 기본이 되는 클래스의 집합
 *    ----------    ----------------------------- import를 생략할 수 있다
 *    java.util, java.text, java.io, java.net(2권)
 *    --------------------------------------------
 *    java.lang 주요 클래스
 *    -------------------
 *    1. Object : 모든 클래스의 상위 클래스 => 라이브러리 / 사용자 정의 =>모든 클래스가 Object로 부터 상속을 받는다
 *    2. String : 문자열을 저장하는 클래스 (char[]을 이용해서 만든 클래스)
 *    3. StringBuffer : 최적화 (문자열 결합)
 *    4. Wrapper :각 데이터형을 클래스화
 *       -------  Integer(int), Double(double), Boolean(boolean), Byte, Short, Float
 *    5. Math : 수학관련
 *    6. System : 입출력 / GC
 *    -------------------------------------------------------------------------------
 *    라이브러리 : 1. 패키지 2. 클래스명 3. 주요메서드
 *                                    ------- 1) 기능, 2) 메소드명, 3) 리턴형, 4) 매개변수
 *                                            5) 예외선언
 *                                            ----------------------------------------
 *              
 *              1) Object : 모든 클래스는 Object로부터 상속을 받는다 (Object가 가지고 있는 모든 기능을 사용할 수 있다)
 *                 class A(extends Object)
 *                 {
 *                 }
 *                 
 *                 class A
 *                 class B extends A ==> B, A, Object
 *                 *** Object는 모든 데이터형을 가지고 있다
 *                 Object obj =1; obj ="" obj='A' obj = new A()....
 *                 --------------------------------------------------> 자바에서 지원하는 메소드 대부분 Object를 리턴
 *                                                                     => 형변환
 *              2) Object의 주요 메소드
 *                 ① 복제 기능 ==> 같은 값을 가진 메모리를 새롭게 만들어 준다 . (스프링 : prototype)
 *                   protected Object clone();
 *                            -------- --------
 *                            
 *                 ② 객체를 문자열화
 *                   public String toString(); ==> 가장 많이 오버라이딩
 *                   
 *                 ③ 소멸자 : 객체 메모리 제거
 *                   protected void finalize(); ==> 메소드 소멸자 될 때 자동 호출
 *                   
 *                 ④ 객체 비교 : (==) : equals(),(!=):!equals()
 *                   public boolean equals(Object obj)
 *                   
 *                 ⑤ 객체를 얻어오는 메소드 (객체정보) : getClass()
 *                   public Class getClass()
 */
// 소멸자 예제
/*
 *    1. 클래스 설계
 *    2. 객체생성 (클래스 내용 저장)
 *    3. 객체 활용(객체가 가지고 메소드, 변수)
 *    4. 객체 소멸
 *    5. 소멸 여부 확인 (GC) => finalize() // 소멸자 : 객체 메모리 제거
 */
class Main
{
	private int a =10;
	public Main(int a)
	{
		this.a =a;
		System.out.println("Main클래스 메모리 할당...(객체 생성)");
	}
	public void display()
	{
		System.out.println("Main 클래스 객체 활용....");
	}
	// 소멸이 될 때 자동 호출 (소멸자)
	/*
	 * 	    class A
	 *		{
	 *          public A(){new}
	 *          public ~A(){delete} ==> 자동 처리 (GC) => 해제되는 시간 (메모리 누수) => gc()호출
	 *          // 객체는 null을 설정
	 *          // 사용하지 않는 경우
	 *
	 */
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 소멸(메모리 해제)");
	}
	//Object가 가지고 있는 메소드
	
}
public class 라이브러리_1 {
	public static void main(String[] args)
	{
		Main m = new Main(10);//객체생성
		// 저장된 메모리에서 필요한 내용 설정
		m.display(); //객체 활용
		m=null; 
		// 메모리 해제 명령
		System.gc(); // 직접적인 메모리 해제
	}
}


