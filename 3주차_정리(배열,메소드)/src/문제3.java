//1~n까지 합을 구하는 메소드를 구현하시오

public class 문제3 {
	static int hap(int n)
	{
		int sum =0;
		for(int i =1; i<=n; i++)
		{
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = hap(100);
		System.out.println(sum);
	}

}
