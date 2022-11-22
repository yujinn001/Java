//두수를 입력받아 큰 수를 출력하는 메소드를 구현하시오.
public class 공부10 {
	static int method(int a, int b)
	{
		 int max =0;
		if(a<b)
			max =b;
		else 
			max =a;
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=method(20,500);
		System.out.println(m);
		
	}

}
