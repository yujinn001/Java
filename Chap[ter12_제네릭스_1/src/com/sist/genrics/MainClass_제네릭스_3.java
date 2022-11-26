package com.sist.genrics;
import java.util.*;
public class MainClass_제네릭스_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Double> list3= new ArrayList<Double>();// 데이터형을 변경할 때는 wrapper클래스 사용
		ArrayList<?> list4 = new ArrayList<Integer>(); // 매개변수 => 모든 데이터형 저장 가능! ?
		list4 = new ArrayList<Double>();
		// 프로그램에 맞게 조절이 가능 (데이터형)
		// 항상 => 저장된 데이터에 대한 명시
		
	}

}
