/*
 *  문제4. 사용자로부터 세 개의 정수를 입력받아, 
 *       그 수들의 최대값과 최소값, 
         합계와 평균을 구해보자.
 */
import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc= new Scanner(System.in);
		System.out.println("정수1 입력:");
		int num1 =sc.nextInt();
		System.out.println("정수2 입력:");
		int num2 =sc.nextInt();
		System.out.println("정수3 입력:");
		int num3 =sc.nextInt();*/
		int num1 =(int)(Math.random()*100)+1;
		int num2 =(int)(Math.random()*100)+1;
		int num3 =(int)(Math.random()*100)+1;
		
		System.out.println("a = "+num1+",b = "+num2+", c = "+num3);
		
		// 간단한 max,min값 구하기
		int max =num1;
	    if(max<num2)
			max = num2;
		else if(max<num3)
			max = num3;
	    System.out.println("최댓값 : "+max);
		
		int min=num1;//0으로 하면 최솟값이 0이 될 확률이 있으니 기본을 num1으로
		if(min>num2)
			min = num2;
		else if(min>num3)
			min = num3;
		System.out.println("최솟값 : "+ min);
		/*
		 * int max1 =Math.max(num1, num2);
		 * int max2 =Math.max(num3, max1);
		 * 
		 * int min1 =Math.min(num1, num2); 
		 * int min2 =Math.min(num3, min1);
		 */
		
		int total =num1+num2+num3;
		double avg =total/3.0;
		
		//System.out.println(max+"은(는) 최댓값입니다.");
		//System.out.println(min +"은(는) 최솟값입니다.");
		System.out.println("총합 : "+ total);
		System.out.printf("평균 : %.2f\n",avg);
	}

}
