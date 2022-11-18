package com.sist.string;
/*
 *    String 클래스 (웹 => 데이터형이 문자열만 존재한다)
 *    1. 문자열을 저장하는 데이터형 / 클래스형
 *    
 *    2. Object로부터 상속을 받은 클래스
 *    
 *    3. String 클래스는 final클래스 ==> 변경이 불가능한 클래스 (있는 그대로 라이브러리를 사용해야 된다) => 오버라이딩이 불가능
 *                     ----------  확장을 할 수 없는 클래스 (종단 클래스)
 *                     Math, StringBuffer, StringBuilder, System, Wrapper => 종단
 *   
 *    4. 사용법
 *       String 변수명 =""; ""자체가 주소에 해당된다 ==> char[] 변수명 ={'','',''};
 *       "Hello""Hello"
 *       -------------- 같은 주소를 가지고 있다 (같은 문자열은 같은 주소를 가지고 있다)
 *       새로운 공간에 저장 => new String("")
 *       예)
 *          String s1 ="Hello";
 *          String s2 ="Hello";
 *          ---------------------- s1==s2
 *          String s3 = new String("HEllo");
 *          ---------------------------------- 다른 주소에 저장
 *    
 *    5. 주요 메소드 (자바스크립트와 동일)
 *   *** 1) public char charAt(int index) : 문자열에서 원하는 위치에 문자 한개 추출
 *                 ----       ------------
 *          *** 자바에서 사용하는 모든 문자열은 인덱스 번호가 0부터 시작한다
 *          String s ="0123456789";
 *          s.charAt(3)==>'3';
 *          String s ="ABCDEFG";
 *                     0123456
 *          s.charAt(5) ==> 'F';
 *   *** 2) length() : 문자 갯수를 가지고 온다
 *          public int length()
 *          String s = "HEllo"; ==> s.length() => 5 ==> 한글도 동일하다
 *          String s = "안녕하세요"; ==> s.length() ==>5
 *          ==> 사용처 : 화면 UI (글자수를 동일하게 만드는 경우에 주로 사용) => HTML(유연성) => CSS
 *       3) toUpperCase()
 *          public String toUpperCase(): 대문자 변환 => 컬럼명 / 테이블명
 *                                                   ----- 멤버변수
 *                                                   ----- 클래스 (ROW) 
 *       4) toLowerCase()
 *          public String toLowerCase(): 소문자 변환      
 *       ----------------------------------------------------------------
 *       검색 (웹 => 사용자 요청 (검색))
 *         1) startsWith : 시작 문자열이 같은 경우
 *            public boolean startWith(String prefix) => 접두어
 *         2) endsWith : 끝나는 문자열이 같은 경우
 *            public boolean endsWith(String suffix) => 접두어
 *    ***  3) contains : 문자열안에 포함된 문자열
 *            public boolean contains(String str) : 실제 검색
 *         4) equals : 문자열이 같은 경우 (대소문자 구분)
 *            public boolean equals(String s) :로그인 처리, 아이디 중복체크....
 *    ***  5) equalsIgnoreCase : 문자열이 같은 경우 (대소문자 구분 없이)         
 *            public boolean equalsIgnoreCase(String s)                     
 *        ===> 웹 : 회원가입, 로그인, 게시판, 검색기...
 *        *** 사이트 : 회원가입, 게시판, 공지사항, 로그인, 검색기
 *                   ------------------------------------ 필수
 *         -------------------------------------------------------------
 *         변경 (문자열 변경, 추가, 제거)
 *          1) concat ==> + 문자열 결합 (MySQL에서 concat)
 *             public String concat(String s)
 *          2) trim() ==> 좌우 공백을 제거
 *             public String trim(); ==> 사용자의 실수 방지(space) ==> 유효성 검사
 *          3) replace() ==> 문자, 문자열 변경 ==> 오버로딩
 *             public String replace(char c1, char c2)
 *             public String replace(String s1, String s2)
 *          4) replaceAll() : 정규식 (정규식 : 문자열의 패턴)
 *                            [가-힣], [A-Za-z], [0-9]
 *             public String replaceAll(String pattern, String s(변경 문자열))
 *         *** 데이터분석, AI ==> 정규식, 크롤링
 *          5) substring() : 문자 자르기
 *             오버로딩
 *             public String substring(int startIndex)
 *             public String substring(int startIndex, int endIndex)
 *             예)
 *                String s ="Hello Java!";
 *                           012345678910
 *                s.substring(6) ==> "Java!"
 *                s.substring(0,5) ==>"Hello"
 *                             --- endIndex-1
 *        ---------------------------------------------------------------------
 *          문자의 위치
 *      *** 1) indexOf : 앞에서부터 찾기
 *             오버로딩 
 *             public int indexOf(char c)
 *             public int indexOf(String s)
 *      *** 2) lastIndexOf : 뒤에서부터 찾기
 *             public int lastIndexOf(char c)
 *      *** 3) 모든 데이터형을 문자열 변환 : valueOf() ==> 유일하게 static, 오버로딩
 *             public String value(int a)
 *             
 *             
 */
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// charAt : public char charAt(int index) : 지정된 위치의 문자를 읽어올 때 사용
		//String s ="Hello Java";
		//         0123456789
		//char c = s.charAt(4);
		//System.out.println("c: " +c);
		
		//length() : public int length() => 문자의 갯수를 읽어온다
		//length() ==> 화면UI때 글자수 확인, 비밀번호 검사
		//String e ="ABC";
		//String h ="홍길동";
		//System.out.println("e의 글자 수 : "+e.length());
		//System.out.println("h의 글자 수 : "+h.length());
		//String s ="Hello Java";
		//System.out.println("대문자 변환 : "+s.toUpperCase());
		//System.out.println("소문자 변환 : "+s.toLowerCase());
		// 문자열에 저장된 데이터는 변경이 안된다.
	
		
		
	}

}
