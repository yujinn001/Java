/*
 *   다중 조건문(해당 조건문 1개만 수행) ==>141age
 *   // if문과 else문은 단 한번만 사용가능!!!
 *                     -----
 *   1) 형식
 *       if(조건)
 *       {
 *          조건이 true 일때만 수행하는 문장 ↗ 종료
 *               
 *               ↓ false
 *       }
 *       else if(조건문)
 *       {
 *       	조건이 true 일때만 수행하는 문장 ↗ 종료
 *               
 *               ↓ false
 *       }
 *       ...
 *       ...
 *       else
 *       {
 *       	// 생략이 가능
 *          해당 조건이 없는 모든 내용을 수행
 *       }
 *       
 *       1~100까지의 정수중 3의 배수, 5의 배수, 7의 배수 출력
 *                     ----------------------------- 단일 조건문 (중복적으로 수행하는 부분이 있어서 단일조건문으로 / 여러개를 출력될 수 있으면 단일조건문으로)
 *                     15 
 *       
 */

public class 제어문_다중조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor =(int)(Math.random()*101); // 0~100사이 (random은 double형이다 그래서 int를 써준다)
		//            --------------------  0.0~100.0 ==> 0 ~ 100
		int eng =(int)(Math.random()*51)+50;  //default값으로 50
		int math =(int)(Math.random()*51)+50;
		
		int avg = (kor+eng+math)/3;
		
		char hakjum='A';
		if(avg>=90)
			hakjum ='A';
		else if(avg >=80)
			hakjum ='B';
		else if(avg>=70)
			hakjum ='C';
		else if(avg >=60)
			hakjum ='D';
		else
			hakjum='F';
		// if 여러개 사용 ==> 여러번 수행(단일 조건문 여러개), 한번만 수행(다중 조건문)
		System.out.println("국어 : "+ kor);
		System.out.println("수학 : "+ math);
		System.out.println("영어 : "+ eng);
		System.out.println("학점 : "+ hakjum);
			
	}

}
















