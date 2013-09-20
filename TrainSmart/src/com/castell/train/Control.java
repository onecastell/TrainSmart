/**************************************************************************
 *Author: Franklin Castellanos.
 *Program Spec: A Simple Workout Assistant and Calorie Calculator
 *				(Refer to Readme file for full spec.)  	
 *Revision:092013(Commit Timestamp differs)
 **************************************************************************/

package com.castell.train;
import java.util.Scanner;

public class Control {
		
	public static void main(String[] args) {
		int workoutLen;			//User Provided Workout Length
		String workoutDescr;	//User Provided Workout Description
		
		//UIHelper window = new UIHelper();
		Scanner input = new Scanner(System.in);
		Demo demo = new Demo();
		
		//Query User Input
		System.out.println("Enter minutes Worked Out:");
		workoutLen = input.nextInt();
		System.out.println("Enter Equipment Used:");
		workoutDescr = input.next();
		
		//Process User Input
		demo.newEntry(workoutLen, workoutDescr);
		
		//demo.newEntry(60, "Treadmill");//Test Values for Demo
		System.out.printf("%s", (String)demo.getEntry().toString());
	}
	
}
