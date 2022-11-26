package com.sist.genrics;
class Box<T> // T => 임시 저장 클래스형 데이터 => T는 지정된 데이터형으로 변경 (사용하지 않는 경우에는 Object)
{
	T item;
	// Box<String> ==> T => String
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}
public class MainClass_제네릭스_2 {
	public static void main(String[] args){
		Box box = new Box();	// T => Object
		box.setItem("aaa");
		String s =(String)box.getItem(); // 지정하지 않으면 Object가 오게 돼서 형변환을 시켜준다
		Box<String> box1 = new Box<String>();
		box1.setItem("");
		s=box1.getItem();//형변환이 필요없다
		Box<Integer> box2 = new Box<Integer>();
		box2.setItem(111);
		int i = box2.getItem(); // 언박싱
		// Integer i =100; int ii=i;
		/*
		 *   Wrapper
		 *   클래스형 = 기본형 데이터 : 박싱
		 *   기본형 = 클래스형 : 언박싱
		 *   ------------------------- 호환
		 *   Integer
		 *   int = Integer
		 *   Integer = int
		 */
		Integer ii =100; // 박싱 
		int a =ii; // 언박싱
	}
}

