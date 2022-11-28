package com.sist.main;
import java.lang.reflect.Method;
import java.util.*;
/*
 *   문서 => 정리 (소스코드안에서 정리) => 주석 (기능은 없다,검색만 하는 역할)
 *   => 많이 사용하는 곳 : 스프링 , 마이바티스, JPA (웹 관련 라이브러리 => 어노테이션)
 *   => 사용자 정의는 거의 없다
 *   -------------------------------------------
 *   711page ==> 사용자 정의
 *   1. Target : 구분자
 *      클래스 찾기 => Target(TYPE) ==> type (클래스와 관련) => 클래스형, 인터페이스, 열거형
 *     
 *      @ 1                                           ------
 *      class ClassName
 *      {
 *         -------------------
 *         	변수  Target(FIELD)
 *          => 일반 변수는 사용하지 않는다
 *          => 클래스, 인터페이스, 열거형
 *          @ 2
 *          ClassName c;
 *         -------------------
 *          메소드 Target(METHOD)
 *          @ 3
 *          public void display()
 *          {
 *          }
 *          public void display(@ B b => Target(PARAMETER)
 *         -------------------
 *          생성자
 *          @ => Target(CONSTRUCTOR)
 *          public 생성자()
 *          {
 *          }
 *         -------------------
 *      }
 */
class Board2 
{
	@RequestMapping("write.do")
	public void write() // write.do
	{
		System.out.println("글쓰기 처리...");
	}
	@RequestMapping("list.do")
	public void list() // list.do
	{
		System.out.println("게시물 목록 출력...");
	}
	@RequestMapping("update.do")
	public void update() //update.do(do : 실행)
	{
		System.out.println("게시물 수정하기");
	}
	@RequestMapping("delete.do")
	public void delete() // delete.do
	{
		System.out.println("게시물 삭제...");
	}
	@RequestMapping("find.do")
	public void find() //find.do
	{
		System.out.println("게시물 찾기");
	}
	@RequestMapping("detail.do")
	public void detail() // detail.do
	{
		System.out.println("상세보기");
	}
}
public class MainClass_어노테이션_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("기능 요청 : ");
		String cmd = sc.next();
		
		try
		{
			// => 라이브러리
			Class clsName = Class.forName("com.sist.main.Boards");
			// 클래스 정보 읽기
			// 메모리 할당
			Object obj =clsName.getDeclaredConstructor().newInstance();
			// 클래스안에 선언된 모든 메소드 읽기
			Method[] methods= clsName.getDeclaredMethods();
			for(Method m: methods)
			{
				RequestMapping rm = m.getAnnotation(RequestMapping.class);
				// Method위에 있는 메소드 찾기 
				if(rm.value().equals(cmd))
				{
					m.invoke(obj, null); // 메소드 호출
					// detail() => null 매개변수 없는 경우 호출
					break;
				}
			}
		}catch(Exception ex) {}
	}

}

















