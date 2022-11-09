//3의 배수를 판별하는 메소드를 구현하시오
 
public class 공부12 {
	static String method(int a)
	{
		if(a%3==0)
			return "3의배수입니다";
		return "3의 배수가 아닙니다";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = method(6);
		System.out.println(s);
	}

}
