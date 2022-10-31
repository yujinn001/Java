import java.util.Arrays;
import java.util.Scanner;

/*
 *  4. 양의 정수 10개 입력받아 배열에 저장하고, 
 *  배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라

 */
public class 문제4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc= new Scanner(System.in);
		//System.out.println("양의 정수를 입력하시오");
		int input=(int)(Math.random()*10)+1;
		int[] num=new int[10];
		for(int i=0; i<num.length;i++)
		{
			num[i]=(int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(num)); // 배열 출력!!!!
//		for(int i=0; i<num.length; i++) {   // 인덱스를 이용해서 값을 얻어온다
//			if(num[i]%3==0)
//			{
//				System.out.println("3의 배수 출력 => "+num[i]);
//	        }	
//        }
		
		  for(int i : num)
		  {
			  if(i%3==0)
				{
					System.out.print(i+" ");
					
		        }
		 }
		 
	}
}

