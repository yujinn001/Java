import java.util.Scanner;

// 두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오(실수)
// 실제 계산기 ==> 변수(String) ==> 7,9=>79
public class 문제4 {
	static String div(int a, int b)
	{
		String result ="";
		if(b==0)
			result="0으로 나눌 수 없습니다";
		else
			result =String.valueOf((a/(double)b)); //결과값을 문자열로 변경
		return result;
	  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int a =sc.nextInt();
		System.out.print("두번째 정수 입력: ");
		int b =sc.nextInt();
		
		// 결과값 받ㄱ기
		String result = div(a,b);
		System.out.println(result);
				
	}

}
