package com.castell.train;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIHelper extends JFrame  {
	
	protected class UIPanel extends JPanel implements ActionListener{
		private Graphics refg; //Graphics object reference
		
		UIPanel(){
		}
		
		public void paintComponent(Graphics g){
			this.refg= g;  //Graphics object reference
		}
		
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	public UIHelper(int width,int height){
		UIPanel ui = new UIPanel();
		this.add(ui);
		this.setSize(width, height); 
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public UIHelper() {
		this(320,480); //Set default dimensions (320x480)
	}
	
	@Override
	public String toString(){
		return null;
	}
}