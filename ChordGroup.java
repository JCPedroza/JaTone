import java.util.*;

public class ChordGroup{
	
	// Instance variables
	private int         size;
	private List<Chord> chords;
	
	// Constructor
	// !!! More cases
	public ChordGroup(List<Chord> newChordList){
	    chords = newChordList;
	    size   = chords.size();
	}
	
	// Setters & Getters
	public int getSize(){
		return size;
	}
	
	public List<Chord> getChords(){
		return chords;
	}
	
	// Returns the chords as an array of arrays of notes
	// !!! Everything
	public String[] getChordsAsStringArray(){
	    List<String> chordList = new ArrayList<String>();
	    for (Chord e : chords){
	    	chordList.add(e.getName());
	    } 
	    return chordList.toArray(new String[chordList.size()]);
	}
}