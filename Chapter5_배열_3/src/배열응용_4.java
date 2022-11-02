import java.util.Arrays;

/*
 *   정렬 (ASC, DESC)
 *       ---- 올림차순 / 내림차순
 *    = 선택정렬
 *      30 10 40 50 20
 *      -- -- 
 *      10 30
 *      --    --
 *      10    40
 *      --       --
 *      10       50
 *      --          --
 *      10          20
 *      ----------------- 1round (for 1회 실행)
 *      10  30  40  50  20
 *          --  --
 *          30  40
 *          --      --
 *          30      50
 *          --          --
 *          20          30
 *     -------------------- 2round (for 2회 실행)
 *     10 20 40 50 30
 *           -- --
 *           40 50
 *           --    --
 *           30    40
 *    -------------------- 3round (for 3회 실행)  
 *    10 20 30 50 40
 *             -- --
 *             40 50
 *    -------------------- 4round (for 4회 실행)   
 *    10 20 30 40 50
 *                --      
 *            
 *    = 버블정렬
 *    
 */
public class 배열응용_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// select sort (앞에서 부터 고정!!)
		// 정렬 대상
		int[] arr = new int[5];
		// 초기화
		for(int i =0; i<arr.length; i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		//출력
		System.out.print("정렬 전 : ");
		System.out.println(Arrays.toString(arr));
		
		//정렬
		for(int i =0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) // 오름차순
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println((i+1)+" : "+Arrays.toString(arr));
			 
		}
		//출력
		System.out.print("정렬 후 : ");
		System.out.println(Arrays.toString(arr));
		
	}

}























