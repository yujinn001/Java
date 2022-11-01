import java.util.Arrays;

// 5개의 정수를 저장한 다음에  ==> 총합 / 평균  ==> 196page
// 응용 ==> 3명의 학생 국어, 영어, 수학 ==> 총점/평균/학점 ==> 등수 출력
public class 배열응용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score =new int[5]; //선언
		for(int i=0; i<score.length; i++) //필요한 값을 저장
		{
			score[i]=(int)(Math.random()*70)+30; // 30(default) ~ 100
		}
		System.out.println(Arrays.toString(score));
		// 총점/평균
		int total=0;
		double avg =0.0;
		
		for(int i : score)
		{
			total +=i;
		}
		// 출력
		System.out.println("총합 : "+total);
		System.out.printf("%.2f\n",total/(double)(score.length));
		
	}

}
