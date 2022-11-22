package com.sist.game;
import java.awt.*;
import javax.swing.*;
/*
 *    인터페이스의 장점
 *     = 기능이 설정 (설계) : 개발 기간을 단축할 수 있다
 *     = 모든 개발자같은 메소드를 이용해서 구현 (표준화) => 라이브러리 (모든 개발자가 같은 형식으로 코딩)
 *                                                       -------------------- Spring, Framework
 *     = 서로 관계없는 클래스를 연결해서 사용이 가능하게 만든다
 *     = 독립적으로 사용이 가능
 *     = 다중 상속이 가능하기 때문에 소스코딩이 간결해 진다
 *     = 단점은 인터페이스 메소드 선언을 추가하면 => 연결되어 있는 모든 클래스가 에러발생 => default 
 */
public class GameMain extends JFrame  {
	private GameView gv = new GameView(); //포함 클래스
	public GameMain()
	{
		add("Center",gv);
		setSize(1024,768);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameMain();
	}

}
