package com.sist.exception;
/*
 *     1. try~ catch
 *     2. throws
 *       ---------
 *       예외선언 (예외회피) => 시스템에 예외 알려준다
 *       형식)
 *            public void display() throws NumberFormatException, RunTimeException, Exception
 *                                         ---------------------------------------------------
 *                                         catch : 순서, throws 순서가 없다
 *           => 라이브러리는 예산된 예외를 throws로 이용해서 등록
 *              ==>                 ------------------- 처리하면서 사용을 해야한다
 *           => 사용법 2가지가 있다
 *           1) try~catch :직접 처리하는 방법
 *           2) throws :선언만 처리
 *           
 *           public void display() throws Exception => display를 호출시에는 Exception 처리한 후 사용
 *           {
 *           }
 *           
 *           public void aaa()
 *           {
 *           		display(); //오류 코드
 *           }
 *           
 *           1)  public void aaa()
 *               {
 *               	try
 *               	{	
 *               		display();
 *               	}catch(Exception e){}
 *               }
 *           2) public void aaa() throws Exception
 *           	{
 *                   dispaly();
 *           	}
 *          --------------------------------------------------
 *          public void aaa() throws NumberFormatException, ArrayIndexOutOfBoundsException
 *          {
 *          }
 *          
 *             
 *           main()
 *           {
 *           	aaa(); // 정상 동작
 *           }
 *          
  
 *          Exception > RuntimeException
 *          
 *          // Exception / Throwable
 *             모든 예외를 처리할 수 있는 클래스
 *             void aaa() throws IOException,ClassNotFoundException
 *             
 *             void bbb() throws IOException,ClassNotFoundException
 *             void bbb() throws Exception ==> 확대
 *             void bbb() throws Throwable
 *             
 *             void aaa() throws Throwable ==> 축소
 *             
 *             void bbb() throws Exception(X)
 *             
 *                     Throwable
 *                        |
 *                -------------------
 *                |                  |
 *             Error              Exception
 *                                    RunTimeException ==> 예외처리를 생략할 수 있다
 *                                        |
 *                                    NumberFormatException,NullPointerException
 *            
 *          
 */
public class MainClass_예외처리_1 {
	//CheckException => 컴파일러가 예외처리가 되었는지 확인 => 반드시 예외처리를 해야한다
	public static void aaa() throws Exception
	{
		
	}
	//UnCheckException => 컴파일러가 예외처리를 확인하지 않는다 => 예외처리를 생략할 수 있다
	public static void bbb() throws NumberFormatException,NullPointerException
	{
		// 예외처리 생략 가능
	}
	// void java.lang.Thread.sleep(ling millis) throws InterruptedException
	//                                 간접 ==> 자바시스템에서 처리 요청
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//			bbb(); 
//			try
//			{
//			aaa(); 
//			}catch(Exception ex) {} // 1. 직접 예외처리를 할지
//			aaa(); // 2. 선언을 해서 쓸지
		    try
		    {
		    	Thread.sleep(1000);
		    }catch(Exception e) {}
	}

}


















