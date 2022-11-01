// 사원 번호 출력 다시풀기
/* 
 * 	2. 1월달 사원(1번부터 5번사원)의 실적이 50 45 35 12 70 이다.
 *  (실적 0~100)
 *  1) 사번별 실적을 출력하시오.  사원(1) 50..
 *  2) 1월 실적의 총점과 평균을 출력하시오
 *  3) 실적이 제일 큰 사원의 사번과 실적, 작은 사원의 사번과 실적을 출력하시오.
 */
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sawon = {50,45,35,12,70};
		for(int i =0; i<sawon.length; i++)
		{			
			System.out.println("사원("+(i+1)+") "+sawon[i]);
		}
		// 총점 / 평균
		int sum =0;
		double avg =0;
		for(int i =0; i<sawon.length; i++)
		{
			sum+=sawon[i];
		}
		System.out.println("총점 : "+sum);
		avg = sum / (double)sawon.length;
		System.out.println("평균 : "+avg);
		int max =sawon[0],sabun1=0;
		int min = sawon[0],sabun2=0;
//		int i=0;	
//		for(i=0; i<sawon.length; i++)
//		{
//			if(max<sawon[i])
//			{
//				max=sawon[i];	
//				break;
//			}
//		}
//		System.out.println("실적이 제일 큰 사번 : "+(i+1)+", 실적 : "+max);
//		int j =0;
//
//		for( j=0; j<sawon.length; j++)
//		{
//			if(min>sawon[j])
//			{
//			  min=sawon[j];	
//			  break;
//		    }
//		}
//		System.out.println("실적이 제일 작은 사번 : "+(j+1)+", 실적 : "+min);
		for(int i =0; i<sawon.length; i++)
		{
			if(max<sawon[i])
				max=sawon[i];
			else if(min>sawon[i])
				min = sawon[i];
		}
		for(int i =0; i<sawon.length; i++)
		{
			if(max==sawon[i])
			{
				sabun1=i;
			    break;
			}
			else if(min==sawon[i])
			{
				sabun2 =i;
				break;
			}
		}
		System.out.println("실적이 제일 큰 사번 : "+(sabun1+1)+", 실적 : "+max);
		System.out.println("실적이 제일 작은 사번 : "+(sabun2+1)+", 실적 : "+min);
	}
}


