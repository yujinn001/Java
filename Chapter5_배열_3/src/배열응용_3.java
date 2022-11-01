import java.util.Arrays;
import java.util.Scanner;

// 숫자야구게임
/*
 *    765 =>167 ==>  1S-1B ==> 3S ==> 종료 (S : 같은자리, B: 다른자리)
 */
public class 배열응용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *   1. 난수 ==> 정수 3개 ==> 중복없는 난수 ==> int => 3
		 *   2. 사용자 입력
		 *   3. 비교
		 *   4. 힌트
		 *      S : ●
		 *      B : ○○
		 *   5. 종료 여부 확인
		 */
		// 변수 => 난수, 사용자 입력
		int[] com = new int[3]; // 게임에 필요한 난수 저장
		int[] user = new int [3];//사용자 입력값 저장
		
		for(int i=0; i<com.length; i++)
		{
			com[i]=(int)(Math.random()*9)+1; //1~9사이 난수 발생
			// 중복된 수 없애기
			for(int j =0; j<i;j++)
			{
				if(com[i] == com[j])
				{
					i--;
					break;
				}
			}
		}
		int count =0;
		//System.out.println(Arrays.toString(com));
		Scanner sc =new Scanner(System.in);
		while(true) //횟수가 지정되지 않았을 때는 while
		{
			System.out.print("세자리 정수를 입력하세요 : ");
			int input =sc.nextInt();
			// 오류 처리
			if(input<100||input>999)
			{
				System.out.println("잘못된 입력입니다.");
				continue; //조건식으로 이동 -> while문으로 이동!!(처음)
			}
			// 배열에 저장
			user[0] = input/100;
			user[1] = (input%100)/10;
			user[2] = input % 10;
			
			// 오류처리
			// 1. 같은 수를 입력(X), 0을 입력하면 안된다.
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("같은 수는 사용할 수 없습니다!!");
				continue;
			}
			if(user[0]==0 ||user[1]==0||user[2]==0)
			{
				System.out.println("0은 사용할 수 없다!!");
				continue;
			}
			count++;
			int s =0,b=0; //s는 같은자리, b는 다른자리!!
			// 비교
			for(int i =0; i<3; i++)
			{
				for(int j =0; j<3; j++)
				{
					if(com[i]== user[j])
					{
						if(i==j)
							s++;
						else 
							b++;
					}
				}
			}
			// 힌트
			//System.out.printf("Input Number : %d, Result : %dS-%dB\n", input, s,b);
			System.out.println("=======힌트=======");
			System.out.println("S: ");
			for(int i =0; i<s; i++)
			{
				System.out.print("●");
			}
			System.out.print("\nB:");
			for(int i =0; i<b; i++)
			{
				System.out.print("○");
			}
			System.out.println("\n=================");
			// 종료여부 확인
			if(s==3)
			{
				System.out.println("입력횟수 : "+count);
				System.out.println("Game Over!!"); 
				break;
			}
		}
	}

}










