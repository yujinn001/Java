import java.util.Arrays;

/* 
 *    1. 선언
 *       알파벳 대문자 전체를 저장 ==> 선언 ==> 시작과 동시에 메모리를 확보
 *       char[] alpha =new char[26]; ==> ' '
 *       정수를 10개 저장 
 *       int[] num = new int[10]; ==> 0
 *       실수를 10개 저장
 *       double[] num= new double[10]; ==> 0.0 
 *       true/false => 10개 => 빈공백
 *       boolean[] seat = new boolean[100]; ==> false
 *       ---------            -------------메모리 저장 갯수 지정 ==> 자동 초기화
 *    2. 초기화
 *       1) 명시적인 초기화 
 *          정수 5개저장
 *          int[] arr = {10,20,30,40,50};
 *          int[] arr = new int[5];
 *          arr[0] = 10;
 *          arr[1] = 20;
 *          ..
 *          ..
 *       2) 난수
 *          int[] arr =new int[5];
 *          arr[0]= (int)(Math.Random()*100);
 *          ..
 *          ..          
 *       3) 입력값
 *       int[] arr= new int[3];
 *       arr[0] =scan.nextINt()
 *       ..
 *       4) 웹애서 읽기 : Jsoup ==> 예외처리, String
 *    3. 출력 
 *       일반 for => 데이터 변경이 가능 (인덱스번호를 이용해서 변경)
 *       for(int i =0; i<갯수; i++)
 *       {
 *       	앞에서부터 ~~
 *       }
 *       for(int i = 갯수; i>=0; i--)
 *       {
 *        	뒤에서부터 ~~  ===> 거꾸로 출력, 이진법 (진법)
 *       }
 *       
 *       forEach(향상된 for) => jdk 1.5이상 => readonly(읽기전용)
 *       ==> 값을 읽을 때 0번부터 읽는다
 *       거꾸로 뒤집는건 일반 for문!!
 *       데이터형[] arr = new데이터형[10];
 *       -----      
 *              =  ==>선언 데이터형과 for문의 데이터형이 같아야한다
 *       for(데이터형 변수명:배열명) : 출력용으로 주로 사용한다
 *           ------     ------ 배열명 ==> 실제 저장된 데이터를 읽어 온다
 *       {
 *       }
 *    4. 배열갯수
 *       배열명.length
 *       
 *    ---------------------- 관련된 데이터?
 *    
 *    
 */
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha = new char[26];
		// 초기화
		char c ='A';
		for (int i =0; i<alpha.length; i++)// 배열 => 반드시 인덱스를 이용하게
		{
			alpha[i]=c; 
			c++;
		}
		for(char ch :alpha) // 데이터 변경이 불가능 (배열에 저장된 데이터)
		{
		 ch=(char)(ch+32);
		  System.out.print(ch);
		}
		// 값을 소문자로 변경
		System.out.println();
		// 배열에 있는 데이터를 변경 ==> 인덱스
		for(int i =0; i<alpha.length; i++)
		{
			alpha[i]=(char)(alpha[i]+32);
		}
		System.out.println(alpha[0]);
		/*
		 *  배열에 있는 실제 데이터값 변경 ==> 인덱스를 이용한다 => for은 일반 for
		 *  배열에 있는 실제 데이터값만 읽는다 ==> for은 forEach (실제 데이터 변경이 불가능) readonly!!!!!!
		 *  예외) 클래스는 값을 변경이 가능!!!!!
		 */
		System.out.println();
		// 정수 30개 저장 정수 값은(0,1,2);
		int[] arr = new int[30];
		for(int i =0; i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*3);
		}
		System.out.println(Arrays.toString(arr));
		
		// 빈도수 구하기(통계)ㅏ[ㅏ
		int a=0,b=0,d=0;
		for(int i :arr)
		{
			if(i==0) a++;
			else if(i==1) b++;
			else if(i==2) d++;
				
		}
		System.out.println("0 => "+a+", 1=> "+b+", 2=> "+d);
	}

}












