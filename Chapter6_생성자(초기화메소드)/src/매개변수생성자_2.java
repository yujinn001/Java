class Member
{   //default값
	int mno=1; //0 
	String name="홍길동"; // null
	String address="서울"; //null
	String tel="010-1111-1111"; //null
	Member() {
		// TODO Auto-generated constructor stub
	}
	Member(String name, String address, String tel)
	{
		mno=mno++;
		this.name =name;
		this.address=address;
		this.tel=tel;
	}
	public Member(int mno, String name, String address,String tel)
	{
		this(name,address,tel); //this() ==> 무조건 첫줄!!
		
		this.mno=mno;
		this.name =name;
		this.address=address;
		this.tel=tel;
	}
	// 메모리를 할당시에 => 초기 화!
	void print()
	{
		System.out.println("회원 번호 "+mno);
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+address); 
		System.out.println("전화 : "+tel);
		
	}
	
}
public class 매개변수생성자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member  m1= new Member(1,"홍길동","서울","010-111-111");
		m1.print();
		Member  m2= new Member(2,"박문수","경기","010-222-222");
		m2.print();
		Member  m3= new Member(3,"이순신","부산","010-333-333");
		m3.print();
		Member m4 = new Member("강감찬","인천","010-444-4444");
		m4.print();
				
	}

}
