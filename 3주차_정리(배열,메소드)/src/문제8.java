import java.util.Scanner;

//학점을 구하는 메소드를 구현하시오
//  생략하심
public class 문제8 {
	static void score(int a, int b, int c)
	{

		int sum =a+b+c;
		double avg =sum/3.0;
		switch((int)avg)
		{
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7: 
			System.out.println("C");
			break;
		default:
			System.out.println("F");	
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		score(80,80,100);

				
		
	}

}
