/*  ^^^
 *   자바에서 사용하는 변수의 종류
 *   --------------------
 *   1. 지역변수 : "메소드"안에서 선언 => 사용   !! 지역변수는 반드시 초기화해야 한다!!
 *   public static void main(String[] args)
 *   {
 *      int a =10; // 이 지역변수는 다른데에서 쓸 수 없고 main문안에서만 사용가능
 *   }
 *   
 *   2. 매개변수 : "메소드"에서 사용자 요청값을 받을 때 사용되는 변수
 *   public void display(int a, int b) => display메소드 안에서만 사용이 가능
 *   
 *   3. 전역변수 (멤버변수)
 *      = 공유/클래스 변수
 *      = 인스턴스 변수
 *      
 *   - 멤버변수 (인스턴스 변수, 공유변수) : 프로그램 종료시까지 메모리 유지
 *       => 다른 클래스나, 자신의 클래스 전체에서 사용
 *       
 *   - 지역변수 (지역변수, 매개변수)
 *       => 메소드 안에서만 사용이 가능 (한번 사용후 버린다)
 *       => 제어문(반복문)
 *  
 *  
 *      ----method area(static)----
 *      |  method, static          | static 변수는 한개만 생성이 가능 => 공유변수
 *      ---------------------------
 *      | 매개변수, 지역 변수         (stack)
 *      ---------------------------
 *      | 인스턴스 변수              (Heap)
 */
/*
 *     변수의 종류 
 *     --------
 *       class ClassName
 *       {
 *          ------------------------
 *          멤버변수 (전역변수)
 *            = 인스턴스 변수
 *            = 클래스 변수, 공유 변수
 *          ------------------------
 *          void 메소드(--------매개변수)
 *          { 
 *            ------------------------
 *            지역변수
 *            ------------------------
 *          }         
 *       }
 *       ---------------------------------------------------------
 *          종류          선언위치                       생성시기
 *       ---------------------------------------------------------
 *        인스턴스 변수     클래스 블럭        
 *                      class ClassName
 *                     {
 *                       ------
 *                     }
 *                     
 *                     => 클래스 영역안에
 *                                             인스턴스를 생성
 *                                             클래스 변수 = new 클래스();
 *                                                       ---- 반드시 new 사용시에 생성이 된다
 *                                                        *** 따로 메모리가 생긴다
 *                                                        
 *                                             설정) 
 *                                             class ClassName
 *                                             {
 *                                                데이터형 변수명;
 *                                                데이터형 변수명;
 *                                                ...
 *                                                예) 
 *                                                   int score;
 *                                                   String name;
 *                                                   String sex;
 *                                             }
 *       ---------------------------------------------------------
 *        클래스 변수       클래스 블럭
 *                       class ClassName
 *                      {
 *                      }
 *                      
 *                      => 클래스 영역안에
 *                                             컴파일 될 때 자동으로 생성되는 변수
 *                                             *** 한개만 생성되기 때문에 모든 객체 공유하는 변수
 *                                             
 *                                             형식)
 *                                             class ClassName
 *                                             {
 *                                               	static int a;
 *                                                  static int b;
 *                                                  static String c,d,e;
 *                                             }
 *                           1) 인스턴스 변수
 *                           2) 클래스 변수
 *                           ------------- 기본 디폴트 초기화
 *                            int    => 0
 *                            long   => 0L
 *                            float  => 0.0F
 *                            double => 0.0
 *                            boolean => false   
 *                            클래스    => null (주소가 없는 상태) : String name; ==> null 
 *                            ------------------------------
 *                             => 클래스 변수 : 한번에 모든 객체의 데이터 변경 (공통변수)
 *                             => 사용법
 *                                 1) 인스턴스 변수
 *                                    객체명.변수  
 *                                      Scanner scan = new Scanner (System.in);
 *                                      scan.nextInt();
 *                                    --------
 *                                 2) 클래스 변수
 *                                    객체명.변수
 *                                    클래스명.변수 : Math.random()
 *       ---------------------------------------------------------
 *        매개 변수       메소드 괄호안에 선언된 변수
 *                     메소드명 (----매개변수---)
 *                                             메소드 호출후에 데이터를 전송했을 경우에 생성되는 변수
 *                                             *** 사용자의 요청값을 받는 경우
 *                                             void display(int a)
 *                                             {
 *                                             }
 *                                            
 *                                             ==> diaplay(10)
 *                                             *** 호출후에 자동으로 메모리 해제
 *                                             *** Stack 영역에 저장 (메모리 자체에 관리)
 *       ---------------------------------------------------------
 *        지역 변수      => 메소드 블럭안에 선언되는 변수 
 *                    메소드명()
 *                   {
 *                     ------------
 *                   }
 *                                              메소드 호출시마다 생성되는 변수
 *                                              display()
 *                                              {
 *                                                 int a =0;
 *                                              }
 *                                              *** 루프변수(반복문)
 *                                              *** 반드시 초기화를 해야 된다
 *        변수 ==> 기본형, 배열, 클래스
 *                ----------------- 변수
 *                기본형 : 한개의 데이터만 저장이 가능
 *                배열 : (관련된 데이터) 같은 데이터형을 모아서 저장
 *                클래스 : (관련된 데이터) 다른 데이터형을 모아서 저장
 *                
 *       ---------------------------------------------------------
 *    같은 학교에 대한 클래스 설계
 *      class Student
 *      {
 *      	int hakbun;
 *      	String name;
 *      	String subject;
 *      	static String schoolName; // 메모리에 저장된 상태
 *      }
 *      
 *      Student s1 = new Student(); // hakbun, name, subject ==> 메모리에저장 (12byte)
 *      s1.hakbun
 *      s1.name
 *      s1,subject
 *      -------------------->
 *      <클래스 변수>
 *      s1.schoolName
 *      Student.schoolName ===> 메소드, 변수 ==> 클래스명으로 접근하면 (static): Math
 *      -------------------
 *      
 *      String s ="Hello Java";
 *      s.substring()
 *      s.trim()
 *      s.length()
 *      String.valueOf() // static 메소드
 *            
 */
