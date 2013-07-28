import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoteGroup{
    
	// ---------------------------------------------------------------
    // Instance variables 
    private int        size;
    private List<Note> notes;
    private String     name;
    
    // --------------------------------------------------------------- 
    // Constructor, accepts array or ArrayList of Note. Creates ArrayList if 
    // argument is an array.
    // NoteList, String -> NoteGroup
    public NoteGroup(List<Note> newNotes, String newName){
        notes = newNotes;
        size  = notes.size();
        name  = newName;
    }
    // NoteList -> NoteGroup
    public NoteGroup(List<Note> newNotes){
    	notes = newNotes;
    	size = notes.size();
    	name = makeName(notes);
    }
    // NoteArray, String -> NoteGroup
    public NoteGroup(Note[] newNotes, String newName){
        this(new ArrayList<Note>(Arrays.asList(newNotes)), newName);
    }
    // NoteArray -> NoteGroup
    public NoteGroup(Note[] newNotes){
    	this(new ArrayList<Note>(Arrays.asList(newNotes)));
    }
    // StringArray, String -> NoteGroup
    public NoteGroup(String[] newNotes, String newName){
    	List<Note> noteList = new ArrayList<Note>();
    	for (String e : newNotes){
    		noteList.add(new Note(e));
    	}
    	notes = noteList;
    	size  = notes.size();
    	name  = newName;
    }
    // StringArray -> NoteGroup
    public NoteGroup(String[] newNotes){
    	List<Note> noteList = new ArrayList<Note>();
    	for (String e : newNotes){
    		noteList.add(new Note(e));
    	}
    	notes = noteList;
    	size  = notes.size();
    	name  = makeName(notes);
    }
    
    // ---------------------------------------------------------------
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
    
    // --------------------------------------------------------------
    // Setters & Getters
    // No setter for size since it depends on List size. List notes uses
    // an add/remove note dynamic. 
    public void setName(String newName){
    	name = newName;
    }
    public String getName(){
    	return name;
    }
    
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