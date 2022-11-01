import java.util.Scanner;

/*
 *   1. 3명의 국어, 영어, 수학, 총점, 평균, 등수
 */
public class 다른문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		int rank =0;
		// int[][] 성적 =new int[3][5];
		// 변수 -> 1차원 배열 -> 2차원 배열
		double[] avg = new double[3];

		
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<3; i++)
		{
			System.out.print((i+1)+"번째 국어 입력: ");
			kor[i]=sc.nextInt();
			System.out.print((i+1)+"번째 영어 입력: ");
			eng[i]=sc.nextInt();
			System.out.print((i+1)+"번째 수학 입력: ");
			math[i]=sc.nextInt();	
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		for(int i =0; i<3; i++)
		{
			rank[i]=1;
			for(int j =0; j<3; j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		for(int i =0; i<3; i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5d\n",kor[i],eng[i],math[i],total[i],avg[i],rank[i]);
		}
		
	}

}
