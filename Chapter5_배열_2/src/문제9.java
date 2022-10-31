/*
 *  9.  arr 배열 중에서 값이 60인 곳의 인덱스를 출력해보자. 
 int[] arr = { 10, 20, 30, 50, 3, 60, -3 }; 
 */
public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,50,3,60,-3};
		
//		for(int i =0; i<arr.length; i++)
//		{
//			if(arr[i]==60)
//			{
//				System.out.println("값이 60인 곳 >> "+ i);
//			}
//		}
		int i =0;
		for( i =0; i<arr.length; i++)
		{
			if(arr[i]==60)
			{
					break;
			}
		}
		System.out.println("값이 60인 곳 >> "+ i);
	}

}
