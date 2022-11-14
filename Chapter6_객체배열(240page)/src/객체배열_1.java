/* ^^^
 *     1. 클래스 : 관련된 변수를 모아서 관리 (다른 데이터형을 포함할 수 있다)
 *        클래스를 메모리에 저장 ==> 주소를 가지고 있는 변수 (클래스 변수, 객체, 인스턴스)
 *     2. 클래스 메모리 저장 : new를 사용한다(heap) => 사용자 관리 메모리
 *     3. 메모리할당 (new => 동적 메모리 할당 ==> 실행시게 저장_
 *     4. 방식 : 클래스 명 변수명 = new 클래스명();
 *                                -------- 생성자
 *     5. 
 *        1) package :현재 저장되어 있는 위치 : 한번만 사용
 *        2) import :여러개 사용이 가능
 *        3) public class className
 *           {
 *              ① 변수 => 멤버변수, 전역변수(여러개)
 *              ② 생성자 => 생략이 가능 ==> 컴파일러가 자동으로 생성자 생성 (여러개)
 *              ③ 메소드 ==> 여러개
 *           }
 *            ==> Component (한개의 기능) ==> 조립 (Container : Spring)
 *            
 *    <변수에 접근하는 방법>
 *    1. (. : 주소접근 연산자)을 사용한다 
 *           => 주소를 이용한 변수 (참조변수)
 *        hong.학번
 *        hong.이름
 *        
 *   { Student hong = new Student();
 *     Student lee = hong;
 *     hong.학번 =10;
 *     hong.이름 = "홍길동";
 *     lee.학번 =20;
 *     lee.이름 ="이순신";
 *     // 이럴 경우 hong의 이름은 이순신이다!
 *     ^^^
 *     new 연산자를 사용하여 선언을 할 경우 새로운 메모리 공간이 생기지만
 *     new 연산자를 사용하지 않을경우 "Call By Reference"로 같은 주소를 제어한다
 *   }
 *   
 *   
 *   객체 배열
 *    클래스명[] 배열명 = new 클래스명[수]
 */
/*
 *    주의점
 *      한개의 파일 (java) => class를 여러개 사용이 가능
 *      ** 1. 자바는 항상 => 클래스명과 저장명이 동일
 *      class A => A.java
 *      여러개가 있는 경우
 *      --------------
 *      class A
 *      class B
 *      ----------------> A.java, B.java
 *      class A
 *      public class B 
 *      ----------------> B.java
 *      ** 2. 한파일안에서 public class는 한번만 사용가능하다!!!!
 *      ** 3. 가급적이면 한파일에 class 한개씩 사용을 권장!!!!!!!!
 *      ** 4. 주의점 : Student => 다른파일에서는 Student를 사용할 수 없다 (같은 폴더 상에서)
 */
class Student
{
	String name;
	int kor, eng, math;
}
public class 객체배열_1 {
	public static void main(String[] args)
	{
		Student hong = new Student(); //hong(주소) ==> name, kor, eng,math
		Student lee = new Student();  //lee(주소) ==> name, kor, eng,math
		Student park = new Student(); //park(주소) ==> name, kor, eng,math 
		// ==> 객체 생성시마다 메모리 따로 만들어지는 변수(인스턴스)
		// 1. 변수에 값 대입
		hong.name ="홍길동";
		hong.kor =90;
		hong.eng=80;
		hong.math=70;
		
		lee.name="이순신";
		lee.kor=80;
		lee.eng=90;
		lee.math=80;
		
		park.name ="박문수";
		park.kor=88;
		park.eng=90;
		park.math=78;
		
		// 출력 / 제어 => 객체 배열
		Student[] std = {hong,lee,park};
		for(int i =0; i<std.length;i++)
		{
			System.out.println(std[i].name+" "
		                     +std[i].kor+" " 
					           +std[i].eng+" "
		                     +std[i].math+" "
		                     +(std[i].kor+std[i].eng+std[i].math)+" "
		                     +(std[i].kor+std[i].eng+std[i].math)/3.0);
		}
		
	}
}












































