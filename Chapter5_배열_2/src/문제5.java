import java.util.Arrays;

/*
 * 5. 정수를 10개 저장하는 배열을 만들고
 *  1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라.
 *   그리고 배열에 든 숫자들과 평균을 출력하라.
 */
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num =new int[10];
		// int input = (int)(Math.random()*10)+1;
		for(int i =0; i<num.length;i++) {
			num[i]=(int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(num));
		double avg =0;
		int sum=0;
		for(int i =0; i<num.length; i++)
		{
			sum+=num[i];
		}
		avg=sum/10.0;
		System.out.println("평균 >> "+avg);
	}

}
