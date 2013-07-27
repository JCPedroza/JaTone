import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Scale extends NoteGroup{
	
	// Constructors
    // List, String -> Scale
    public Scale(List<Note> newNotes, String newName){
        super(newNotes, newName);
    }
    // List -> Scale
    public Scale(List<Note> newNotes){    
        super(newNotes);
    }
    // Array, String -> Scale
    public Scale(Note[] newNotes, String newName){
        super(new ArrayList<Note>(Arrays.asList(newNotes)), newName);
    }
    // Array -> Scale
    public Scale(Note[] newNotes){
        super(new ArrayList<Note>(Arrays.asList(newNotes)));
    }
}
