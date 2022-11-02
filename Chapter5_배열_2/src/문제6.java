import java.util.Arrays;

/*
 *  6. int[] num = { 94, 85, 95, 88, 90 };
 *  다음 배열에서 최대값,최소값을 출력하는 프로그램을 작성하시오
 */
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 94, 85, 95, 88, 90 };
		int max =num[0];
		int min = num[0];
		System.out.println(Arrays.toString(num));
		
		for(int i :num)
		{
			if(max<i)
				{
					max =i;
				}
				if(min>i)
				{
					min =i;
				}
//		for(int i =0; i<num.length; i++)
//		{
//			if(max<num[i])
//			{
//				max =num[i];
//			}
//			if(min>num[i])
//			{
//				min =num[i];
//			}
		}
		System.out.println("최댓값 >> "+max);
		System.out.println("최솟값 >> "+min);
		
	}

}
