/*   ^^
 *   클래스의 구성요소
 *     1. 변수
 *         기본형, 배열
 *     2. 메소드
 *         기능 => 연산자 / 제어문
 *        메소드 
 *          1) 재사용성 (필요할 때마다 언제든지 사용할 수 있도록!) => System.out.println()
 *                                                         scan.nextIn()
 *                                                         Math.random()
 *          2) 중복 코드 제거
 *          3) 구조화된 프로그램
 *          4) 다른 클래스와 통신  
 */
/*
 *   	메소드
 *        구성요소
 *        처리 결과값(리턴값)   사용자 요청값(매개변수)
 *        예) 정수 두개를 보내주고 ==> 더한 값을 달라
 *          ---------- 매개변수     ------- 리턴값
 *          id, pwd ===> 로그인 여부 확인 요청 ===> boolean
 *      메소드 제작 
 *      --------
 *      ----------------------------------
 *        결과값(리턴형)             매개변수 
 *      ----------------------------------
 *             O                    O  ==========> String substring(int s) //문자 번호를 주고 자르기
 *      ----------------------------------
 *             O                    X  ==========> String trim()
 *      ----------------------------------
 *             X                    O  ==========> System.out.println("A")
 *                                                 void println(String a)
 *      ----------------------------------
 *             X                    X  ==========> System.out.println();
 *      ----------------------------------
 *      호출 
 *      
 *      기존에 있는 프로그램을 기능별로 나눠서 작업 (분업화)
 *      ** 특징) 메소드는 반드시 한개의 기능만 수행할 수 있다. (재사용이 편하다)
 *         입력 기능
 *         처리 기능 ==> 세분화
 *         출력 기능
 *         
 *      메소드
 *        = 선언부 (원형)
 *          리턴형(결과값) 메소드명(매개변수)
 *        = 구현부 
 *         리턴형(결과값) 메소드명(매개변수)
 *         {
 *             // 구현
 *         }
 *        = 더하기 기능
 * 			int add(int a, int b)
 *          ---  long, double ===> 권장 가급적이면 동일 
 *           {
 *               //맨 마지막줄에
 *               return a+b; // 메소드 종료 시점
 *           }         
 *           
 *           void 
 *           ---- 메소드 자체 처리 (데이터베이스 ==> insert, update, delete)
 *           {
 *               return; //  void는 결과 값이 없어서 생략도 가능!!!!
 *           }
 *          
 *         1.  구성요소
 *             1) 매개변수 => 사용자가 요청한 값
 *                            = 로그인 요청(id, pwd)
 *                            = 아이디 중복 체크 (id)
 *                            *** 여러개 => ,로 구분
 *                                ----- 3개 이상(배열, 클래스를 이용해서 전송)
 *                                예) 정렬 => 배열
 *                                    회원가입 (클래스)
 *             2) 메소드명 => 변수(식별자)
 *                          ① 알파벳, 한글 (알파벳 => 대소문자 구분)
 *                          ② 숫자 (앞에 사용 금지)
 *                          ③ 특수문자(_, $)
 *                          ④ 키워드는 사용 금지
 *                          약속 사항 => 소문자로 시작한다
 *                                     단어가 2개 이상인 경우
 *                                     getFileName , get_file_name //_,아니면 대문자 시작
 *                                     nextInt();  --> 헝거리식 표기법               
 *                
 *             3) 리턴형(결과값) => 사용자가 요청을 처리한 결과값 
 *                               메소드 
 *                                  => 자체 처리 (구구단 출력)
 *                                  => 결과값을 넘겨준다 => 로그인 여부 확인 => 해당 데이터형을 설정
 *                                     ----- 반드시 1개만 설정이 가능!!
 *                                           ---------------------- 여러개 (배열, 클래스)
               4) 매개변수
                  ------ ① 사용자가 입력 (명시적인 초기화, Scanner,random())
                  ------ ② 반복 제어 => 틀린문장
                         ③ 웹 => 검색, 입력, 버튼 클릭, 메뉴 클릭, 페이지 요청
                         
 */
// ==> 년도, 월, 일을 입력
import java.util.Scanner;
public class 메소드_1 {
	/*
	 *   int userInput()
	 *   {
	 *   }
	 *   =========================> 메소드_1 a = new 메소드_1();
	 *                              a.userInput()
	 *   static int userInput() 
	 *   {
	 *   }
	 *   ==> static은 자동 메모리 할당!
	 */
    static int  userInput(String msg)
    {
    	Scanner sc= new Scanner(System.in);
		System.out.print(msg);
		int value = sc.nextInt();
		
		return value;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year =userInput("년도 입력");
		int month =userInput("월 입력");
		int day =userInput("일 입력");
		
//		Scanner sc= new Scanner(System.in);
//		System.out.print("년도 입력 :");
//		int year = sc.nextInt();
//		
//		System.out.print("월 입력 :");
//		int month = sc.nextInt();
//		
//		System.out.print("일 입력 :");
//		int day = sc.nextInt();
//		
//		System.out.println(year + "년도 "+month+"월 "+day +"일" );
	}

}



















