package com.sist.io2;

import java.io.*;
import java.util.*;
class Student
{
	private int hakbun;
	private String name;
	private int eng,math,kor;
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
		
}
public class MainClass_FileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학생목록
		ArrayList<Student> list  = new ArrayList<Student>();
		// 파일 읽기
		try
		{
			String data ="1|홍길동|90|80|90\n"
					+"2|박문수|46|80|87\n"
					+"3|심청이|37|63|66\n"
					+"4|이순신|78|78|78\n"
					+"5|강감찬|77|78|68";
			// 저장
			FileWriter fw = new FileWriter("c:\\java_data\\student.txt");
			/*
			 *   new FileWriter("c:\\java_data\\student.txt"); => create
			 *   new FileWriter("c:\\java_data\\student.txt, true"); ==> Append
			 */
			fw.write(data);
			fw.close();
			/*
			 *  FileWriter => write,close()
			 *  FileReader => read,close()
			 */
			System.out.println("데이터 저장 완료!!");
		}catch(Exception ex) {}
	}

}


















