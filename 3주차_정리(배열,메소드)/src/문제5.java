import java.util.Scanner;

//문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오

public class 문제5 {
	static String alpha(String s)
	{
//		String a =s.toUpperCase();
//		return a;
		return s.toUpperCase();
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("알파벳 소문자 입력: ");
				
		String s=sc.next();
		String a= alpha(s);
		System.out.println(a);
	}
}
