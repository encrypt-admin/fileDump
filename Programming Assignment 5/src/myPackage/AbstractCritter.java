/*
 * Multiline comment at the top of the file
 */
//package myPackage;

/**
 * This abstract class implements the Critter interface
 * And sets the instance variable indicating the type of 
 * Critter, to the parameter passed parameter in the 
 * Constructor. 
 * 
 * @author Kaleb Moreno (kalebm2@uw.edu)
 * @version 2/4/2018
 */
public abstract class AbstractCritter implements Critter {

	/**
	 * This field represents the critter as a char
	 */
	private char myCritter;

	/**
	 * Constructor that sets the field to the parameter passed
	 * 
	 * @param theChar : This is the critter identifier
	 */
	public AbstractCritter(final char theChar) {
		myCritter = theChar;
	}
	
	/**
	 * Overridden method from interface
	 * @return : returns the char representing the type of 
	 * Critter
	 */
	@Override
	public char getChar() {
		return myCritter;
	}
}
