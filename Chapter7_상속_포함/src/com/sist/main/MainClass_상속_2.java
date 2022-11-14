package com.sist.main;
class Super2 // 같은 폴더안에 클래스이름이 같으면 오류!! 그래서Super2로
{
	int a=10;
	int b=20;
	public void display()
	{
		System.out.println("Super:display() Call...");
	}
	// 생성자, 초기화 블록, static은 상속이 아니라 공유
	// private은 상속은 된다 (단 접근이 불가능하다 ==> getter/ setter)
}
class Sub2 extends Super2
{
	int c =300;
	public Sub2()
	{
		a=100;
		b=200;
	}
	/*
	 *   ==> 메모리 상에만 저장이 된다 => 메모리가 상속 내린 클래스, 상속을 받은 클래스 ==> 따로 생성된다
		 ==> 단일 상속만 적용된다
		 ==> 상위클래스가 하위 클래스보다 데이터형이 크다
		 ==> 상위클래스가 하위 클래스보다 메모리 공간이 크다
		 예)
		     class A
		     {
		         int a ,b;
		     }
		     class B extends A
		     {
		     	// int a,b;
		      	int c;
		     }
		     
		     *** B  b= new B(); b.a, b.b, b.c
		     *** A c = new B(); c.a, c.b, c.c(오류)
		                                  ----------상위 클래스로 메모리 할당시에는 상위 클래스가 가지고 있는 변수만 접근이 가능
		        => 인터페이스나 추상 클래스에서 등장
		        ---------------------- 미완성된 클래스 => 완성해서 사용
		     *** B d =(B)new A(); ==> 형변환의 오류 발생 ==> 하위 클래스가 가지고 있는 변수에 접근이 가능
		    	 => 
		     
		     A>B => 범위 => 어느 클래스가 공통점을 많이 가지고 있는 지에 따라 크기가 결정
		     
		     B b = new B();
		     int     int
		     A c= new B();
		     double   int
		     B d = (B)new A(); ==> 오류!
		     int   double  // 왼쪽의 데이터형이 커야하는데 생성자부분이 커서오류!! 이럴 때는 형변환을 한다
		     int a = (int)10.5;
		     ---------------------
	 */
}
public class MainClass_상속_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//하위클래스
		Sub2 sub = new Sub2(); //Sub2 ==> a,b,c, 메소드 ==> Sub2 
		System.out.println("sub.a="+sub.a);
		System.out.println("sub.b="+sub.b);
		System.out.println("sub.c="+sub.c);
		// 상위 클래스
		Super2 sup = new Sub2();  //Super2 ==> a,b, 메소드 ==> Sub2 
		System.out.println("sup.a="+sup.a);
		System.out.println("sup.b="+sup.b);

		Super2 sup2 = new Sub2(); // 오류로 인한 형변환 //a,b,c ==> ClassCastException
	//  변수는 이거       메소드는 이거	
		Sub2 sub2 = (Sub2)sup2;
		System.out.println("sub2.a="+sub2.a);
		System.out.println("sub2.b="+sub2.b);
		System.out.println("sub2.c="+sub2.c);
		
		// 변수는 클래스형 / 메소드는 생성자
	}

}
