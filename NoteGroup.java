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

    // Setters & Getters
    // No setter for size since it depends on List size. List notes uses
    // an add/remove note dynamic. 
    public void addNote(Note note){
        notes.add(note);
        size++;
    }
    public void removeNote(Note note){
        notes.remove(note);
        size--;
    }

    public int getSize(){
        return size;
    }

    public List<Note> getNotes(){
        return notes;
    } 
    
    // Return an array of strings with the names of the notes
    public String[] getNotesAsStringArray(){
        List<String> noteList = new ArrayList<String>();
        for (Note e : notes){
        	noteList.add(e.getName());
        }
        return noteList.toArray(new String[noteList.size()]);
    }
}