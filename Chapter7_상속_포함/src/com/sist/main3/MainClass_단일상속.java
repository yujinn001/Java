package com.sist.main3;
// 단일 상속 ! 한개씩만 가능
class A
{
	int a;
}
class B extends A
{
	//a
	 int b;
}
class C extends B
{
	// a,b
	int c;
}
class D extends A
{
	//a

}
class E extends A
{

}
/*
 *   상속 접근제어어 : 상속을 받은 경우 접근이 불가능 (private)
 *                  => protected (X)
 *                  => default (X)
 *                  => private => setxxx(), getXxx()
 *                  => 메소드는 통신 (public)
 *   상속 형식
 *   	class 하위 클래스 extends 상위클래스
 *    => 상속 =-> 필요시마다 변경해서 사용이 가능
 *    			------------------------- 오버라이딩
 *               오버라이딩 => 덮어쓴다(모든 내용이 동일)
 *               => 메소드
 *                  리턴형 메소드명 매개변수
 *                  
 */
public class MainClass_단일상속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}













