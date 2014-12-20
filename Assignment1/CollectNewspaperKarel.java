/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	public void run(){
		goToWall();
		checkSides();
		scurryWallLeft();
		checkNewspaper();
		goToWall();
		turnRight();
		goToWall();
		haveATantrum();
	}

	
	private void goToWall(){
		while(frontIsClear()){
			move();
		}
	}//end goToWall
	
	private void checkSides(){
		if(rightIsBlocked()){
			turnLeft();
		}else{
			turnRight();
		}
	}//end checkSides
	
	private void scurryWallLeft(){
		while(leftIsBlocked()){
			move();
		}
	}//end scurryWallLeft
	
	private void checkNewspaper(){
		turnLeft();
		move();
		if(beepersPresent()){
			pickBeeper();
			turnAround();
			move();
		}	else{
				haveATantrum();
			}		
	}// end checkNewspaper
	
	
	
	
	private void haveATantrum(){
		for(int i=0; i<20; i++){
			turnLeft();
		}
	}//end haveATantrum
};
