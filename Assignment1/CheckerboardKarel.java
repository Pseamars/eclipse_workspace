/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run(){
		putBeeper();
		onlyAve();
		while(frontIsClear()){
			putBeeperRow(); 
			nextRow();
		}
	}
	
	private void onlyAve(){
		if(frontIsBlocked()){
			turnLeft();
			while(frontIsClear()){
			putBeeperRow();
			}
		}
	}
	
	private void putBeeperRow(){
			if(frontIsClear()){
			move(); 
			}if(frontIsClear()){
			move();
			putBeeper();
			}		
	}
	
	private void nextRow(){
		if(frontIsBlocked()){
			if(facingWest()){
				if(noBeepersPresent()){
					turnRight(); 
					if(frontIsClear()){
						move();
						turnRight(); 
						putBeeper();
					}	
				}else{
					oddWest();
				}
			}else{
				if(noBeepersPresent()){
					turnLeft();
					if(frontIsClear()){
						move(); 
						turnLeft();
						putBeeper();
					}
				}else{
					oddEast();
				}
				
			}
		}	
	}
	
	private void oddWest(){
		turnRight();
		move(); 
		turnRight();
		move(); 
		putBeeper();
	}
	
	private void oddEast(){
		turnLeft();
		move(); 
		turnLeft();
		move(); 
		putBeeper();
	}
}	
