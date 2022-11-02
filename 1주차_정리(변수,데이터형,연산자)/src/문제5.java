/*
 * 5) 다음 결과값을 작성하시오

	public static void main(String[] arg) 
	{
	      int num1=10;   
	      System.out.printf("%d \n", num1); //10
	      num1++; //헷갈림
	      System.out.printf("%d \n", num1);//11
	      ++num1;
	      System.out.printf("%d \n", num1);//12
	      --num1;
	      System.out.printf("%d \n", num1);//11
	      num1--;
	      System.out.printf("%d \n", num1);//11
	}
	// 출력하기전에 num1++이끝나기 때문에 10이 아니라 11이다.
	// 출력하는 System.out.println();부분에서 num1++이면 10이다.
 */
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		System.out.printf("%d \n",num1);//10 => 저장된 값 출력 num1 =10
		System.out.printf("%d \n",num1++);//10 => 출력하고 num1 =10 나중 증가 => num1 = 11

	}

}
