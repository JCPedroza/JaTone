import java.util.*;


// !!! needs to implement a constructor for List<string>, not possible atm
// is using a generic List as input and then filtering the type on the 
// same constructor the solution?
public class NoteGroup{
    
	//===================================================================
    //                      Instance Variables
    //===================================================================
    private int        size;
    private List<Note> notes;
    private List<Note> originalNotes;
    private String     name;
    private String     secondaryName; 
    
    //===================================================================
    //                          Constructors
    //===================================================================
    
    // Copy constructor
    // NoteGroup -> NoteGroup
    public NoteGroup(NoteGroup newNoteGroup){
        this(newNoteGroup.getNotes(), newNoteGroup.getName());
        secondaryName = newNoteGroup.getSecondaryName();
    }
    // NoteList, String -> NoteGroup
    public NoteGroup(List<Note> newNotes, String newName){
        notes         = new ArrayList<Note>(newNotes);
        size          = notes.size();
        name          = newName;
        // originalNotes creates a copy of newNotes to keep as reference
        originalNotes = new ArrayList<Note>(newNotes);
    }
    // NoteList -> NoteGroup
    public NoteGroup(List<Note> newNotes){
    	notes         = new ArrayList<Note>(newNotes);
    	size          = notes.size();
    	name          = makeName(notes);
    	originalNotes = new ArrayList<Note>(newNotes);
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
    	originalNotes = new ArrayList<Note>(noteList);
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
    	originalNotes = new ArrayList<Note>(noteList);
    }
    
    
    //===================================================================
    //                             Methods
    //===================================================================
    
    // creates a name for the chord based on its notes, changes and returns the name
    // makeName: List<Note> -> String
    public String makeName(List<Note> noteList){
        String returnString = "";
        for (Note e : noteList){
        	returnString += e.getName();
        }
        return returnString;
    }
    
    //===================================================================
    //                            Setters 
    //===================================================================
    // No setter for size since it depends on List size. List notes uses
    // an add/remove note dynamic. 
    public void setNotes(List<Note> newNotes){
    	notes = newNotes;
    	size  = newNotes.size();
    }
    
    // Collections.rotate() caller for subclasses
    public void rotateNotes(int index){
    	Collections.rotate(notes, index);
    }
    
    public void setName(String newName){
    	name = newName;
    }
    
    public void setSecondaryName(String newSecondaryName){
    	secondaryName = newSecondaryName;
    }
    
    public void addNote(Note note){
        notes.add(note);
        size++;
    }
    
    public void removeNote(Note note){
        notes.remove(note);
        size--;
    }
    //===================================================================
    //                            Getters 
    //===================================================================
    public List<Note> getNotes(){
        return notes;
    } 
    
    public List<Note> getOriginalNotes(){
    	return originalNotes;
    }
    
    public String getName(){
    	return name;
    }
    
    public String getSecondaryName(){
    	return secondaryName;
    }
    
    public int getSize(){
        return size;
    }
    
    //===================================================================
    //                   Special Setters & Getters
    //===================================================================
    
    // getNotesAsString(): -> String
    // Returns names of the notes as a String
    public String getNotesAsString(){
        List<String> noteNames = new ArrayList<String>();
        for (Note e : notes){
        	noteNames.add(e.getName());
        }
        return Arrays.toString(noteNames.toArray(new String[noteNames.size()]));
    }
    
    // getOriginalNotesAsString(): -> String
    // Returns names of originalNotes as a String
    public String getOriginalNotesAsString(){
        List<String> noteNames = new ArrayList<String>();
        for (Note e : originalNotes){
        	noteNames.add(e.getName());
        }
        return Arrays.toString(noteNames.toArray(new String[noteNames.size()]));
    }
    
}