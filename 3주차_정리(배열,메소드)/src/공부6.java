import java.util.Scanner;
import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;
// 확인하는 메소드는 boolean
//문자열을 입력받아서 좌우 대칭인지 확인하는 메소드를 구현하시오
public class 공부6 {
	static boolean method(String s)
	{
		boolean bCheck = true;

		for(int i=0; i<s.length();i++)
		{
			 int last =s.length()-1-i;
			 if(s.charAt(i)!=s.charAt(last))
			 {
				  bCheck =false;
				  break;
			 }
			 
		}
		return bCheck;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s ="";
		while(true)
		{
			System.out.println("문자열 입력: ");
			s=sc.next();
			if(s.length()%2!=0)
			{
				System.out.println("잘못된 입력입니다");
				continue;
			}
			break;
		}
		boolean bCheck =method(s);
		if(bCheck ==true)
			System.out.println("좌우대칭입니다");
		else
			System.out.println("좌우대칭이 아닙니다");
	}
}
	



