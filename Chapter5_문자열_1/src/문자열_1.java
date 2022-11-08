/*
 *    문자열 관련 데이터형 (자바) ==> "" , char ''
 *    ---------------
 *    String 
 *    ------ 문자열을 저장하는 기능, 문자열 제어하는 기능(라이브러리)
 *     1) 저장방법
 *      *** String s =""; => 가장 많이 사용되는 방법 (기본형처럼 사용) => 웹에 90%(모든 데이터가 문자열)
 *          String s = new String("");
 *     2) String 기능 (메소드)
 *     ---------------
 *        1. 문자 변환
 *           1) toUpperCase : 대문자 변환
 *           2) toLowerCase : 소문자 변환
 *       *** 3) valueOf : 모든 데이터형을 문자열로 변경
 *                       int a =10;
 *                       valueOf(a) ==>"10" ==> parseInt("10") ==>10
 *                       boolean b= true
 *                       valuseOf(b) ==> "true" ==> parseBoolean("true") ==> true
 *          
 *        2. 문자 제어
 *           **100001) substring() ==> 문자열 자를때 사용 (화면 UI)
 *        3. 문자 변경
 *        ***** 1) trim() => 좌우 공백 제거(입력) 
 *        ***** 2) replace() => 글자 변경 ==> 오라클 (크롤링)==> 이미지
 *           3) replaceAll() ==> 정규식 (문자 형식)
 *              ip
 *              replaceAll("[0-9]{1,3}\\[0-9]{1,3}\\[0-9]{1,3}\\[0-9]{1,3}\\")
 *              			127.1.63.200
 *              			맛있는 맛있고 맛있게...
 *                          ---------------- 맛있+ ==> 분석 (빅데이터,AI)
 *           4) splite() : 문자열을 배열로 변경
 *              String s ="red, blue, green";
 *              String[] arr=s.split(",") ==> {"red","blue","green"}
 *        4. 문자 비교
 *        *****  1) equals() : 대소문자 구분후 비교 (로그인, 아이디중복체크, 아이디찾기..., 상세보기)
 *        ****   2) contains() : 포함 (검색)
 *           3) startsWith  : 서제스트(시작단어)
 *           4) endsWith : 끝나는 단어
 *              ----------------------------
 *        5. 문자 찾기
 *          ****** 1) indexOf : 앞에부터 데이터 찾기
 *                        String s ="Hello Java"
 *                        s.indexOf("a")
 *           2) lastIndexOf : 뒤에서 데이터 찾기 
 *           
 *        6. 기타
 *            concat ("a","b") ==> ab ==> +기호로 문자열 결합을 할수있어 굳이 concat은 사용하지 않음
 *           ***** charAt() ==> 문자 한개를 가지고 올때
 *            toCharArray ==> 문자열을 char[]변경
 *            ----------------------------------- 기능 / 용도 / 사용처
 */
public class 문자열_1 {
	public static void main(String[] args)
	{
	// 1. 변수(문자열) 선언
	//String s ="Hello Java!";
		String msg;
	/*  ------ 클래스형 변수
	 *   stack (주소 : s) /  heap (실제 데이터 : "Hello Java!")
	 */
	// char[] ====>
	/*
	 *      "Hello Java" (lenght : 10 -> 공백도 포함)
	 *       0123456789
	 *      
	 *       charAt(0) ==>'H'
	 */
		// 2. 초기화
		 msg ="Hello Java"; // 입력값 , 파일 읽기 ...
		// 3. 활용(요청처리)
		//    1) 문자의 갯수 확인 (length()) ==>
		 System.out.println(msg.length()); //공백도 문자로 취급!!
		 //   2) 공백을 제거
		 System.out.println(msg.trim().length()); //입력값을 사용자가 등록 (실수 => space)
		 // 좌우에 있는 공백만!! 제거가 가능
		 //   3) 대문자로 변환
		 System.out.println(msg.toUpperCase()); // 검색
		 //   4) 소문자로 변환
		 System.out.println(msg.toLowerCase()); // 검색
		// ==> 한글 검색 (자음 -> 찾기) => 메소드
		 //   5) 자르기  subString()
		 /*
		  *     subString(int start) => 지정된 위치부터 (문자가 아닌 숫자로)
		  *     substring(int start, int end) => 어디서부터 어디까지
		  */
		  System.out.println(msg.substring(6));
		  System.out.println(msg.substring(0, 5)); // end는 제외!! (하나가 더 많다)
		  String post="101-123";
		  System.out.println(post.substring(0, 3));
		  System.out.println(post.substring(4));
		  
		  String fileName = "문자열_1.java";
		  System.out.println(fileName.substring(6));
		  // indexOf 
		  // 파일명 ==> 문자열.1.java
		  System.out.println(fileName.substring(fileName.lastIndexOf("."))); // 
		  System.out.println(msg.indexOf("o")); // 위치값
		  System.out.println(msg.lastIndexOf("o"));
		  System.out.println(msg.indexOf("a"));
		  System.out.println(msg.lastIndexOf("a"));
		  // 4. 출력
		  /*   <메소드 만들기>
		   *    1. 메소드명 (기능)
		   *       lastIndexOf()
		   *       indexOf()
		   *    2. 매개변수
		   *    3. 리턴형
		   *   // 결과값이 없으면 void!!
		   */
	}
}












