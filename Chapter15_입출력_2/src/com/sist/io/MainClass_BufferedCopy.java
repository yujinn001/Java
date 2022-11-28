package com.sist.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.Buffer;

public class MainClass_BufferedCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\javaDev\\apache-tomcat-9.0.68"));
		BufferedOutputStream bos = 
				 new BufferedOutputStream(new FileOutputStream("C:\\java_data\\tomcat.zip"));
		byte[] buffer = new byte[1024];
		int i =0;
		while((i=bis.read(buffer,0,1024))!=-1)
		{
			bos.write(buffer,0,i);
		}
		bis.close();
		bos.close();
		System.out.println("데이터 저장완효");
		}catch(Exception ex) {}
	}

}
