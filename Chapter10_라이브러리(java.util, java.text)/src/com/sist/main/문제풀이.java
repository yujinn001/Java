package com.sist.main;
/*
 	1. 
		Calendar cal=(Calendar.getInstance());
		// 추상 클래스
   			1. 미완성 클래스 (자신이 메모리 할당을 할 수 없다) ==> new를 이용하지 못한다
   			2. 구현이 안된 메소드를 가지고 있다 (추상메소드)
   			3. 구성요소
   			   public abstract class ClassName
   			   {
   			    ------------------------------
   			     멤버변수 (인스턴스)
   			    ------------------------------
   			     생성자 => 초기화 역할
   			    ------------------------------
   			     구현된 메소드
   			    ------------------------------
   			     구현이 안된 메소드
   			    ------------------------------
   			   }
   			4. 여러개의 클래스를 묶어서 한개의 객체명으로 연결해서 사용할 목적
   			5. 단일 상속만 가능하다 (extends)
   			// 추상 클래스 확장 => 인터페이스
   			   1) 미완성된 클래스
   			   2) 메모리 할당할 수 없다
   			   3) 다중 상속이 가능(implements)
   			   4) 형식
   			      public interface interfaceName
   			      {
   			           *** 변수, 모든 메소드는 public
   			           ------------------------------
   			             변수 => 상수형 변수 (반드시 값을 대입)
   			             (public static final)int a =10;
   			                    
   			           ------------------------------
   			             구현이 안된 메소드
   			             (public abstract)void display();
   			           ------------------------------
   			             구현이 된 메소드 (default)
   			              (public) default void display(){}
   			           ------------------------------
   			             구현이 된 메소드 (static)
   			              (public) static void display(){}
   			           ------------------------------
   			      }
   			      ** 추상클래스 / 인터페이스 ==> 오버라이딩 프로그램
   			                              --------
   			                              1) 메소드명 동일
   			                              2) 매개변수 동일
   			                              3) 리턴형 동일
   			                              4) 접근지정어 확대 가능 / 축소 불가능!!!!
   			                              5) -------- 접근지정어는 반드시 public으로 구현한다!!!
   			     Calendar에서 주로 사용 ==> 상수
   			     = final int a =10;         // 상수형 변수
   			     = static final int b =100;  // 상수
   			     Calendar.YEAR, Calendar.MONTH, Calendar.DATE, Calendar.DAY_OF_WEEK
   			     => 값을 읽을때 get(int)
   			        값을 설정할 떄 set (int(상수변수), int)
   			     => 웹에서 사용 -> 달력, 입력일, 생일
   			 
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month); 
		cal.set(Calendar.DATE, 1);
		int week=cal.get(Calendar.DAY_OF_WEEK);
	    int lastday=(cal.getActualMaxium(Calendar.DATE); // 이 날짜에 해당되는 막날
		

}

	==> 중요!!!
	    - 가독성 : 분리(기능별) => 구조화된 프로그램 (단락을 나눠서 처리) => 메소드
	             유지보수 (수정, 추가)
	             =============> 리펙토링	             
	    - 최적화 : 속도(실행)
	             브라우저 => 쓰레드 2개 (이미지, 텍스트) => +, StringBuffer => 오라클 (index)
	    - 결합성(의존성) : 클래스 수정시 => 다른 클래스에 영향
	                   ----------   ------------- 결합성이 낮은 프로그램
	                    new => 결합성이 높은 프로그램(권장)
	                    A    B
	                    => B b = new B();
	                     b.display();
	                    
	                    => A클래스는 B 클래스에 의존
	                    =>-------------------- 
	                       스프링 소프트웨어 ==> 요청 ==> 제어가 역전 ==> IoC
	                       OOP
	    - 응집성 : 메소드는 한개의 기능만 수행하게 만든다 (재사용성, 오류처리) 
	    - 재사용성 : 상속, 포함
	    
	2. 객체 얻기
	    1) getClass()
	    2) Class
	    3) Class.forName()
	    4) new
		class Human
		{
			public void display()
			{
				System.out.println("Human:display() Call...");
			}
		}
		public class MainClass1 {
		
			public static void main(String[] args) throws Exception{
				// TODO Auto-generated method stub
		        	// 463page 
				Human h1=new Human(); // 기본 메모리 할당 => 결합성이 높은 프로그램
		        	h1.display(); //new를 사용하지 말라 (권장)
		        
		        ///// 웹 
		        Human h2=new Human().(  getClass  ).
		        		 getDeclaredConstructor().newInstance();
		        h2.display();
		        
		        Human h3=Human.(  class  ).getDeclaredConstructor().newInstance();
		        
		        h3.display();
		        
		        Human h4=(Human)Class.(                  ).
		        		   getDeclaredConstructor().newInstance();
		        h4.display();
			}
		
		}
	3.
		import java.util.*;
		public class MainClass2 {
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		        String[] data={
		        		"Java & Oracle",
		        		"Java와 JSP",
		        		"Java와 Spring",
		        		"Basic Spring",
		        		"Basic Java",
		        		"Basic Oracle",
		        		"Ajax , JQuery"};
		       Scanner scan=new Scanner(System.in);
		       System.out.print("검색어 입력:");
		       String ss=scan.next();
		       
		       System.out.println("===== 시작문자열이 같은지 여부 확인 =====");
		       for(String s:data)
		       {
		    	   
		    	   if(s.( startsWith)(ss))
		    	   {
		    		   try
		    		   {
		    			   Thread.sleep(1000);
		    		   }catch(Exception ex){}
		    		   System.out.println(s);
		    	   }
		       }
		       System.out.println("=====끝나는 문자열이 같은지 여부 확인======");
		       for(String s:data)
		       {
		    		   if(s.( endsWith)(ss))
		    	   {
		    		   try
		    		   {
		    			   Thread.sleep(1000);
		    		   }catch(Exception ex){}
		    		   System.out.println(s);
		    	   }
		       }
		       System.out.println("=====포함된 문자열인지 여부 확인======");
		       // 영화 찾기 , 게시물 ==> Like '%Java%' ==> 추천 (블로그,카페)
		       for(String s:data)
		       {
		    	 
		    	   if(s.( contains )(ss))
		    	   {
		    		   try
		    		   {
		    			   Thread.sleep(1000);
		    		   }catch(Exception ex){}
		    		   System.out.println(s);
		    	   }
		       }
		        
			}
		
		}


		4.
		public class MainClass3 {
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		        String data="red,green,blue,black,yellow,pink,magenta";
		 
		       String[] colors=data.(spilt(“,”));
		        System.out.println("갯수:"+colors.length);
		        for(String c:colors)
		        {
		        	System.out.println(c);
		
		           }
			}
		
		}
		= spilt 배열
		  단어를 자를 땐 substring

		import java.util.*;
		public class MainClass4 {
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		        //Date date=new Date();
		        //System.out.println(date);// 오라클과 연동 
				Calendar cal=( Calendat.getInstanse());// 추상클래스
				System.out.println("년도:"+cal.get(Calendar.YEAR));
				System.out.println("월:"+(cal.get(Calendar.MONTH)+1));
				// Month => 0~11 +1
				// out.println()
				System.out.println("일:"+cal.get(Calendar.DATE));
				// 요일 
				String[] week={"","일","월","화","수","목","금","토"};
				// week => 1~7
				int w=cal.get(Calendar.DAY_OF_WEEK);
				System.out.println(week[w]);
				// 달의 마지막날 
				int lastday=(cal. getActualMaxium (Calendar.DATE)
				System.out.println(lastday);
				// 오라클 
			}
		
		}


		import java.util.StringTokenizer;
		
		public class MainClass5 {
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		        String colors="red,blue,black,yellow,pink";
		           StringTokenizer st=(new StringTokenizer(colors, “,”)) ; 
		//구분문자 
		        System.out.println(  st.countTokens()      );// 단어 갯수
		        while(st,hasMoreTokens() ) // 
		        {
		        	System.out.println(st.nextToken()); // 단어를 읽어 온다 
		        }
		        
		
			}
		
		}
 */
public class 문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
