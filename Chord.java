// !!! implement toStrng when this has a different variable than NoteGroup

import java.util.*;

/**
* Group of Note objects with harmonic dynamics (notes that sound at the same time). 
*/ 
public class Chord extends NoteGroup{
    
	//===================================================================
    //                         Constructors
    //===================================================================
	
    
    public Chord(List<Note> newNotes, String newName){
        super(newNotes, newName);
    }
    
    public Chord(List<Note> newNotes){    
        super(newNotes);
    }
    
    public Chord(Note[] newNotes, String newName){
        super(new ArrayList<Note>(Arrays.asList(newNotes)), newName);
    }
    
    public Chord(Note[] newNotes){
        super(new ArrayList<Note>(Arrays.asList(newNotes)));
    }
    
    public Chord(String[] newNotes, String newName){
    	super(newNotes, newName);
    }
    
    public Chord(String[] newNotes){
    	super(newNotes);
    }
    
    /**
    * Copy constructor. Use this to make copies of Chord objects. 
    * @param newChord The Chord object to be copied.
    */
    public Chord(Chord newChord){
    	super(newChord);
    }
    
    //===================================================================
    //                          Special Setters
    //===================================================================
    
    // ============
    // Inversions
    // ============
    
    /**
    * Changes the order of the notes, sending (depth) number of notes from the end of the list to
    * the start of the list. If the depth number is negative, it sends (depth) number of notes from the start
    * of the list to the end of the list.
    * invert(1); builds the first inversion of the current position of notes, invert(2) the second inversion,
    * invert(-1) goes back one inversion, and so on. The important difference between this and xInversion
    * is that xInversion works based on originalNotes, so it ignores the current order of notes.
    * Example: invert(1) applied to a A C E chord = E A C and invert(-1) applied to a A C E chord = C E A.
    * @param depth Number of notes to be moved. Positive integer sends note(s) from the end of the Chord's note 
    * array to the start. Negative integer sends note(s) from the start of the Chord's note array to the end.
    */
    public void invert(int depth){
    	rotateNotes(depth);
    }
    
    /**
    * Same as invert(1).
    */
    public void invert(){
    	rotateNotes(1);
    }
    
    /**
    * Changes the order of notes, building the first inversion of the chord, using originalNotes array as 
    * reference (it doesn't take the current state of the note array as reference).
    */
    public void firstInversion(){
    	setNotes(new ArrayList<Note>(getOriginalNotes()));
    	rotateNotes(1);
    }
    
    /**
    * Changes the order of notes, building the second inversion of the chord, using originalNotes array as 
    * reference (it doesn't take the current state of the note array as reference).
    */
    public void secondInversion(){
    	setNotes(new ArrayList<Note>(getOriginalNotes()));
    	rotateNotes(2);
    }
    
    /**
    * Changes the order of notes, building the third inversion of the chord, using originalNotes array as 
    * reference (it doesn't take the current state of the note array as reference).
    */
    public void thirdInversion(){
    	setNotes(new ArrayList<Note>(getOriginalNotes()));
    	rotateNotes(3);
    }
    
    /**
    * Changes the order of notes, building the fourth inversion of the chord, using originalNotes array as 
    * reference (it doesn't take the current state of the note array as reference).
    */
    public void fourthInversion(){
    	setNotes(new ArrayList<Note>(getOriginalNotes()));
    	rotateNotes(4);
    }
    
}