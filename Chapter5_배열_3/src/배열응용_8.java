import java.util.Arrays;

/*
 *    버블 정렬: 인접한 것끼리 변경
 *    
 */
public class 배열응용_8 {

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
		for(int i =0; i<arr.length-1;i++)
		{
			for(int j =0; j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					char temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.print("정렬 후 : ");
		System.out.println(Arrays.toString(arr));
	}

}
