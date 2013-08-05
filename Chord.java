import java.util.*;

public class Chord extends NoteGroup{
    
	//===================================================================
    //                       Constructors
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
    //Copy constructor
    // Chord -> Chord
    public Chord(Chord newChord){
    	super(newChord);
    }
    
    //===================================================================
    //                          Special Setters
    //===================================================================
    
    // Inversions
    // invert(): Rotates the order of the notes. 1 puts the first note of the list in the last spot of the list, 2
    // puts the first two notes of the list in the last spots of the list, and so on. Negative parameter does the 
    // opposite, putting n items from the last spots of the list to the front.
    public void invert(int n){
    	rotateNotes(n);
    }
    // invert(): No argument case, default value is 1
    public void invert(){
    	rotateNotes(1);
    }
    // firstInversion(): changes the order of notes, and builds the first inversion of the chord based on 
    // originalNotes.
    public void firstInversion(){
    	setNotes(new ArrayList<Note>(getOriginalNotes()));
    	rotateNotes(1);
    }
    // secondInversion(): changes the order of notes, and builds the second inversion of the chord based on 
    // originalNotes.
    public void secondInversion(){
    	setNotes(new ArrayList<Note>(getOriginalNotes()));
    	rotateNotes(2);
    }
    // thirdInversion(): changes the order of notes, and builds the second inversion of the chord based on 
    // originalNotes.
    public void thirdInversion(){
    	setNotes(new ArrayList<Note>(getOriginalNotes()));
    	rotateNotes(3);
    }
    // fourthInversion(): changes the order of notes, and builds the second inversion of the chord based on 
    // originalNotes.
    public void fourthInversion(){
    	setNotes(new ArrayList<Note>(getOriginalNotes()));
    	rotateNotes(4);
    }
    
}