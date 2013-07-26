import java.util.*;

public class Process{
	
	// Used as default pool (equal temperament 12 semi-tones):
	private List<String> et12Pool   = Arrays.asList("Ab", "A", "Bb", "B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G");
	private int          et12Length = 12;
	
	// !!! Throw error when note is not found in pool
	// stepCount: returns the distance between two notes using an input pool of type List
	public int stepCount(Note note1, Note note2, List<String> pool){
	    int result = pool.indexOf(note2.getName()) - pool.indexOf(note1.getName());
		if (result > 0){
			return result;
		}
		else{
			return result + et12Length;
		}
	}
	// stepCount: overloaded: no input pool, uses default pool
	public int stepCount(Note note1, Note note2){
		return stepCount(note1, note2, et12Pool);
	}
	
	// scalize: returns a Scale object derived from the formula applied to the pool with note as root
	// !!! implement overloads for pool inputs, both array and list 
	public Scale scalize(Note note, int[] formula, List<String> pool){
	    List<Note> noteList = new ArrayList<Note>();
	    int currentIndex = pool.indexOf(note.getName());
	    for (int e : formula){
	    	noteList.add(new Note(pool.get(currentIndex)));
	    	currentIndex = (currentIndex + e) % pool.size();
	    }
	    return new Scale(noteList);  
	}
	// scalize: overloaded: array as input pull
	public Scale scalize(Note note, int[] formula, String[] pool){
	    return scalize(note, formula, new ArrayList<String>(Arrays.asList(pool)));
	}
	// scalize: overloaded: no input pool, uses default pool as input
	public Scale scalize(Note note, int[] formula){
	    return scalize(note, formula, et12Pool); 
	}
}