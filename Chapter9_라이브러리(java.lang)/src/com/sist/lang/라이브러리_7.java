package com.sist.lang;
class Student
{
	private String name; //private로 하게 될 경우 다른 사람이 쓸 수 없기 때문에 getter/setter을 사용해서 읽고 쓰게 해준다

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Student (String name) {
		this.name = name;
	}
	// equals ==> 오버라이딩 ==> 주소비교(X),  객체가 가지고 있는 이름(문자열) 비교 
	// Object에서 equals는 사용빈도가 거의 없고 ==> String(Object상속) => 로그인, ID 체크
	// Object에서는 주소값 비교 (new) , String => 실제 저장된 문자열 비교
	@Override
	public boolean equals(Object obj) {
		/*
		 *     (Student)obj.name(X)
		 *     --------    - 점이 우선순위가 된다
		 *                 1
		 *         2 
		 *                
		 *      ((Student)obj).name ==> 많이 나온다
		 */
		if(obj instanceof Student)
				return name==((Student)obj).name; //같은 이름이면 true ==> 이름 비교
		else
			return false;
	}
	
	
}
public class 라이브러리_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("홍길동");
		Student s2 = new Student("홍길동");
		
		if(s1.equals(s2))
		{
			System.out.println("같은 학생입니다");
		}
		else
		{
			System.out.println("다른 학생입니다");
		}
	}

}
