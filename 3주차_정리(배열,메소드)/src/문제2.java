//1~10까지 합을 구하는 메소드를 구현하시오

public class 문제2 {
	static int hap()
	{
		int sum=0;
		for(int i=1;i<=10; i++)
		{
			sum+=i;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=hap();
		System.out.println(sum);
	}

}
