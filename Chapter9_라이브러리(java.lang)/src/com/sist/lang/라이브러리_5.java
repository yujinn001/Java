package com.sist.lang;
// 클래스 복제시에 인터페이스를 구현
class Sawon implements Cloneable
{
	//캡슐화 코딩 => 데이터는 private, 읽기/쓰기(getter/setter)
  	private String name;
	private String dept;
	private String loc;
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
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
//    라이브러리는 예외처리가 필요한 부분은 예측해서 설정 ==> CheckedException
//    넘어오는 값을 확인한다!!
//    예시)  위에 오버라이딩 된 부분을 보면 넘어오는 값은 Object!!
/*
 *     Object (상위클래스)
 *        |
 *     Sawon (하위클래스)
 *     
 *     상위클래스를 하위클래스에 집어넣으려고 해서 오류가 생긴다
 *     이럴 경우에는 형변환을 시켜준다!!
 *     Sawon copy = sa.clone(); ==> Sawon copy = (Sawon)sa.clone();
 */
public class 라이브러리_5 {
	//throws CloneNotSupportedException, throws Exception
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Sawon sa = new Sawon();
		sa.setName("홍길동");
		sa.setDept("개발부");
		sa.setLoc("서울");
		
		
		// Sawon copy =sa;
		Sawon copy = (Sawon)sa.clone(); // 많이 등장 ==> 라이브러리 메소드 호출 시 대부분 => Object
		Sawon sa2= sa;
		Sawon sa1= new Sawon();//초기값
		
		System.out.println("sa: "+ sa);
		System.out.println("copy : "+ copy); //주소값이 다른 걸 보면 따로 저장이 된다는 걸 알 수 있다
		System.out.println("sa1: "+sa1);
		System.out.println("sa2: "+sa2);
		
		System.out.println("sa.name : "+sa.getName());
		System.out.println("sa.dept : "+sa.getDept());
		System.out.println("sa.loc : "+sa.getLoc());
		System.out.println("sa1.name : "+sa1.getName());
		System.out.println("sa1.dept : "+sa1.getDept());
		System.out.println("sa1.loc : "+sa1.getLoc());
		System.out.println("copy.name : "+copy.getName());
		System.out.println("copy.dept : "+copy.getDept());
		System.out.println("copy.loc : "+copy.getLoc());
	}

}
