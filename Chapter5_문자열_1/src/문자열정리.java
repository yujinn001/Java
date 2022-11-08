/*
 * 1.
	  1)  startsWith  : 문자열이 지정한 문자로 시작하는지 판단 같으면 true반환 아니면 false를 반환한다.(대소문자구별)
	 	    원형 
	 	        boolean startsWith(String fs)
	 	        메소드는 사용자가 요청값 ==> 요청처리 결과값
	 	        
	  2) endsWith : 문자열 마지막에 지정한 문자가 있는지를 판단후 있으면 true, 없으면 false를 반환한다.(대소문자구별)
	         boolean endsWith(String s)
	         
	*****  3) equals : 두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.(대소비교)
   			boolean equals(String fs) ==> 대소문자를 구분해서 비교
   			
   2. 
   *****  1) indexOf : 지정한 문자가 문자열에 몇번째에 있는지를 반환한다.
         int indexOf(char c) ==> indexOf('.')
         int indexOf(String s) ==> indexOf("java")

  *****2) laseIndexOf : 문자열에 지정한 문자가 마지막 몇번째에 있는 int를 반환한다.
 		 int laseIndexOf(char c) ==> indexOf('.')
         int laseIndexOf(String s) ==> indexOf("java")	

*****	 3) length : 문자열의 길이를 반환한다.
		 int length()
		 
 	3.
 	  1) replace : 문자열에 지정한 문자" "가 있으면 새로 지정한 문자" "로 바꿔서 출력한다.
			String replace(char o, char n)
			String replace(String s1, String s2)
			
      2) replaceAll : 정규표현식을 지정한 문자로 바꿔서 출력한다.
			String[] replaceAll(String  s, String s1)
			
      3) split : 지정한 문자로 문자열을 나눌수 있다.(배열로 반환)
		    String[] split(String s)
		    
    4.
******    1) substring: 문자열에 지정한 범위에 속하는 문자열을 반환한다.(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지않는다.)
		   String substring(int s)
		   String substring(iny s, int e) ==> e-1(마지막은 제외)

	  2)  toLowerCase : 문자열에 대문자를 소문자로 변환한다.


	 3) toUpperCase : 문자열에 소문자를 대문자로 변환한다.
	    String toUpperCase()
	    
   5.
******     1) trim  : 문자열에 공백을 없에준다.
		String trim()
		
     2) toString: 지정한 개체의 원시 값을 반환
        String toString()
******     3) contains: 두개의 String을 비교해서 비교대상 String을 포함하고 있으면true, 다르면 false를 반환한다.
         String contains(String s)

    4) charAt: 지정한 index번째에 문자를 반환한다.
	   char charAt(int i)
	   
	   
******	   valueOf() : 모든 데이터형을 문자열로 변환 (웹, 네트워크, 윈도우)
        
        String / Integer / ArrayList
        ---------------------------- Connection, Statement, ResultSet
 
    
 */
public class 문자열정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
