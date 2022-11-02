// 1~10까지 짝수 출력 
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0;i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.print(i+ " ");
			}
		}
		System.out.println();
		
		// 더 간단하고 짝수 구하는 방법
		for (int i =2; i<=10; i+=2) // 초기값(어디서부터), 조건식(어디까지), 증감식(몇개 증가)
		{
			System.out.print(i + " ");
		}
	}
}
