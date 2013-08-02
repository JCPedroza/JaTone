import java.util.*;

public class Scale extends NoteGroup{
	
	//===================================================================
    //                       Constructors
    //===================================================================
	
    // NoteList, String -> Scale
    public Scale(List<Note> newNotes, String newName){
        super(newNotes, newName);
    }
    // NoteList -> Scale
    public Scale(List<Note> newNotes){    
        super(newNotes);
    }
    // NoteArray, String -> Scale
    public Scale(Note[] newNotes, String newName){
        super(new ArrayList<Note>(Arrays.asList(newNotes)), newName);
    }
    // NoteArray -> Scale
    public Scale(Note[] newNotes){
        super(new ArrayList<Note>(Arrays.asList(newNotes)));
    }
    // StringArray, String -> Scale
    public Scale(String[] newNotes, String newName){
    	super(newNotes, newName);
    }
    // StringArray -> Scale
    public Scale(String[] newNotes){
    	super(newNotes);
    }
    // Copy constructor
    public Scale(Scale newScale){
    	super(newScale);
    }
}
