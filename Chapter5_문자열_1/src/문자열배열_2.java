import  java.util.Scanner; 
public class 문자열배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] books = {
			"Java And Oracle",
			"Java And JSP",
			"HTML5 & CSS3",
			"Spring & VueJS",
			"SpringBoot & ReactJS",
			"JPA와 Java",
			"MyBatis & Java",
			"혼자 배우는 자바",
			"Java의 정석"
		};
		// 1. 전체 목록 출력
		System.out.println(" =========전체 출력==========");
		for(int i=0; i<books.length; i++)
		{
			System.out.println((i+1)+". "+books[i]);
		}
		System.out.println("===========================");
		// 2. 검색 : contains
		Scanner sc= new Scanner(System.in);
		System.out.println("검색어 입력:");
		String fd= sc.next();
		for(String book : books)
		{
			if(book.contains(fd)) // 결과값 (true/false)
			{
				System.out.println(book);   // LIKE '%Java%'
			}
		}
		////////////////////////////////// 서제스트
		// 3. 시작문자 / 끝문자 ==> 자동 완성기
		System.out.println("======= startsWITH=========");
		for(String book :books)
		{
			if(book.startsWith(fd)) // 서제스트 (시작 단어)
			{
				System.out.println(book); //입력한 단어로 시작하는 책의 종류를 알려준다.
				// LIKE 'Java%'
			}
		}
		 System.out.println("========endsWITH=========="); // LIKE '%Java'
		 for(String book: books)
		 {
			 if(book.endsWith(fd))
			 {
			 System.out.println(book);
			 }
		
		}
		 
	}
	

}





















