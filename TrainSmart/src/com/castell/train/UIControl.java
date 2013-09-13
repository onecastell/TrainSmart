package com.castell.train;

import javax.swing.*;
import java.awt.*;

public class UIControl extends JFrame {
	//private boolean 
	
	private class UIPanel extends JPanel{
		//TODO:Constructor to init controls
		UIPanel(){};
		
		public void paintComponent(Graphics g){
			
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