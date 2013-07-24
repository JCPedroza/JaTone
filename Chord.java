import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// !!! Implement a setter that uses a method from the process class to name the chord automatically.
public class Chord extends NoteGroup{
    
    // Instance variables
    private String name;

    // Constructors
    // Accepts array or List as input, creates an ArralyList with it.
    public Chord(List<Note> newNotes, String newName){
        super(newNotes);
        name = newName;
    }
    public Chord(Note[] newNotes, String newName){
        this(new ArrayList<Note>(Arrays.asList(newNotes)), newName);
    }

    //Setters & Getters
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }

}