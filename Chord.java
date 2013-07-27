import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// !!! Implement a setter that uses a method from the process class to name the chord automatically.
public class Chord extends NoteGroup{
    
    // Instance variables
    private String name;

    // Constructors
    // List, String -> Chord
    public Chord(List<Note> newNotes, String newName){
        super(newNotes);
        name = newName;
    }
    // List -> Chord
    public Chord(List<Note> newNotes){    
        super(newNotes);
        name = makeName(newNotes);
    }
    // Array, String -> Chord
    public Chord(Note[] newNotes, String newName){
        this(new ArrayList<Note>(Arrays.asList(newNotes)), newName);
    }
    // Array -> Chord
    public Chord(Note[] newNotes){
        this(new ArrayList<Note>(Arrays.asList(newNotes)));
    }

    //Setters & Getters
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }

}