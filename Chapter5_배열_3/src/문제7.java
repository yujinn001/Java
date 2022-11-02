import java.util.Arrays;

/*
 *  7. 임의의 문자 5개를 저장하고 정렬해서 출력하시오 
    A C D H J
     A C D H J
     J H D C A
 */
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = new char[5];
		for(int i = 0; i<ch.length; i++)
		{
			ch[i]=(char)((Math.random()*26)+65);
		}
		System.out.println("정렬 전 : ");
		System.out.println(Arrays.toString(ch));
		for(int i =0; i<ch.length; i++)
		{
			for(int j =0; j<i; j++)
			{
				if(ch[i]>ch[j])
				{
					char temp = ch[i];
					ch[i] =ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println("정렬 후 (내림차순): ");
		System.out.println(Arrays.toString(ch));
		for(int i =0; i<ch.length; i++)
		{
			for(int j =0; j<i; j++)
			{
				if(ch[i]<ch[j])
				{
					char temp = ch[i];
					ch[i] =ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println("정렬 후(오름차순) : ");
		System.out.println(Arrays.toString(ch));
	}
}

