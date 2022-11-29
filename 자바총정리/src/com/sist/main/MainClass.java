package com.sist.main;
/*
 *    자바 1차 
 *    자바 2차 ==> java.sql.* => 핵심
 *    ----------------------------
 *    자바 3차 ==> 웹 (javax.servlet.http.*)
 */
// 멤버 클래스 => 두개의 클래스가 공유해야 되는 데이터, 메소드 존재할 때 주로 사용
class A // 윈도우 , Server(접속 당담)
{
	class B //쓰레드, 통신담당
	{
		public void display()
		{
			System.out.println("B : display Call...");
		}
	}
	
	public void aaa()
	{
		B b = new B();
		b.display();
	}
}
// 익명의 클래스 => 상속을 받으면 속도가 늦기 때문에 상속없이 메소드 변경해서 사용할 때 => 빅데이터
// 마이바티스, 스프링=> 가끔 나옴
class D
{
	E e = new E(){
			public void display()
			{
				System.out.println("D: display Call...");
			}
	};
}
class E
{
	public void display()
	{
		System.out.println("E:display Call...");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		//A.B ab = a.new B();
		//ab.display();
		a.aaa();
		E e = new E();
		e.display();
		
		D d = new D();
		d.e.display();
	}
}
