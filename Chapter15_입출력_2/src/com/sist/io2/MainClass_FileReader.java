package com.sist.io2;
// 한글 파일 => char (2byte)
import java.io.*;
import java.util.*;
public class MainClass_FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		try
		{
			// 파일 읽기 => 구분
			FileReader fr = new FileReader("c:\\java_data\\student.txt");
			// 소스에서 수정이 가능 (예외), 불가능 (에러)
			int i =0; // 글자 번호 =>  'A'=>65
			String data="";
			while((i=fr.read())!=-1)
			{
				data+=String.valueOf((char)i); // char를 문자열로 변환
			}
			fr.close();
			//System.out.println(data);
			String[] str =data.split("\n"); // String[] split(String regex) => 정규식
			/*
			 *  정규식 사용하는 기호  => 기호자체를 출력 : \\기호
			 *   1) | => 선택,  A|B
			 *   2) + => 1개 이상의 데이터
			 *   3) * => 0개 이상의 데이터
			 *   4) ^ => 시작, 제외 ^[^범위]
			 *   5) $ => 끝
			 *   6) . => 임의의 1글자
			 *   7) [] => 범위
			 *   8) {} => 글자수 
			 */
			for(String s : str)
			{
				String[] std = s.split("\\|");
				Student ss = new Student();
				ss.setHakbun(Integer.parseInt(std[0]));
				ss.setName(std[1]);
				ss.setKor(Integer.parseInt(std[2]));
				ss.setEng(Integer.parseInt(std[3]));
				ss.setMath(Integer.parseInt(std[3]));
				list.add(ss);
			}
			
			// 출력
			for(Student ss :list)
			{
				System.out.println(ss.getHakbun()+" "
						+ss.getName()+" "
						+ss.getKor()+" "
						+ss.getEng()+" "
						+ss.getMath()+" "
						+(ss.getKor()+ss.getEng()+ss.getMath())+" "
					    + String.format("%.2f", (ss.getKor()+ss.getEng()+ss.getMath()/3.0))
						);
				// String.format => 소수점 제한
			}
		}catch(Exception ex) {ex.printStackTrace();}
	}

}












