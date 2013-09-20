package com.castell.train;

public class Demo {
	private Entry refEntry; 
	
	//Constructor
	Demo(){}
	
	//Create Entry
	public void newEntry(int wrktLen, String extra){
		AddEntry entry = new AddEntry();
		this.refEntry = entry.setEntry(wrktLen,extra);
	}
	//Display Entry
	public Entry getEntry(){
		return this.refEntry;
	}
	
	//Display Weekly Stats
	public void displayStats(){
		
	}
	
	@Override
	public String toString(){
		return this.refEntry.toString();
	}
}
