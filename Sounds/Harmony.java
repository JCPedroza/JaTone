// !!! implement cases for String[][] as input?
// !!! needs more constructors, but read about factories first

import java.util.*;

/**
* Represents a group of chords that form a harmonic system.
*/
public class Harmony extends ChordGroup{
    
	//===================================================================
    //                      Instance Variables
    //===================================================================
	
	private String name;
	
	//===================================================================
    //                        Constructors
    //===================================================================
	
	public Harmony(List<Chord> newChordList, String newName){
		super(newChordList);
		name = newName;
	}

	public Harmony(List<Chord> newChordList){
		this(newChordList, "none");
	}
	
	/**
   	* Copy constructor. Use this to make copies of Harmony objects. 
    * @param newHarmony The Harmony object to be copied.
    */
	public Harmony(Harmony newHarmony){
		this(newHarmony.getChords(), newHarmony.getName());
	}
	
	//===================================================================
    //                            Setters 
    //===================================================================
	
	public void setName(String newName){
		name = newName;
	}
	
	//===================================================================
    //                           Getters
    //===================================================================
	
	public String getName(){
		return name;
	}
	
	//===================================================================
    //                       Special Getters
    //===================================================================
	
	/**
	* Builds a String with the values of the object.
	* @return The state of the Harmony as a String.
	*/
	@Override
	public String toString(){
		return "name: " + name + " chords: " + getChordsAsString() + " size: " + getSize();
	}
}   
