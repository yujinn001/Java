package com.sist.main;
/*
 *     7장 => 객체지향의 특성
 *            = 유지보수
 *              ------- 재사용, 수정, 추가(오버라이딩)
 *                   변경 후 사용(상속), 변경없이 사용(포함)
 *                   --------- 오버라이딩
 *                   데이터 해킹 방지, 변질 방지 ==> 캡슐화
 *             클래스 종류 ==> 사용처
 *             
 *             1) 상속 ==> 310page
 *                기존의 클래스를 재사용해서 새로운 클래스를 만든다
 *                ----------------- 1) 소스량을 줄일 수 있다
 *                ----------------- 2) 신뢰성이 뛰어나다
 *                ----------------- 3) 코드의 중복 제거 
 *                
 *                ----------------- 1) 메모리가 커진다 => 속도가 늦다
 *                
 *                ==> extends(확장) class A extends B => B클래스를 확장한 클래스 A를 만든다
 *                                                     -------- 모든 내용을 가지고  온다
 *                                                     -------- 변수/메소드/생성자
 *                                                                       ----- 제외
 *                                                             ------------ private
 *                     ** 상위클래스(상속을 내리는 클래스): this
 *                     ** 하위클래스 (상속을 받는 클래스) : 상위클래스의 내용을 제어할 수 있다(super)
 *                                                   본인 클래스도 제어가 가능(this)
 *                ==> 상속을 받은 후에 변경
 *                    오버라이딩 (덮어쓴다)
 *                      ==> 메소드명, 리턴형, 매개변수가 동일, 접근지정어는 동일하지 않을 수 있다.
 *                          메소드는 대부분이 public
 *                ==> 데이터 보호 : 캡슐화
 *                    변수 : private, 메소드를 통해서 접근 ==> getter/ setter
 *                    -- 읽기 / 쓰기                        (읽기) (쓰기)
 *             2)  포함 ==> 재사용, 변경 ==> 익명의 클래스
 *                 B b = new B()
 *                 {
 *                 	 	오버라이딩
 *                 }
 *             3) new => 사용하지 마라
 *                => 대체하는 프로그램 : 리플렉션 ==> 9장
 */
// 디자인 패턴 ==> 싱글톤 패턴
class A
{
	private static A a;
	public static A newInstance()
	{
		if(a==null)
			a= new A();
		return a;
	}
	
}
public class MainClass_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = A.newInstance();
		System.out.println("a="+a);
		A b = A.newInstance();
		System.out.println("b="+b);
		A c = A.newInstance();
		System.out.println("c="+c);
	}

}
