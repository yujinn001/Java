package com.sist.main;
/*   691page => 열거형 (데이터를 모아서 관리) 
 *                    -------------- 관련된 일반 데이터 : 배열 
 *                                   관련된 상수 : 열거형
 */
import java.util.*;
// 클래스 일종 => 생성자, 멤버 변수
enum 과일명 
{
	사과("apple"),
	아보카도("avocado"),
	바나나("banana"),
	블랙베리("blackberry"),
	블루베리("blueberry"),
	포도("grape"),
	오렌지("orange"),
	귤("tangerine");
	
	private String en;
	
	과일명(String en)
	{
		this.en=en;
	}
	public String getEn()
	{
		return en;
	}
}
public class MainClass_열거형 {
	
	public static void main(String args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("과일명 입력:");
		String f = sc.next();
		for(과일명 n : 과일명.values())
		{
			//System.out.println();
			if(n.name().equals(f))
			{
				System.out.println(f+"의 영어명은 "+n.getEn());
				break;
			}
		}
	}
}





















