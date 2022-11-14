import java.util.Scanner;
class Student
{
	String name; //null
	int kor,eng,math; //0,0,0
//	Student(String n,int k, int e, int m)
//	{
//		this.name =n;
//	    ----- 생략
//		this.kor =k;
//		this.eng =e;
//		this.math =m;				
//	}
	// this()(자신의 생성자) this(자신의 객체) ==> 295
	//  => 라이브러리
	Student(String name,int kor, int eng, int math)
	{ // 변수명이 같을 때는 this.
		this.name =name; // this. 추가후 name은  멤버변수 
		this.kor =kor;
		this.eng =eng;
		this.math =math;				
	}
	
	Student()
	 {
		 
	 }
	// 인스턴스 메소드
	void print()
	{
		// this를 사용하는 곳 => 생성자, 인스턴스 메소드(static메소드는 사용이 불가능)
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점: "+(kor+eng+math));
		System.out.printf("평균 :%.2f\n",(kor+eng+math)/3.0);
		
	}
}
public class 매개변수생성자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력 :");
		String name =sc.next();
		System.out.print("국어을 입력 :");
		int kor =sc.nextInt();
		System.out.print("영어을 입력 :");
		int eng =sc.nextInt();
		System.out.print("수학을 입력 :");
		int math =sc.nextInt();
		
		// 객체 생성
		
		Student hong = new Student(name, kor, eng, math);
		hong.print();
		}

}
