package com.castell.train;

import javax.swing.*;
import java.awt.*;

public class UIControl extends JFrame {
	private class UIPanel extends JPanel{
		//TODO:Constructor to init controls
		UIPanel(){};
		
		public void paintComponent(Graphics g){
			
		}
	}
	
	//Constructor inits Frame
	public UIControl() {
		UIPanel ui = new UIPanel();
		this.setSize(320, 480);//set default 320x480
		this.add(ui);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}