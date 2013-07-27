import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Scale extends NoteGroup{
	// Instance variables
    private String name;

    // Constructors
    // Accepts array or List as input, creates an ArralyList with it.
    public Scale(List<Note> newNotes, String newName){
        super(newNotes);
        name = newName;
    }
    public Scale(List<Note> newNotes){    
        super(newNotes);
        name = makeName(newNotes);
    }
    public Scale(Note[] newNotes, String newName){
        this(new ArrayList<Note>(Arrays.asList(newNotes)), newName);
    }
    public Scale(Note[] newNotes){
    	this(new ArrayList<Note>(Arrays.asList(newNotes)));
    }
  
    // Methods
    
    // creates a name for the chord based on its notes, changes and returns the name
    // makeName: List<Note> -> String
    public String makeName(List<Note> noteList){
        String returnString = "";
        for (Note e : noteList){
        	returnString += e.getName();
        }
        return returnString;
    }

    //Setters & Getters
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
}
