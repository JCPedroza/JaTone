import java.util.*;

public class ChordGroup{
	
	//===================================================================
    //                      Instance Variables
    //===================================================================
	
	private int         size;
	private List<Chord> chords;
	
	//===================================================================
    //                        Constructors
    //===================================================================
	
	public ChordGroup(List<Chord> newChordList){
	    chords = newChordList;
	    size   = chords.size();
	}
	
	/**
   	* Copy constructor. Use this to make copies of ChordGroup objects. 
    * @param newChordGroup The ChordGroup object to be copied.
    */
	public ChordGroup(ChordGroup newChordGroup){
		this(newChordGroup.getChords());
	}
	
	//===================================================================
    //                          Setters
    //===================================================================
	
	public int getSize(){
		return size;
	}
	
	//===================================================================
    //                            Getters 
    //===================================================================
	
	public List<Chord> getChords(){
		return chords;
	}
	
	//===================================================================
    //                       Special Getters
    //===================================================================
	
	// Returns names of the chords as a String
    public String getChordsAsString(){
        List<String> noteList = new ArrayList<String>();
        for (Chord e : chords){
        	noteList.add(e.getName());
        }
        return Arrays.toString(noteList.toArray(new String[noteList.size()]));
    }
}