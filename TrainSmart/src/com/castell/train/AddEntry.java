/**************************************************************************
 *Class Description: Entry Module which creates and stores new Entry Objects.
 *Revision:092013(Commit Timestamp differs)
 **************************************************************************/
package com.castell.train;

public class AddEntry {
	private Entry currentEntry;
	
	//Constructor initializes all class variables
	public AddEntry() {
		currentEntry = null;
	}
	
	//Creates New Entry
	public Entry setEntry(int wrktLen,String extra){
		Entry newEntry = new Entry(wrktLen, extra);
		this.currentEntry = newEntry;
		return newEntry;
	}
	
	//Returns Queried Entry
	public Entry getEntry(){
		return this.currentEntry;
	}
	
	@Override
	public String toString(){
		return this.currentEntry.toString();
	}
}
