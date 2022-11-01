import java.util.Arrays;

// 1~100사이의 정수를 10개를 저장 ==> 최대값, 최소값을 구하고 차를 출력 (최대값 - 최소값)
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[10];
		for(int i =0; i<arr.length; i++)
		{
			arr[i] =(int)(Math.random()*100);
		}
		//출력
		System.out.println(Arrays.toString(arr));
		// 최대값, 최소값
		// 최대값 ==> 가장 낮은 값
		int max=1;
		// 최소값 ==> 가장 큰 값
		int min =100;
		for(int i :arr)
		{
			if(max<i)
				max =i;
			else if(min>i)
				min =i;
				
		}
		int index =0;
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i]==max)
			{
				index=i;
			    break;
			}
			
		}
		int index1 =0;
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i]==min)
			{
				index1=i;
			    break;
			}
			
		}
		System.out.println("최대값 : "+max+", 저장위치는 "+(index+1)+"입니다");
		System.out.println("최소값 : "+min+", 저장위치는 "+(index1+1)+"입니다");
		System.out.println("최대값과 최소값의 차 : "+(max-min));
	}

}
