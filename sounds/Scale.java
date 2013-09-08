// !!! implement toStrng when this has a different variable than NoteGroup
package sounds;

import java.util.*;

/**
* Group of Note objects with melodic dynamics (like a succession of notes). 
*/ 
public class Scale extends NoteGroup{
		
	//===================================================================
    //                       Constructors
    //===================================================================
	

    public Scale(List<Note> newNotes, String newName){
        super(newNotes, newName);
    }

    public Scale(List<Note> newNotes){    
        super(newNotes);
    }

    public Scale(Note[] newNotes, String newName){
        super(new ArrayList<Note>(Arrays.asList(newNotes)), newName);
    }

    public Scale(Note[] newNotes){
        super(new ArrayList<Note>(Arrays.asList(newNotes)));
    }

    public Scale(String[] newNotes, String newName){
    	super(newNotes, newName);
    }

    public Scale(String[] newNotes){
    	super(newNotes);
    }
    
    /**
    * Copy constructor. Use this to make copies of Scale objects. 
    * @param newScale The Scale object to be copied.
    */
    public Scale(Scale newScale){
    	super(newScale);
    }
    
    //===================================================================
    //                          Special Setters
    //===================================================================
    
    /**
    * Changes the order of the notes, sending (depth) number of notes from the end of the list to
    * the start of the list. If the depth number is negative, it sends (depth) number of notes from the start
    * of the list to the end of the list.
    * @param depth Number of notes to be moved. Positive integer sends note(s) from the end of the Chord's note 
    * array to the start. Negative integer sends note(s) from the start of the Chord's note array to the end.
    */
    public void rotate(int depth){
    	rotateNotes(depth);
    }

    /**
    * Same as rotate(1).
    */
    public void rotate(){
    	rotateNotes(1);
    }
}
