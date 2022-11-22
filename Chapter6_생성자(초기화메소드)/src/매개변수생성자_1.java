import java.util.Scanner;
class Sawon
{
	int sabun;
	String name;
	String dept; //부서명
	String loc; // 근무지
	long pay;  // 연봉
	Sawon()
	{
		sabun =1;
		name ="홍길동";
		dept="개발부";
		loc="서울";
		pay =5000;
	}
	Sawon(int sabun, String name)
	{
		this(); //자신의 생성자 호출가능
		
	}
	Sawon(String dept, String loc, long pay)
	{
		this();
	}
	public Sawon(int sabun, String name, String dept, String loc, long pay) {
		this(dept,loc,pay);
//		this.sabun = sabun;
//		this.name = name;
//		this.dept = dept;
//		this.loc = loc;
//		this.pay = pay;
	}
	void print()
	{
		System.out.println("사번"+sabun);
		System.out.println("이름"+name);
		System.out.println("부서"+dept);
		System.out.println("지역"+loc);
		System.out.println("연봉"+pay);
	}
}
public class 매개변수생성자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Sawon a= new Sawon();
		 a.print();
		 
	}

}
