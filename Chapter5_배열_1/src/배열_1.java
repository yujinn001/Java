/* 
 *  변수 연산자 제어문(명령문 : 관련된 명령문을 묶어서 관리) ==> 메소드
 *  --  ----------
 *  데이터를 모아서 한개의 이름으로 제어
 *  ----------------------------
 *  데이터형을 사용자 직접 만들어서 관리
 *  = 같은 데이터형을 모아서 관리(배열)
 *  = 다른 데이터형을 모아서 관리 (클래스)
 *  =================================> 프로그램은 3개,(변수, 연산자, 제어문)
 *  ===================================== 견고한 프로그램 (예외처리)
 */
/*
 *   182page
 *   배열 ==> 여러개의 변수를 하나로 묶어서 관리하는 역할
 *   ---------> 일차 배열, 다차원 배열, 가변 배열
 *             --------
 *             테이블 형식 
 *   배열
 *      장점) 변수 여러개를 한개의 이름으로 제어(반복문을 사용하기 쉽다)
 *           연속적으로 메모리 배치 (인덱스번호를 이용해서 처리가 가능)
 *      단점) 고정적이다 ==> 가변형 (컬렉션)
 *           같은 데이터형만 모아서 관리
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a =80,b=70,c=50,d=60,e=100;
		int max =0;
		if(max<a)
			max=a;
		if(max<b)
			max=b;
		if(max<c)
			max=c;
		if(max<d)
			max=d;
		if(max<e)
			max=e;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
		System.out.println("max="+max);*/
		// 같은 데이터가 3개이상 ==> 배열
		/*
		 *  arr [i]
		 *  ---  ----
		 *  배열명  메모리 위치 (인덱스) => 순차적으로 생성 => for
		 *  -> 배열의 갯수보다 1개가 적다 (인덱스 번호는 항상 0번부터 시작)
		 *     주의점 (인덱스 번호가 초과되는 에러가 발생)
		 */
		int [] arr= {80,70,50,60,100};
		int max=0;
		for(int i =0; i<5; i++)
		{
			if(max<arr[i])
				max =arr[i];
		}
		for(int i =0; i<5; i++)
		{
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		System.out.println("max = "+max);
	}

}


















