// !!! more constructors, but read about factories first
package sounds;

import java.util.*;

/**
* Represents a group of chords.
*/
public class ChordCollection{
	
	//===================================================================
    //                      Instance Variables
    //===================================================================
	
	/**
	* List that holds the collection of chords. 
	*/
	private List<Chord> chords;
	
	/**
	* Number of chords in the collection of chords. 
	*/
	private int         size;
	
	//===================================================================
    //                        Constructors
    //===================================================================
	
	public ChordCollection(List<Chord> newChordList){
	    chords = newChordList;
	    size   = chords.size();
	}
	
	/**
   	* Copy constructor. Use this to make copies of ChordGroup objects. 
    * @param newChordGroup The ChordGroup object to be copied.
    */
	public ChordCollection(ChordCollection newChordCollection){
		this(newChordCollection.getChords());
	}
	
	//===================================================================
    //                            Setters
    //===================================================================
	
	public void setChords(List<Chord> newChords){
		chords = newChords;
		size   = chords.size();
	}
	
	//===================================================================
    //                            Getters 
    //===================================================================
	
	public List<Chord> getChords(){
		return chords;
	}
	
	public int getSize(){
		return size;
	}
	
	//===================================================================
    //                       Special Getters
    //===================================================================
	
	
	/**
	* Builds a String with the names of the chords in the chords list.
	* @return Names of the chords as a String.
	*/
    public String getChordsAsString(){
        List<String> noteList = new ArrayList<String>();
        for (Chord e : chords){
        	noteList.add(e.getName());
        }
        return Arrays.toString(noteList.toArray(new String[noteList.size()]));
    }
    
    /**
    * Builds a String with the values of the object.
    * @return The state of the ChordGroup as a String.
    */
    @Override
    public String toString(){
    	return "chords: " + getChordsAsString() + " size: " + size;
    }
}