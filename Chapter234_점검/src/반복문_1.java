/*
 *    *** for : 횟수가 지정 : 화면 UI (알고리즘)
 *        형식) 
 *             for(int i=1; i<=5; i++)
 *             => 1부터 5까지 1개 증가 => 반복 5번 수행
 *                초기값 조건식 증감식
 *                
 *                           false면 종료
 *                             |    true
 *                초기값 ====> 조건식 ======= > 반복문장 수행 ==> 증가식
 *                            |                               |
 *                            <================================
 *        형식)         1 ->  2   <- 4 
 *               for(초기값; 조건식; 증가식)
 *               {           | 
 *               	    반복 문장 수행 3
 *               }
 *    *** while : 무한 루프, 횟수가 지정이 안된 상태
 *    ------------------------------------
 *               1) 무한루프
 *                  while(true)
 *                  {
 *                  	실행문장
 *                  }
 *               2) 횟수가 지정된 경우
 *                  초기값  ---------- 1
 *                  while(조건식) ---- 2 => false면 종료
 *                  {     |  true
 *                  	실행문장  ----- 3
 *                      증감식   ----- 4
 *                  }
 *    do ~ while : 조건을 나중에 검색  ==> 반드시 한번 이상 수행이 가능
 *                 초기값 ------------ 1
 *                 do  ------------- 2
 *                 {
 *                 	   반복문장 ------ 3
 *                                          true면 
 *                 }while(조건식);----- 4 ==> 2번으로 이동해서 반복문장을 수행
 *                      | 
 *                    false => 종료
 *                 
 *                
 *    *** break : 무한루프 ==> 종료 (반복문을 중단할 때 사용)
 *    continue : 특정 부분을 제외할 때 사용
 *          ===> 이동 (for : 증가식으로 이동, while : 조건식 => 무한루프에 걸릴 수 있다)
 *              *** while을 사용할 때는 ==> 무한루프 ==> 처음으로 다시 실행할 때
 *              
 *    
 */
public class 반복문_1 {
	public static void main(String []args)
	{
		 System.out.println("=====for=====");
		 for(int i =1; i<=10; i++)
		 {
			  System.out.println(i+" ");
		 }
		 System.out.println();
		 System.out.println("===while===");
		 int i =1;
		 while(i<=10)
		 {
			 System.out.println(i+" ");
			 i++;
		 }
		 System.out.println();
		 System.out.println("====do~while===");
		 i=1;
		 do {
			 System.out.println(i+" ");
			 i++; 
		 }while(i<=10);
	}
}
















