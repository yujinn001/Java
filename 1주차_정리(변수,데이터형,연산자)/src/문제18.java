import java.util.Scanner;

/* 모르겠음
 * 구현 내용 :
 *    1. 정수 변수 선언
 *    2. 문자열 변수 선언
 *    3. 키보드로 부터 정수를 하나 입력 받음
 *    4. 입력받은 정수가 짝수이면 "짝수다" 를 문자열변수에 기록하고       
 *   짝수가 아니면 "홀수다"를 문자열변수에 기록하고 
 *           문자열변수 값 출력함   
 *    <짝수의 조건>
 *         어떤 수를 2로 나눈 나머지가 0과 같으면 짝수임.
 */
public class 문제18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* (나)
		 * int a ; char b;
		 * 
		 * Scanner sc = new Scanner(System.in); 
		 * a = sc.nextInt(); 
		 * b = sc.next().charAt(0);  //String을 안배워서 아래의 방법으로 
		 * System.out.println("입력받은 정수는: "+ (a%2==0? ("짝수다" +
		 * a):("홀수다" + b)));
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println(" 정수 입력: ");
		int a = sc.nextInt();
		System.out.println(a%2==0? "짝수다": "홀수다");
		
	}

}
