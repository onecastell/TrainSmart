package com.castell.train;

import javax.swing.*;
import java.awt.*;

public class UIControl extends JFrame {
	
	
	private class UIPanel extends JPanel{
		private Graphics refg; 
		
		UIPanel(){
			JButton btnTst = new JButton("Test");
			btnTst.setLocation(0,0);
			btnTst.setVisible(true);
			this.add(btnTst);
		}
		
		public void paintComponent(Graphics g){
			this.refg= g;
			g.drawLine(0, 0, 320, 480);
			
		}
	}
	
	public UIControl(int width,int height){
		UIPanel ui = new UIPanel();
		this.add(ui);
		this.setSize(width, height); 
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public UIControl() {
		this(320,480); //Set default dimensions (320x480)
	}
	
}