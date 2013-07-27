import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Chord extends NoteGroup{
    
    // Constructors
    // List, String -> Chord
    public Chord(List<Note> newNotes, String newName){
        super(newNotes, newName);
    }
    // List -> Chord
    public Chord(List<Note> newNotes){    
        super(newNotes);
    }
    // Array, String -> Chord
    public Chord(Note[] newNotes, String newName){
        super(new ArrayList<Note>(Arrays.asList(newNotes)), newName);
    }
    // Array -> Chord
    public Chord(Note[] newNotes){
        super(new ArrayList<Note>(Arrays.asList(newNotes)));
    }
}