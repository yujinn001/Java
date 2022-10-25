import java.util.Scanner;

public class 제어문_반복문5 {

	public static void main(String[] args) throws Exception { //throws Exception!! 빼먹지 말기
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(;;)
		{
			System.out.println("1. 메모장 , 2. 그림판, 3. 브라우저, 4. 종료");
			int no = sc.nextInt();
			
			if(no < 1|| no > 4) 
			{
				System.out.println("메뉴 선택이 잘못되었습니다!!");
				continue; // 다시 메뉴를 사용할 수 있게 만드는 !!
			}
			
			switch(no)
			{
			case 1:
				Runtime.getRuntime().exec("C:\\Windows\\notepad.exe");
				break;
			case 2:
				Runtime.getRuntime().exec("C:\\Windows\\System32\\mspaint.exe");
				break;
			case 3:
				Runtime.getRuntime().exec("C:\\Program Files\\internet explorer\\iexplore"+"www.naver.com");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다!!");
				System.exit(0); // 0(정상종료), -1(비정상 종료)
				
			}
					
		}
	}

}
