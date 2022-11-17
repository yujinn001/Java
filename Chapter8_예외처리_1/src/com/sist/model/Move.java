package com.sist.model;

public interface Move {
   public default void move()
   {
	   System.out.println("게시판으로 이동");
   }
}
