import java.util.Arrays;
/*  1. 배열 => 1)같은 타입의 여러변수를 하나의 묶음응로 다루는것
 *         2)배열의  각 요소는 서로 연속적이다
 *   배열, 클래스 ==> 참조 변수(메모리 주소)
 *    배열    실제값
 *   (Stack)  (heap) // 저장공간과 선언된 변수의 주소가 다르다!
 *   기본형 ==> 메모리 자체!!!
 *   배열 안에는 
 */
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		int[] copy = new int[arr.length];
		//   ------ 데이터가 저장된 주소를 저장하고 있다 (참조변수)
		System.out.println("arr="+arr);
		System.out.println("copy ="+copy);
		
		
		for(int i =0; i<arr.length; i++)
		{
			copy[i] =arr[i];			
		}
		System.out.print("arr= "+Arrays.toString(arr) );
	}

}
