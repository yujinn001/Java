package com.sist.string;
// concat, replace, replaceAll, substring, split, valueOf
// indexOf, lastIndexOf
public class 라이브러리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//concat => 문자열 결합(+)
		// 원형 : public String concat(String s)
//		String s1 ="Hello";
//		String s2 ="java!";
//		String s12=s1.concat(s2);
//		System.out.println(s12);
		
		//replace =>단어/문자열 변경
//		String s ="Hello Java";
//		String s1 =s.replace('a', 'b');
//		String s2 = s.replace("java", "Oracle");
//		System.out.println(s1);
//		System.out.println(s2);
//		String ss = "a.jpg&b.jpg&c.jpg"; // 오라클 (& => Scanner)
//		String ss1 =ss.replace("&", "^");
//		System.out.println(ss1);
		// replacaAll ==> 정규식
		// 원형 : public String replaceAll(String p, String s)
		
		String s= "안녕하세요 Hello 12345";
		System.out.println("한글만 출력 : "+s.replaceAll("[^가-힣]", ""));
		// ^ => 제외하고 [가-힣] => 한글 전체
		System.out.println("영어만 출력 ㅣ "+s.replaceAll("[^A-Za-z]", ""));
		
		String ss="HEllo Java";
		String ss1=ss.substring(6);
		System.out.println(ss1);
		String ss2 =ss.substring(0, 5);		
		System.out.println(ss2);
		// 원형 : public String substring(int s) : s부터 나머지 전체를 가져온다
		// 	 	 public String substring(int s, int s) : s부터 s-1까지 
		
		String sss ="red,green,black,white,pink";
		String[] color =sss.split(",");
		for(String c:color)
		{
			System.out.println(c);
		}
		// 원형 : String[] split(String regex) ==> 정규식 ==> \\(|)
		
		// => 해당 문자의 위치값 indexOf, lastIndexOf
		String temp="Hello Java";
		int index =temp.indexOf("a");
		System.out.println(index);
		index =temp.lastIndexOf("a");
		System.out.println(index);
		
		// => subString
		String temp2="dsadsadsadasd.png";
		String k =temp2.substring(temp.lastIndexOf(".")+1);
		System.out.println(k);
		
		String temp3 = "Hello Java";
		System.out.println(temp3.length());
		String m=temp3.trim();
		System.out.println(m.length());
		// 원형 : public String trim()
		// valueOf() : 문자열 변롼
		int a =10;
		int b =20;
		String p1=String.valueOf(a);
		String p2 =String.valueOf(b);
		System.out.println(p1+p2);
		
		// String / Collection :CURD / read,write
	}

}




