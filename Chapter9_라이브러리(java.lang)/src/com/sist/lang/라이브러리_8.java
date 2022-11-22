package com.sist.lang;
//Class 객체 얻기
class Card
{
   private int num;
   private String type;
   
	public int getNum() { //읽기
		return num;
	}
	public void setNum(int num) { //쓰기
		this.num = num;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
   
   
}
public class 라이브러리_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메모리 할당 
		 Card card1 = new Card();
		 card1.setNum(1);
		 card1.setType("◆");
		 
		 System.out.println("card1.number : "+card1.getNum());
		 System.out.println("card1.type : "+card1.getType());
		 
		 // 메모리 할당2
		 try {
			 Class className= Class.forName("com.sist.lang.Card"); // 데이터 베이스 => Driver
			 // CheckedException ==> ClassNotFoundException ==> 예외처리
			 // 클래스 이름으로 메모리를 할당
			 Object obj =className.getDeclaredConstructor().newInstance();
			// Object obj =className.newInstance(); //경고 (사용금지 권고)
			 
			Card c2= (Card)obj;
			c2.setNum(2);
			c2.setType("♠");
			
			System.out.println(c2.getNum());
			System.out.println(c2.getType());
		 }catch(Exception ex) {}

	}

}











