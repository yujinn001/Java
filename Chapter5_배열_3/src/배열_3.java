import java.util.Arrays;

// 로또
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		for(int i =0; i<lotto.length; i++)
		{
			lotto[i]= (int)(Math.random()*45)+1;
			//비교하기! => 같은 수가 있는지
			for(int j=0; j<i;j++) // 맨 처음 발생된 난수 제외
			{
				if(lotto[i]==lotto[j])
				{
					i--; // 저장하지 않는다
					break; // 다시 1차 ==> 다시 난수 발생
				}
			}		
		}
		System.out.println(Arrays.toString(lotto));		
	}
}
