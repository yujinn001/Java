import java.util.Arrays;

/*
 *   	T  J  V  Q  L  ==> select sort
 *     --  --
 *     --     --
 *     --        -- 
 *     --           --
 *     ------------------- 1round(for 1회 실행)
 *     .
 *     .
 *     .
 *     ------------------ 4round(for 4회 종료)
 *     
 */
public class 배열응용_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr =  new char[10];
		// 초기화
		for(int i =0; i<arr.length; i++)
		{
			arr[i]=(char)((Math.random()*26)+65);
		}
		System.out.print("정렬 전 : ");
		System.out.println(Arrays.toString(arr));
		// 정렬
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j =i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
			
		}
		System.out.print("정렬 후 : ");
		System.out.println(Arrays.toString(arr));
	}

}














