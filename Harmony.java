import java.util.*;

public class Harmony extends ChordGroup{
    
	// Instance variables
	private String name;
	
	// Constructors
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
	
	// Setters & Getters
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
}   
