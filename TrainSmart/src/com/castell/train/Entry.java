/**************************************************************************
 *Class Description: Entry Class is a custom data type containing workout info
 *Revision:092013(Commit Timestamp differs)
 **************************************************************************/
package com.castell.train;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Entry {
	private String entryID;
	private String description;
	private int sessionLength;
	private double calsBurned;
	private String timeStamp;
	
	public static ArrayList<Entry> allEntries = new ArrayList<Entry>(); //Static ArrayList Holds all Entry instances 
	
	//Constructor
	Entry(int wrktLen,String...extra){
		this.sessionLength = wrktLen; //Set workout duration for current entry
		//Calculate Calories burned from workout
		ComputeCals(this.sessionLength);
		
		//Generate timestamp for current entry
		Date dat = new Date();
		SimpleDateFormat datFrmt = new SimpleDateFormat("hh:mm:ssa dd-MM-yyyy");
		this.timeStamp = datFrmt.format(dat);
		
		//Check for extra Entry info and save in CSV format if > 1
		if (extra.length>1){
			for (String str:extra){
				if(str!=null)
					//Update Description if extra user info is available
					this.description += String.format("%s,", str);	
			}
		}
		else
			//Update Description
			this.description = String.format("%.2f calories burned with %s at %s for %d minutes.",
											this.calsBurned, extra[0],this.timeStamp,this.sessionLength);
		
		allEntries.add(this); //Add Entry to static index
	}
	
	//Method for calorie burner algorithm implementation[TODO:WIP]
	private double ComputeCals(int wrklen){
		//Dummy Algorithm for Alpha(1 minute = 13.18 calories burned)
		
		double rawLength = (double) wrklen;//Cast wrklen to double 
		
		this.calsBurned = (double)(rawLength*13.18);
		return this.calsBurned;
	} 
	
	@Override
	public String toString(){
		return this.description!=null?this.description:this.entryID; //Returns entry id if description not defined 
	}
}
