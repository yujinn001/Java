/*
 *   문제6. 임의의 문자를 추출하여 
 *   대문자인지 소문자인지 확인하는 프로그램 작성
 */
import java.util.Scanner;
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc= new Scanner(System.in);
		//System.out.println("문자 입력:");
		//char c = sc.next().charAt(0);
		
		int i =(int)(Math.random()*2); // 0~1 (대문자)
		int no =(int)(Math.random()*26)+65; // (소문자)		
		
		char c=' ';
		
		if(i==0)
		{
			c=(char)no;
		}
		else
		{
			c=(char)(no+32);
		}
		System.out.println("c: "+c);
		
		
		
		  if(c>='A'&& c<='Z') 
			  System.out.println(c+"은(는) 대문자입니다."); 
		  else		 
			  System.out.println(c+"은(는) 소문자입니다.");
		

	}

}
