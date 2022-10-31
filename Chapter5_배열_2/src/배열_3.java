import java.util.Arrays;

/*
 *  int[] arr={};
 *  int[] copy =arr; //주소에 의한 참조 (Call By Reference) => arr,copy 같은 주소를 제어
 *  
 *  int a =10;
 *  int b=a;  //값에의한 참조 (Call By Value) => a,b는 다른 메모리
 */
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		int[] copy =arr;             //Call By Reference (주소에 의한 참조)
		// Call By Value ==> 기본형
		System.out.println("arr="+arr);
		System.out.println("copy="+copy);
		//배열이나 클래스는 주소를 이용해서 접근하는 방식
		// 주소 ==> 주소 (같은 메모리를 제어)
		
		/*
		 *  int a = 10; 
		 *  int b= a;    // 기본형은 메모리 자체!! 
		 */
		System.out.println("arr= "+Arrays.toString(arr));
		System.out.println("copy = "+Arrays.toString(copy));
		
		copy[0]=100;
		//arr[0] -> 100이다! 
	}

}
