package com.sist.iterator;
import java.util.*;
/*
 *   Iterator / ListIterator
 *   ------------------------> 단방향(데이터를 읽을 때 처음-끝), 양방향(처음-끝, 끝-처음)
 *   = 컬렉션에 저장되어 있는 데이터에 접근 
 *   => 표준화 (ArrayList, Vector, LinkedList, HashSet, HashMap)
 *   Iterator의 주요 메소드
 */
public class MainClass_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("베");
		list.add( "귤");
		list.add("바나나");
		System.out.println("=== 일반 ===");
		for(String f  : list)
			System.out.println(f+ " ");
		System.out.println("\n ==== Iterato ====");
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+" "); // 실제 해당에서 데이터를 읽어온다
			
		}
		System.out.println("\n ======Vector======");
		Vector<String> vec = new Vector<String>();
		vec.add("hong");
		vec.add("shim");
		vec.add("kang");
		Iterator<String > it2= vec.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next()+" ");
		} 
		System.out.println("\n =====LinkedList=====");
		LinkedList<Integer > list2= new LinkedList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		Iterator<Integer> it3 = list2.iterator();
		while(it3.hasNext())
		{
			System.out.println(it.next()+" ");
		}
		System.out.println("====HashSet====="); // Iterator
		Set<Integer> set = new HashSet();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		Iterator< Integer> it4= set.iterator();
		while(it4.hasNext())
		{
			System.out.println(it4.next()+" ");
		}
		
	}

}
