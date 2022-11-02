import java.util.Scanner;

/*  
 * 	11) 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
 */

public class 문제11 {
	int n; // 같은 n이여도 메모리 공간이 다르게 저장된다  stack??
	
	// 갈색 ==> 지역변수 , 파랑색 ==> 멤버변수 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc =new Scanner(System.in);
		//System.out.println("정수 입력: ");
		//int num =sc.nextInt();
		
		int num = (int)(Math.random()*100)+1; // 1~100까지 랜덤수  //heap??
		int sum =0;
		for (int i =0; i<=num; i++)
		{
			sum+=i;	
		}
		System.out.println("범위 : " +num);
		System.out.println("1 ~ "+num+"까지의 합 :"+sum);
		
	}

}
