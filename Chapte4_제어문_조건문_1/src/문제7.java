import java.util.Scanner;

/*
 * 	문제7. 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
          작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
          나머지는 F)
		  // 	97이상 A+, 94이상 A0, 90이상 A- (B,c,d도)

 */

public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("국어, 수학, 영어 입력(80 80 80)");
		int kor =sc.nextInt();
		int math =sc.nextInt();
		int eng =sc.nextInt();
		
		int total = kor+math+eng;
		double avg =(double)total/3;
		
		char grade = ' ';
		char opt = '0';
		if(avg>=90) {
			grade ='A';
			if(avg>=97)
				opt='+';
			else if(avg>=94)
				opt='0';
			else
				opt ='-';
		}
		if(avg>=80) {
			grade ='B';
			if(avg>=87)
				opt='+';
			else if(avg>=84)
				opt='0';
			else
				opt ='-';
		}
		if(avg>=70) {
			grade ='C';
			if(avg>=77)
				opt='+';
			else if(avg>=74)
				opt='0';
			else
				opt ='-';
		}
		if(avg>=60) {
			grade ='D';
			if(avg>=67)
				opt='+';
			else if(avg>=64)
				opt='0';
			else
				opt ='-';
		}
		else
		{
			grade ='F';
		}
		System.out.println("국어:"+kor);
		System.out.println("수학:"+ math);
		System.out.println("영어:"+eng);
		System.out.println("총점: "+total);
		System.out.printf("평균:%.2f\n", avg);
		System.out.println("학점은 : "+grade+""+opt); //145page
	}

}




















