import java.util.Scanner;

//입력 받은 값이 짝수인지 홀숨인지 
// 판별하는 메소드를 구현하시오
public class 공부11 {	
	static String method(int a)
	{
		if(a%2==0)
			return "짝수입니다";
		return "홀수 입니다";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =method(1);
		System.out.println(s);
	}

}
