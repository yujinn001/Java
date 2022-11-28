package com.sist.main;

import java.util.Scanner;

class Board 
{
	public void write() // write.do
	{
		System.out.println("글쓰기 처리...");
	}
	public void list() // list.do
	{
		System.out.println("게시물 목록 출력...");
	}
	public void update() //update.do(do : 실행)
	{
		System.out.println("게시물 수정하기");
	}
	public void delete() // delete.do
	{
		System.out.println("게시물 삭제...");
	}
	public void find() //find.do
	{
		System.out.println("게시물 찾기");
	}
	public void detail() // detail.do
	{
		System.out.println("상세보기");
	}
}
public class MainClass_어노테이션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("기능 요청 : ");
		String cmd = sc.next();
		
		Board board = new Board(); // 메모리 할당
		if(cmd.equals("write.do"))
			board.write();
		else if(cmd.equals("list.do"))
			board.list();
		else if(cmd.equals("update.do"))
			board.update();
		else if(cmd.equals("delete.do"))
			board.delete();
		else if (cmd.equals("find.do"))
			board.find();
		else if (cmd.equals("detail.do"))
			board.detail();
	}

}



















