import java.util.*;

public class Harmony extends ChordGroup{
    
	//===================================================================
    //                      Instance Variables
    //===================================================================
	
	private String name;
	
	//===================================================================
    //                        Constructors
    //===================================================================
	
	// !!! implement cases for String[][] as input?
	// List String -> Harmony
	public Harmony(List<Chord> newChordList, String newName){
		super(newChordList);
		name = newName;
	}
	// List -> Harmony
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
	
	@Override
	public String toString(){
		return "name: " + name + " chords: " + getChordsAsString() + " size: " + getSize();
	}
}   
