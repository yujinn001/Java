/*
 *  문제5. 사용자로 부터 정수를 입력받아서 양수인지 음수인지 확인하는 
          프로그램 작성
    if ~ else
    if (num < 0)
 */
import java.util.Scanner;
public class 문제5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num =sc.nextInt();
		
		if(num>=0)
			System.out.println(num+ "은(는) 양수 입니다");
		else
			System.out.println(num + "은(는) 음수입니다.");
		
		// 한줄 표현 if~else = 삼항연산자 
		//System.out.println(num <0? num+"은(는) 음수입니다": num+"은(는) 양수입니다)
	}
}
