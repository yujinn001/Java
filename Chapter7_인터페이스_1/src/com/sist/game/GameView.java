package com.sist.game;

import java.awt.*;

import javax.swing.JPanel;

public class GameView extends JPanel {
	private Image back;
	private Image avata;
	 
	// 초기화 (생성자)
	public GameView()
	{
		back =Toolkit.getDefaultToolkit().getImage("사진\\배경.gif");
		avata =Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\image.png");
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
		g.drawImage(avata, 560, 650, 100, 130, this);
	}
	
}
