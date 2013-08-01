import java.util.*;

public class Chord extends NoteGroup{
    
	//===================================================================
    //                       Constructor
    //===================================================================
	
    // NoteList, String -> Chord
    public Chord(List<Note> newNotes, String newName){
        super(newNotes, newName);
    }
    // NoteList -> Chord
    public Chord(List<Note> newNotes){    
        super(newNotes);
    }
    // NoteArray, String -> Chord
    public Chord(Note[] newNotes, String newName){
        super(new ArrayList<Note>(Arrays.asList(newNotes)), newName);
    }
    // NoteArray -> Chord
    public Chord(Note[] newNotes){
        super(new ArrayList<Note>(Arrays.asList(newNotes)));
    }
    // StringArray, String -> Chord
    public Chord(String[] newNotes, String newName){
    	super(newNotes, newName);
    }
    // StringArray -> Chord
    public Chord(String[] newNotes){
    	super(newNotes);
    }
    
    //===================================================================
    //                          Methods
    //===================================================================
    
    // Inversions
    // invert(): inverts the chord one time
    public void invert(){
    	rotateNotes(1);
    }
    
}