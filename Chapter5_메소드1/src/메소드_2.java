import java.util.Scanner;

// 사용자가 구구단을 요청 ==> 단을 넘겨준다 (매개변수 => 단)
/*
 *    1) 자체출력
 *    2) 값을 넘겨준다
 */
public class 메소드_2 {

	static void  gugudan(int dan) // 받는 값이 없다
	{
		for(int i =1; i<=9; i++)
		{
			System.out.println(dan +"*"+i+"="+dan*i);
		}		 
	}
	static String gugudan2(int dan)
	{
		String  result ="";
		for(int i =1; i<=9; i++)
		{
			result +=dan+"*"+i+"="+(dan*i)+"\n";
		}	
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc= new Scanner(System.in);
		System.out.println("단 입력 :");
		int dan =sc.nextInt();
		gugudan(dan);
		System.out.println("==========================");
		String result =gugudan2(dan);
		System.out.println(result);
	}


}
