/*
 *   true/false => 나눠서 처리
 *   짝/홀, 대문자/소문자, 로그인 여부, ID중복
 *   
 *   형식) 
 *        if(조건)
 *        {
 *         	   조건이 true일 때 처리
 *        }
 *        else
 *        { 	
 *             조건이 false일 때 처리
 *        }
 *        ------------------------
 *        단일 조건문
 *        
 *        if(조건)
 *        {
 *            조건이 true일 떄 처리
 *        }
 *        if(!조건)
 *        {
 *           조건이 false일 때 처리
 *        }
 */
// 난수 발생 ==> 알파벳
import java.util.Scanner; 
// Scanner의 단점 ==> 문자 입력이 없다 ==> 문자열 (한글자만 charAt(0))
public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 문자 입력 :");
		
		char alpha = sc.next().charAt(0); //문자열에서 첫번째 글짜 (0) : 첫번째, (1) : 두번째...
		if(alpha >='A' && alpha<='Z')
			System.out.println(alpha + "는(은) 대문자입니다!!");
		//if(alpha >='a'&& alpha <='z')
		else
			System.out.println(alpha+"는(은) 소문자입니다!!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