class Card
{
	int number;
	String image;
	static int width;
	static int height;
}
public class 변수종류_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card1=new Card(); // 저장공간이 다르다 (인스턴스 변수)
		card1.number=2;
		card1.image="♠";
		card1.width=100;
		card1.height=180;
		
		Card card2=new Card();
		card2.number=5;
		card2.image="♣";
		card2.width=100;
		card2.height=180;
		
		Card card3=new Card();
		card3.number=7;
		card3.image="♥";
		card3.width=100;
		card3.height=180;
		
		Card card4=new Card(); // 저장공간이 다르다 (인스턴스 변수) 사용법 : 객체명.변수명
		card4.number=9;
		card4.image="◆";
		card4.width=100;
		card4.height=180;
		
		// 출력
		System.out.println(card1.number);
		System.out.println(card1.image);
		System.out.println(card1.width);
		System.out.println(card1.height);
		
		System.out.println(card2.number);
		System.out.println(card2.image);
		System.out.println(card2.width);
		System.out.println(card2.height);
		
		System.out.println(card3.number);
		System.out.println(card3.image);
		System.out.println(card3.width);
		System.out.println(card3.height);
		
		System.out.println(card4.number);
		System.out.println(card4.image);
		System.out.println(card4.width);
		System.out.println(card4.height);
		
		System.out.println("================");
		card1.width=300;
		card1.height =350;
		
		Card.width=450;
		Card.height =500;
		System.out.println("================");
		System.out.println(card2.width);
		System.out.println(card2.height);
		

		System.out.println("================");
		System.out.println(card3.width);
		System.out.println(card3.height);
		
		System.out.println("================");
		System.out.println(card4.width);
		System.out.println(card4.height);
		
		// static ==> 메모리 공간이 동일 => 공유 메모리
		/*
		 *   인스턴스 변수는 객체가 생성될 때 객체마다 각기 다른 메모리를 생성하기 때문에 다른 값을 유지
		 *   클래스 변수는 저장공간이 1개만 생성되기 때문에 항상 같은 값을 유지한다
		 */
	}

}















































