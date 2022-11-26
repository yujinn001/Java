package com.sist.collection2;

import java.util.*;

interface Model
{
	public void execuete();
}
class BoardModel implements Model
{
	public void execuete()
	{
		System.out.println("게시판 처리");
	}	
}
class NoticeModel implements Model
{
	public void execuete()
	{
		System.out.println("공지사항 처리");
	}	
}
class ReserveModel implements Model
{
	public void execuete()
	{
		System.out.println("예약 처리");
	}	
}
/*
 *   	clear()
 *   	get()
 *   	***keySet() => 키 전체를 모아서 관리 
 *   	***put() => 데이터 저장 put(Object key, Object obj)
 *   	isEmpty()
 *   	size()
 *   	values()
 *   
 *   ===> 저장 / 읽기 / 갯수 
 */
class Container
{
	private Map map =  new HashMap();
	public Container()
	{ // 클래스 저장
		map.put("board",new BoardModel());
		map.put("notice",new NoticeModel());
		map.put("reserve",new ReserveModel());
	}
	public Model getBean(String key)
	{
		return (Model)map.get(key);
	}
}
// Spring
public class MainClass_Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container c= new Container();
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 선택 : ");
		String menu = sc.next();
		
		Model m =c.getBean(menu);
		m.execuete();
	}
}
