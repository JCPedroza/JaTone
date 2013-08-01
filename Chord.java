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
    //                          Special Setters
    //===================================================================
    
    // Inversions
    // invert(): int -> void 
    // Rotates the order of the notes. 1 puts the first note of the list in the last spot of the list, 2
    // puts the first two notes of the list in the last spots of the list, and so on.
    public void invert(int n){
    	rotateNotes(n);
    }
    // invert(): -> void
    // No argument case, default value is 1
    public void invert(){
    	rotateNotes(1);
    }
    
}