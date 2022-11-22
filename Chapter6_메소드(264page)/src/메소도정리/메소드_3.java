package 메소도정리;

public class 메소드_3 {
	static void aaa() // static은 호출이 가능 => 인스턴스는 호출이 불가능
	{
		// static에서는 인스턴스 변수, 메소드 호출시에 반드시 메모리 할당을 한 후에 사용한다.
		메소드_3 m=new 메소드_3();
		m.first();
		}
	void first() 
	{
		System.out.println("fist() 진입...");
		second();
		System.out.println("first() 종료...");
	}
	void second()
	{
		System.out.println("second() 진입...");
		 last();
		 System.out.println("second() 종료");
	}
	void last ()
	{
		System.out.println("last() 진입...");
		 System.out.println("last() 종료");
	}
	/* 
	 * 		last
	 * 		------        ------
	 * 		second        second
	 *      ------        ------
	 *      first         first      first
	 *      ------        ------     ------
	 *       main          main        main     main  => ----------
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메소드가 메모리에 저장이 되지 않았다
		System.out.println("main() 진입...");
		메소드_3 m = new 메소드_3(); // 메소드가 저장 (인스턴스 변수는 객체 생성해서 저장)
		System.out.println("메모리 제작 m = "+m);
		System.out.println(m+" 메모리 주소에 메소드가 전체 저장");
		m.first();
		System.out.println("main() 종료");
		
		
	}

}
