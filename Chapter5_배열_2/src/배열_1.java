/* 
 *   1. 배열
 *      같은 데이터형을 묶어서 관리(데이터를 묶어서 사용)
 *      {"aaa",10,10.5,'A',true}-> 자바스크립트
 *      Object[] aaa = {"aaa",10,10.5,'A',true}; -> 자바 Object를 사용하여 데이터형을 섞어서 사용가능
 *                                                  하지만, for을 돌리기 어려움!! 일정하지 않아서!! 
 *      *** 프로그램 
 *          1) 변수 (데이터 저장)
 *          2) 명령문 
 *             int a = 10; ==> 명령문 (a라는 공간에 10을 저장하라)
 *             ******* 여러개의 데이터를 사용, 한 개의 이름으로 여러개 데이터를 관리하는 것이 편하다
 *             ----------------------------------------------------------------
 *             ----------- 데이터를 모아서 관리 ==> 같은 데이터형(배열), 다른 데이터형(클래스) => 데이터형 클래스
 *                                            ~ VO, MovieVO
 *             ----------- 명령어를 모아서 관리 ==> 메소드
 *             ---------------------------------------------------------------- 클래스 => 액션      
 */
// 1. 사용자의 입력값을 받아서 2진법을 출력 ==> 16bit(32767)
// 배열 => 0번부터~~, 15번부터
import java.util.Scanner;
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("정수 입력: 0~32767사이 >> ");
		int input = sc.nextInt();
		// 0,1 ==> 16개
		int[] binary = new int[16]; //0으로 초기화
		// 처음 => 0, 마지막 => 15 부터 넣을건지
		int index = 15;
		while(true)
		{
			binary[index]=input%2;
			input=input/2;
			if(input ==0)
				break;
			
			index--; // 값을 뒤에서부터 채워 나간다. 
			
		}
		// 출력 
		for(int i =0; i<binary.length; i++)
		{
			if(i%4==0&& i!=0) //i!=0 0을 제외하라
			{
				System.out.print(" ");
				
			}
			System.out.print(binary[i]);
		}
	}

}


















