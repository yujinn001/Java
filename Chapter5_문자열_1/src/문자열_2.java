import java.util.Arrays;

// concat : 문자열 결합
// concat(문자열, 문자열) ==> 문자열+문자열
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1 ="Hello";
		 String s2 = "Java!!";
		 System.out.println(s1.concat(s2));
		 System.out.println(s1+s2);
		 // 문자열 ==> 기능 수행 ==> 문자열 변경하지 않는다
		 System.out.println(s1);
		 s1 =s1.substring(3);
		 //System.out.println(s1.substring(3));
		 System.out.println(s1);
		 
		 
		 String msg="Hello Java";
		 // a => b ==> Hello Jbvb;
		 System.out.println(msg.replace("a", "b"));
		 
		 String msg1 = "홍길동 version 2!";
		 System.out.println(msg1.replaceAll("[^가-힣]", "")); // 한글을 제외하고 나머지는 공백으로 처리!!
		 //[가-힣]: 한글 전체 [A-Za-z] [0-9] ,^ : 제외
		 System.out.println(msg1.replaceAll("[^A-Za-z]", ""));
		 System.out.println(msg1.replaceAll("[^0-9]", ""));
		 
		 String movie =  "범죄, 스릴러 |  한국 | 105분 |2022.10.26개봉";
		 String[] m = movie.split("\\|"); // ^, |, ?, . , +,* 앞에 \\ 역슬래시를 붙여야한다
		 System.out.println(Arrays.toString(m));
				 
		 
				 
	}

}
