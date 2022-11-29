package com.sist.io;

import java.util.*; 
import java.io.*;
class Sawon implements Serializable  // 직렬화가 되지 않으면 오류가 발생한다
{
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	private String job;
	// sabun name dept loc job : 데이터 스틤(연속적인 메모리에 저장)
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	// 생성자
	public Sawon(int sabun, String name, String dept, String loc, String job) {		
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
		this.job = job;
	}
	public Sawon() {} // default 생성자
	
	
}
public class MainClass_ObjectInptStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sawon> list = new ArrayList<Sawon>();
//		list.add(new Sawon (1, "홍길동","개발부", "서울", "대리"));
//		list.add(new Sawon (2, "이순신","기획부", "부산", "사원"));
//		list.add(new Sawon (3, "강감찬","자재부", "제주", "과장"));
//		list.add(new Sawon (4, "김두한","총무부", "인천", "사원"));
//		list.add(new Sawon (5, "박지성","개발부", "서울", "부장"));
//		// ArrayList 자제를 저장
//		try
//		{
//			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:\\java_data\\sawon.txt"));
//					oos.writeObject(list);
//					oos.close();
//					System.out.println("저장완료");
//		}catch(Exception ex) {ex.printStackTrace();}
		try
		{
			ObjectInput ois = new ObjectInputStream(new FileInputStream("c:\\java_data\\sawon.txt"));
			list = (ArrayList<Sawon>)ois.readObject();
			ois.close();
			
			//출력
			for(Sawon s : list)
			{
				System.out.println(s.getSabun()+" "
						+s.getName()+" "
						+s.getDept()+" "
						+s.getLoc()+" "
						+s.getJob());
			}
		}catch(Exception ex) {ex.printStackTrace();}
	}

}
























