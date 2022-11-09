import java.util.Scanner;

//문자열을 거꾸로 출력하는 메소드를 구현하시오
public class 공부7 {
	static void reverse(String s)
	{
		for(int i =s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse("HEllo JAVA");
	}

}
