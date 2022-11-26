package com.sist.regex;
import java.util.regex.*;
// Pattern => compile, matcher(주어진 패턴과 일치하는지 판별할 때)
public class MainClass_Regex_2 {
	public static void main(String[] args)
	{
//		String data ="HP:010-1111-1111,OFFICE:02-2222-2222";
//		String pattern = "(0\\d{1,2})-(\\d{4})-(\\d{4})";
//		//                  group1     group2    group3\
//		//   \\d ==> 숫자
//		// 0숫자 1,2 010 02, 4 4
//		System.out.println(pattern);
//		Pattern p = Pattern.compile(pattern);
//		Matcher m =p.matcher(data);
//		while(m.find())// 존재여부 확인
//		{
//			System.out.println(m.group());
//		}
		//[223.130.195.200] 네이버
		//[211.249.220.24] 다음
		//[142.250.196.99] 구글
		String ip ="211.89.63.1,211.89.63.131,127.0.0.1,169.123.174.2,"
				+ "223.130.195.200,211.249.220.24,142.250.196.99,"
				+ "12345.123.111111.55555,6767676.567";
		String pattern ="(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})"; //숫자가 1~3자리
		//              [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
		//   \\d ==> ==>[0-9]
		//  \\^ \\? \\|     (\\| ==> | 자체를 출력해라!) 
		Pattern p =Pattern.compile(pattern);
		Matcher m =p.matcher(ip);
		while(m.find())
		{
			//System.out.println(m.group()); // 이 형식을 가진 데이터 출력
			if((m.group(1)+"."+m.group(2)+"."+m.group(3)).equals("211.89.63"))			
			{
				System.out.println(m.group()+"=> IP는 접근을 거부(403)");
			}
		}
	}
}

























