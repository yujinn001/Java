import java.util.Scanner;
/*
 * 12) 사용자로부터 두 개의 정수를 입력 받아서
 *     뺄셈과 곱셈 연산의 결과를 출력하는 프로그램을 작성
 */
public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//System.out.println("두 개의 정수 입력():");
		System.out.println("첫 번째 정수 입력:");
		int a = sc.nextInt();
		
		System.out.println("두 번째 정수 입력:");
		int b = sc.nextInt();
		
		//System.out.println("뺼셈 연산: "+ (a>b? a-b:b-a));
		//System.out.println("곱셈연산: "+ a*b); 
		System.out.printf("%d-%d=%d\n",a,b,a-b);
		System.out.printf("%d*%d=%d\n",a,b,a*b);
		
		// printf ==> 원하는 갯수만큼 대입(가변매개변수) ...
		// (String format, object... args) ==> 메소드
		/*
		 * 		int a =10;
		 *  	a++;
		 *  	// 증가
		 *  	++a;// 증가
		 *  
		 *  	int a =10;
		 *      System.out.pringln(a++) =>10
		 *      // 증가
		 *      System.out.println(++a) => 12
		 */
		 
	}

}
