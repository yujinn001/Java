import java.util.Arrays;
/* 
 *   System.arraycopy() : 배열의 크기가 다른 경우 (원하는 위치에 데이터 배치)
 *   arr.clone() : 있는 그대로
 */
public class 배열_6 {
	public static void main(String[]args) {
		char[] arr= {'A','B','c','d','E'};
		char[] copy= new char[arr.length];
		//값을 복사 ==> 출력 arr/copy
		
		copy=arr.clone();
		System.out.println("Arr="+Arrays.toString(arr));
		System.out.println("copy="+Arrays.toString(copy));
		copy[0]='k';
		System.out.println("Arr="+Arrays.toString(arr));
		System.out.println("copy="+Arrays.toString(copy));

		
	}
}
