

import java.util.*;

// !!! needs to implement a constructor for List<string>, not possible atm
// is using a generic List as input and then filtering the type on the 
// same constructor the solution?
/**
* Superclass that represents a group of notes, like a chord or a scale.
*/
public class NoteGroup{
    
	//===================================================================
    //                      Instance Variables
    //===================================================================
	
	/**
	* The number of notes in the NoteGroup.
	*/
    private int        size;
    
    /**
    * List of the notes in the NoteGroup.
    */
    private List<Note> notes;
    
    /**
    * List of the original notes the NoteGroup was created with, in the original order. This is a reference for dynamics like
    * applying inversion to the original state of the NoteGroup (as opposed to the current state of the NoteGroup), or reseting 
    * the NoteGroup to its original state.  
    */
    private List<Note> originalNotes;
    
    /**
    * The name of the NoteGroup. It's recommended to use this field as the dynamic name field. You might want to change the name of 
    * the NoteGroup as its notes and their order change, forming different chords, scales, etc.
    */
    private String     name;
    
    /**
    * The secondary name of the NoteGroup. It's recommended to use this field as the static, or "not-so-dynamic", name field. You
    * might want to keep the object with a secondary name that doesn't change, while the name changes dynamically.
    */
    private String     secondaryName; 
    
    //===================================================================
    //                          Constructors
    //===================================================================
    
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

    // NoteGroup -> NoteGroup
    /**
    * Copy constructor. Use this to make copies of NoteGroup objects. 
    * @param newNoteGroup The NoteGroup object to be copied.
    * @return A copy of the input object.
    */
    public NoteGroup(NoteGroup newNoteGroup){
        this(newNoteGroup.getNotes(), newNoteGroup.getName());
        secondaryName = newNoteGroup.getSecondaryName();
    }
    
    
    //===================================================================
    //                             Methods
    //===================================================================
     
    /**
    * Creates a name for the chord based on its notes, changes and returns the name. It's used to automatically
    * give the NoteGroup a name when no name is specified. 
    * @param noteList List with Note objects.
    * @return String with the names of the Note objects.
    */
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
    //                       Special Setters
    //===================================================================
    
    /**
    * Resets the position and members of the notes List to their original state, using originalNotes as reference.
    */
    public void reset(){
    	notes = new ArrayList<Note>(originalNotes);
    }
    
    /**
     * Collections.rotate() caller for subclasses.
     * @param distance The distance to rotate the List.
     */
     public void rotateNotes(int distance){
     	Collections.rotate(notes, distance);
     }
     
    //===================================================================
    //                       Special Getters
    //===================================================================
    
    /**
    * Builds a string with the names of the Note objects.
    * @return A string with the name of the Note objects. 
    */
    public String getNotesAsString(){
        List<String> noteNames = new ArrayList<String>();
        for (Note e : notes){
        	noteNames.add(e.getName());
        }
        return Arrays.toString(noteNames.toArray(new String[noteNames.size()]));
    }
    
    /**
    * Builds a string with the names of the Note objects in the originalNotes List. 
    * @return A string with the name of the Note objects in the originalNotes List. 
    */
    public String getOriginalNotesAsString(){
        List<String> noteNames = new ArrayList<String>();
        for (Note e : originalNotes){
        	noteNames.add(e.getName());
        }
        return Arrays.toString(noteNames.toArray(new String[noteNames.size()]));
    }
    
    @Override
    public String toString(){
    	return "size: "  + size + " notes: "         + getNotesAsString() + " originalNotes: " + getOriginalNotesAsString() +
    			"name: " + name + " secondaryName: " + secondaryName;
    }
}