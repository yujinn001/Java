/*
 *     // 다른 데이터형이 여러개 ==>  Object
 *     // 갯수가 여러개 ==> ...
 */
public class 오버로딩_2 {
//	void names(String n1)
//	{
//		System.out.println(n1);
//	}
//	
//	void names(String n1, String n2)
//	{
//		System.out.println(n1+" "+n2);
//	}
//	void names(String n1, String n2, String n3)
//	{
//		System.out.println(n1+" "+n2+" "+n3);
//	}
//	void names(String n1, String n2, String n3, String n4)
//	{
//		System.out.println(n1+" "+n2+" "+n3+" "+n4);
//	}
//	void names(String n1, String n2, String n3, String n4, String n5)
//	{
//		System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5);
//	}
	// 가변 매개변수 ==> 웹 ==> 사용자가 보내준 데이터를 받는 경우
	void names(String... name) //...은 연산자
	{
		for(String s: name)
		{
			System.out.print(s+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		오버로딩_2 a= new 오버로딩_2();
		a.names("홍깅동");
		a.names("홍길동","박문수");
		a.names("홍길동", "박문수", "이순신");
		a.names("홍길동","박문수","이순신","김두한");
		a.names("홍길동","박문수","이순신","김두한","강감찬");
		
		//int a =10;
		//Object o =10;
			
	}

}
