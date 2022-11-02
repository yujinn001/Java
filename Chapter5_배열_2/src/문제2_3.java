/*  
 *  변수/배열/클래스 ==> 선언, 초기화
 *  변수
 *     int a= 10;
 *     데이터형[] 배열명 = {};
 *     데이터형[] 배열명 = new 데이터형[갯수];
 *     
 *     클래스 => A
 *     A a=new A()
 *        ---- 메모리 위치 지정(주소값을 a에 저장)
 *    -------------------------------- 참조형 ==> new(동적메모리 할당)
 * 
 * 
 * 2번
 *  1) 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.
	=> char[] c =new char[10];
	​
	2) 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라.
	=> Int[] n= {0,1,2,3,4,5};
	​
	3) '일', '월', '화', '수', '목', '금', '토'로 초기화된 배열 day를 선언하라.
	Char[] day ={'일', '월', '화', '수', '목', '금', '토'};
	​
	4) 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로 선언하라.
	Boolean[] bool ={true, false, false, true};



    3번
		char[] alpha = {'a', 'b', 'c', 'd'};
		
		for(      int I =0; i<alpha.length; i++                    )
		     System.out.print(alpha[i]);

 */
public class 문제2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n");
		char[] strWeek= {'일', '월', '화', '수', '목', '금', '토'};
		for(char c : strWeek)
		{
			System.out.println(c+"\t");
		}
		int[] lastday= {31,28,31,30,31,30,31,30,31,30,31};
		
	}

}
