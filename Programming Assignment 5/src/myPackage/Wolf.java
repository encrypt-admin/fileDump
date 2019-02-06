/**
 * multiline comment
 */
package myPackage;

/**
 * @author Kaleb Moreno (kalebm2@uw.edu)
 * @version 2/4/2019
 */
public class Wolf extends AbstractCritter {
//	Fields
	private int myDirection;
	private int myCount;
	private boolean myFirst;
	private int myTarget;
	
	/**
	 * This is the constructor 
	 */
	public Wolf() {
		super('W');
		myDirection = EAST;
		myCount = 0;
		myFirst = true;
		myTarget = 1;
		
	}

	/**
	 * This is the overridden method from the interface
	 * @return 
	 */
	@Override
	public int getMove(CritterInfo theInfo) {
		myCount += 1;
		
		if (myCount == myTarget) {
			myCount = 0;
			if (myFirst == false) {
				myTarget += 1;
				myFirst = true;
				if (myDirection == EAST) {
					myDirection = NORTH;
				} else if (myDirection == NORTH) {
					myDirection = WEST;
				} else if (myDirection == WEST) {
					myDirection = SOUTH;
				} else if (myDirection == SOUTH) {
					myDirection = EAST;
				}
			}
			if (myFirst == true) {
				myFirst = false;
			}
		}
		int direction = myDirection;
		return direction;
	}

}
