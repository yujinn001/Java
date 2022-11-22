import java.util.Scanner;

/*
 *  5. 문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오
 *     a65  A97
 */
public class 공부5 {
	static String method(String s)
	{
		return s.toUpperCase();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("문자열 입력: ");
		String s =sc.next();
		
		String a =method(s);
		System.out.println(a);
		
		
	}

}
