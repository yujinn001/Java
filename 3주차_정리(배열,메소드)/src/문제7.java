import java.util.Arrays;
import java.util.Scanner;
 //모르겠음
//문자열을 거꾸로 출력하는 메소드를 구현하시오

public class 문제7 {
	static void reverse(String s)
	{
		for(int i= s.length()-1;i>=0;i--)
			{
			System.out.println(s.charAt(i));
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse("Hello Java!");
	}


}
