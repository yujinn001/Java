import java.util.Arrays;

/*
 *  	버블 정렬
 *      20 30 10 50 40
 *      -- --
 *      20 30
 *         -- --
 *         10 30
 *            -- --
 *            30 50
 *               -- --
 *               40 50
 *    ------------------ 1 round(for 1회 실행)
 *    .
 *    .
 *    .
 *    ------------------ 4 round(for 4회 실행)
 */
public class 배열응용_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		// 초기화
		for(int i =0; i<arr.length; i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		//출력
		System.out.print("정렬 전 : ");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]==arr[j+1])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
		}
		//출력
		System.out.print("정렬 후 : ");
		System.out.println(Arrays.toString(arr));
		
	}

}














