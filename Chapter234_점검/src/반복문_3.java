
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A-Z ==> for, while
		char c ='A';
		System.out.println("===for===");
		for(c='A';c<='Z';c++ )
		{
			System.out.print(c+ " ");
		}
		System.out.println();
		System.out.println("===while===");
		c='A';
		while(c<='Z')
		{
			System.out.print(c+" ");
			c++;
		}
		System.out.println();
		System.out.println("===do~while===");
		c='A';
		do {
			System.out.print(c+" ");
			c++;			
		}while(c<='Z');
		
	}

}
