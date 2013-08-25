// !!! implement toStrng when this has a different variable than NoteGroup

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
    // Copy constructor
    // Chord -> Chord
    public Chord(Chord newChord){
    	super(newChord);
    }
    
    //===================================================================
    //                          Special Setters
    //===================================================================
    
    // Inversions
    // invert(): changes the order of the notes, sending (depth) number of notes from the end of the list to
    // the start of the list. If the depth number is negative, it sends (depth) number of notes from the start
    // of the list to the end of the list.
    // invert(1); builds the first inversion of the current position of notes, invert(2) the second inversion,
    // invert(-1) goes back one inversion, and so on. The important difference between this and xInversion 
    // is that xInversion works based on originalNotes, so it ignores the current order of notes.
    public void invert(int depth){
    	rotateNotes(depth);
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
    // noInversion: changes the order of notes, builds the original order of the chord
    public void noInversion(){
    	setNotes(new ArrayList<Note>(getOriginalNotes()));
    }
    
}