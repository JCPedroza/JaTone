import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoteGroup{
    
    // Instance variables
    private int        size;
    private List<Note> notes;

    // Constructor, accepts array or ArrayList of Note. Creates ArrayList if 
    // argument is an array.
    public NoteGroup(List<Note> newNotes){
        notes = newNotes;
        size  = notes.size();
    }
    public NoteGroup(Note[] newNotes){
        this(new ArrayList<Note>(Arrays.asList(newNotes)));
    }

    // Setters & Getters
    // No setter for size since it depends on List size. List notes uses
    // an add/remove note dynamic. 
    public void addNote(Note note){
        notes.add(note);
    }
    public void removeNote(Note note){
        notes.remove(note);
    }

    public int getSize(){
        return size;
    }

    public List<Note> getNotes(){
        return notes;
    } 
}