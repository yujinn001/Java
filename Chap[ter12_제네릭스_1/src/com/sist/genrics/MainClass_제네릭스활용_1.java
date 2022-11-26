package com.sist.genrics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class MainClass_제네릭스활용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===ArrayList에서 제네릭스 사용법 =====");
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("배");
		list.add("수박");
		// ArrayList<String> ==> 데이터형
		/*
		 *  void display(ArrayList list)
		 */
		//HashSet  set = new HashSet(); //Object (모든 데이터형의 값을 첨부)
		HashSet<Integer> set = new HashSet<Integer>();
		// ==> set은 저장할 수 있는 데이터형은 int만 가능하다!
		set.add(100);
		//set.add(10.5); => Integer만 가능하므로 오류!!
		set.add(200);
		set.add(300);
		
		for(int i : set)
			System.out.println(i); // 중복을 허용하지 않는다 (Primary)
		// 데이터베이스 : 저장공간 (table) ==> 반드시 중복이 안된 데이터가 1개 이상 필요
		System.out.println("====Vector=====");
		Vector<Double> vec = new Vector<Double>();
		vec.add(89.9);
		vec.add(10.5);
		vec.add(30.6);
		for(double d : vec)
			System.out.println(d);
		System.out.println("==== LinkedList ====");
		LinkedList<Character> in = new LinkedList<Character>();
		in.add('a');
		in.add('b');
		in.add('c');
		for(char c: in)
			System.out.println(c);
		System.out.println("===Map===");
		HashMap<String, Boolean> map = new HashMap<String,Boolean>();
		map.put("a", true);
		map.put("b", false);
		map.put("c", true);
		map.put("d", false);
		map.put("e", true);
		
		String[] key= {"a","b","c","d","e"};
		for(String k : key)
		{
	//		System.out.println(map.keySet(k));
		}
 	}

}













