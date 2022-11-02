import java.util.Arrays;

// A~Z사이의 문자를  10개 저장 ==> 가장 큰값, 가장 작은 값 출력
public class 배열응용_2_응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = new char[10];
		for(int i =0; i<c.length; i++)
		{
			c[i] =(char)((Math.random()*26)+65);//0.0~0.99 //65 ==> 'A'
		}
		System.out.println(Arrays.toString(c));
		// 초기화
		char max =c[0];
		char min = c[0];
		for(char i : c) //char 비교!! 
		{
			if(max<i)
				max=i;
			else if(min>i)
				min=i;
		}
		// 필요한 데이터를 찾기 위한 제어
		System.out.println("가장 큰 문자: "+max);
		System.out.println("가장 작은 문자: "+min);
		// 찾은 내용을 출력
		/*
		 *   데이터를 여러개 저장
		 *   ---------------- 값(초기화)
		 *    1) 찾기 
		 *    2) 순서 변경(sort)
		 *    3) 출력
		 */
	}

}
