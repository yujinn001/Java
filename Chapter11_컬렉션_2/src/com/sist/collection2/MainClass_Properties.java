package com.sist.collection2;
/*
 *  Properties
 *  -----------
 *     파일을 읽어서 데이터를 가지고 온다 
 *     => 중요한 데이터가 있는 경우 (데이터베이스 정보)
 *                             ------------- 오라클 위치, ID, PassWord
 *     => 유효성 검사
 *     ------------------------ 마이바티스, 스프링
 *     1) 객체 생성
 *     2) 파일 읽기   
 *     3) 키 => 값읽기
 *     
 */
import java.util.*;
import java.io.*;
public class MainClass_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Properties prop = new Properties();
			// 파일읽기
			prop.load(new FileInputStream("C:\\javaDev\\javastudy\\Chapter11_컬렉션_2\\src\\com\\sist\\collection2\\info.properties"));
			String name=prop.getProperty("name");
			String address=prop.getProperty("address");
			String tel=prop.getProperty("tel");
			System.out.println(name+" "+address+" "+tel);
			
			Properties props = System.getProperties();
			System.out.println(props.getProperty("java.version"));
			System.out.println(props.getProperty("user.language"));
			props.list(System.out);
			// Systyem에 저장된 정보
			Properties prop2 =new Properties();
			prop2.setProperty("driver", "oracle.jdbc.driver.OracleEriver");
			prop2.setProperty("url","jdbc:oracle:thin@localhost:1521:EX");
			prop2.setProperty("username","hr");
			prop2.setProperty("password","happy");
			try
			{
				prop2.store(new FileOutputStream("db.propertics"), "데이터 베이스 정보");
				
			}catch(Exception ex) {}
			
		}catch(Exception ex) {}
	}

}
