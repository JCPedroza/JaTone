import java.util.*;

public class ChordGroup{
	
	//===================================================================
    //                      Instance Variables
    //===================================================================
	private int         size;
	private List<Chord> chords;
	
	//===================================================================
    //                          Constructor
    //===================================================================
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
	
	//===================================================================
    //                   Special Setters & Getters
    //===================================================================
	
	// Returns names of the notes as a String
    public String getChordsAsStringArray(){
        List<String> noteList = new ArrayList<String>();
        for (Chord e : chords){
        	noteList.add(e.getName());
        }
        return Arrays.toString(noteList.toArray(new String[noteList.size()]));
    }
}