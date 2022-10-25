/*
 *   90~100 A
 *   80~89  B
 *   70~79  C
 *   60~69  D
 *   59이하  F
 *  -----------
 *  
 *    함수/ 메소드 
 *    => 같은 기능이지만 클래스 안에서 사용하면 메소드, 클래스 밖에서 사용하면 함수
 *  
 *     라이브러리 / 프레임워크 (오픈 소스)
 *      완제품      레고
 *    바꿀수 없다   바꿀수 있다
 */
import java.util.Scanner;

public class 제어문_선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3개의 정수(국어, 영어, 수학) 
		Scanner sc =new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수(80 80 80) 입력: ");
		int kor = sc.nextInt(); // 사용자가 입력한 값을 가져오는 nextInt()
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg =total/3.0;
		
		// 학점
		char score = 'A'; //초기값 주기! , 공백은 안됨!
		
		switch((int)(avg/10)) // 실수형이 들어갈 수 없어서 int로 변환 ==> 문자, 문자열, 정수 => 10, 9, 8...0
		{
			case 10 :
				
			case 9:
				score ='A';
				break;
			case 8:
				score ='B';
				break;
			case 7:
				score ='C';
				break;
			case 6: 
				score='D';
				break;
			default:
				score ='F';	
		}
		System.out.println("국어점수 : "+kor);
		System.out.println("영어 점수 : "+eng);
		System.out.println("수학 점수 : "+math);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f\n ",avg);
		System.out.println("학점 : "+score);
	}

}














