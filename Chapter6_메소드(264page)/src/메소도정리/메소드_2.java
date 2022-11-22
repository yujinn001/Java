package 메소도정리;
/*
 *   261page
 *      JVM의 메모리 구조
 *       1. Method Area
 *          - method 저장
 *          - static 저장
 *       2. Stack  (메모리 자체 관리)
 *          - 지역변수 :  {}이 종료되는 메모리에서 변수는 사라진다
 *          - 매개변수
 *       3. Heap   (프로그래머 관리)
 *          - 인스턴스변수, 배열
 *            : 프로그램 종료시까지 유지
 *              사용하지 않거나  null이면 회수 (가비지 컬렉션)
 */
import java.util.Arrays;

public class 메소드_2 {
	// =>  객체생성 
	int[] rand(int no) //인스턴스 메소드는 객체를 생성한 후에 해야한다
	{
		int[] com = new int[no]; //배열을 동적
		for(int i =0; i<com.length; i++)
		{
			com[i]= (int)(Math.random()*45)+1;
			for(int j =0; j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		return com; // 배열 리턴형으로 지정하면 ==> 주소(배열명)
	}
	void rand(int[] com)
	{
		for(int i =0; i<com.length; i++)
		{
			com[i]= (int)(Math.random()*45)+1;
			for(int j =0; j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 int[] arr = {1,2,3,4,5};
//		 int[] temp = arr;
//		 System.out.println(Arrays.toString(arr));
//		 System.out.println(Arrays.toString(temp));
//		 temp[0]=100;
//		 temp[1]=200;
//		 temp[2]=300;
//		 temp[3]=400;
//		 temp[4]=500;
		메소드_2 m =new 메소드_2(); //rand() => 저장
		int[] arr=m.rand(10); // 결과값을 받아온다
		System.out.println(Arrays.toString(arr));	
		 int[] arr1 =new int[6]; //arr1 => 주소 (주소를 전송 => 해당 주소에 값을 채워달라)
		 m.rand(arr1);
		 System.out.println(Arrays.toString(arr1));	
		 // 클래스, 배열 ==> 값을 받을 경우 (리턴형, 매개변수)
		 /*
		  *   기본형 매개변수(int, double, char, boolean..) String ==> read only
		  *               변수 값을 읽기만 할 수 있다 (변경이 불가능하다)
		  *   참조형 매개변수 사용자정의 클래스, 배열 (주소) ==> read, write
		  *               변수값 읽기, 수정이 가능
		  *   *** 매개변수가 3개이상이면 클래스, 배열을 이용한다
		  */
	}
	

}
