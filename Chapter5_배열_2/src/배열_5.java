import java.util.Arrays;

// 배열 복사
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {100,200,300,400,500};
		int[] copy= new int [arr.length*2]; // 배열에 있는 값만 복사
		
		System.arraycopy(arr,0,copy,0,arr.length);//arr[0]에서 copy[0]으로 arr.length개의 데이터를 복사
		// arr의 인덱스, copy 인덱스
		System.out.println("arr = "+Arrays.toString(arr));
		System.out.println("copy = "+Arrays.toString(copy));
	}

}
