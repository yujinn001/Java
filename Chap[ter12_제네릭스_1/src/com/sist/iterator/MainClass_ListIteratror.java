package com.sist.iterator;
import java.lang.reflect.Array;
// ArrayList, Vector, LinkedList에서만 사용이 가능
// 양방향으로 데이터 접근이 가능
import java.util.*;
public class MainClass_ListIteratror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(3);
		ListIterator< Integer> it = list.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.nextIndex() +" ");
		}
		System.out.println("\n ============");
		while(it.hasPrevious())
		{
			System.out.println(it.previous()+" ");
		}
			
			
	}

}
