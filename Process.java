// put some of these inside classes?

import java.util.*;

/**
* Contains operations.
*/
public class Process{
	
	// Used as default pool (equal temperament 12 semi-tones):
	private List<String> et12Pool   = Arrays.asList("Ab", "A", "Bb", "B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G");
	private int          et12Length = 12;
	
	// ---------------------------------------------------------------------------------------------
	// stepCount: returns the distance between two notes using an input pool of type List
	// !!! Throw error when note is not found in pool
	// ---------------------------------------------------------------------------------------------
	// stepCount: Note, Note, List -> int 

	public int stepCount(Note note1, Note note2, List<String> pool){
	    int result = pool.indexOf(note2.getName()) - pool.indexOf(note1.getName());
		if (result > 0){
			return result;
		}
		else{
			return result + et12Length;
		}
	}
	// stepCount: Note, Note -> int
	public int stepCount(Note note1, Note note2){
		return stepCount(note1, note2, et12Pool);
	}
	// stepCount: Note, Note, String[] -> int
	public int stepCount(Note note1, Note note2, String[] pool){
		return stepCount(note1, note2, new ArrayList<String>(Arrays.asList(pool)));
	}
	// stepCount: String, String -> int
	public int stepCount(String note1, String note2){
		return stepCount(new Note(note1), new Note(note2), et12Pool);
	}
	// stepCount: String, String, List -> int
	public int stepCount(String note1, String note2, List<String> pool){
		return stepCount(new Note(note1), new Note(note2), pool);
	}
	// stepCount: String, String, String[] -> int
	public int stepCount(String note1, String note2, String[] pool){
		return stepCount(new Note(note1), new Note(note2), new ArrayList<String>(Arrays.asList(pool)));
	}
	
	// ---------------------------------------------------------------------------------------------
	// scalize: returns a Scale object derived from the formula applied to the pool with note as root,
	// default pool is et12Pool. 
	// Note or String, int[], optional: List or String[] -> Scale
	// !!! throw errors: note was not found in pool
	// ---------------------------------------------------------------------------------------------
	// scalize: Note, int[], List -> Scale
	public Scale scalize(Note note, int[] formula, List<String> pool){
	    List<Note> noteList     = new ArrayList<Note>();
	    int        currentIndex = pool.indexOf(note.getName());
	    for (int e : formula){
	    	noteList.add(new Note(pool.get(currentIndex)));
	    	currentIndex = (currentIndex + e) % pool.size();
	    }
	    return new Scale(noteList);  
	}
	// scalize: Note, int[], String[] -> Scale
	public Scale scalize(Note note, int[] formula, String[] pool){
	    return scalize(note, formula, new ArrayList<String>(Arrays.asList(pool)));
	}
	// scalize: Note, int[] -> Scale
	public Scale scalize(Note note, int[] formula){
	    return scalize(note, formula, et12Pool); 
	}
	// scalize: String, int[], List -> Scale
	public Scale scalize(String note, int[] formula, List<String> pool){
		return scalize(new Note(note), formula, pool);
	}
	// scalize: String, int[], String[] -> Scale
    public Scale scalize(String note, int[] formula, String[] pool){
		return scalize(new Note(note), formula, new ArrayList<String>(Arrays.asList(pool)));
	}
	// scalize: String, int[] -> Scale
	public Scale scalize(String note, int[] formula){
		return scalize(new Note(note), formula, et12Pool);
	}
	
	// ---------------------------------------------------------------------------------------------
	// harmonize: forms chords derived from the input Scale, using superimposed thirds
	// depth 1 gives triads, depth 2 gives 7th chords, depth 3 gives 9th chords, etc
	// default depth is 1 (triad)
	// Scale or String[], int -> Harmony (a group of chords)
	// !!! should I be implementing different type of outputs depending on the input?, implement max depth? 
	// !!! can this method be refactored using recursive dynamics instead of ifs? Yes it can, do it.
	// !!! throw error if depth < 0 or > 5
	// !!! List<string> can't be implemented atm, until NoteGtoup.java can handle it
	// ---------------------------------------------------------------------------------------------
	// harmonize: Scale, int -> Harmony
	public Harmony harmonize(Scale scale, int depth) throws IllegalArgumentException{
		if (depth < 1) {
			throw new IllegalArgumentException("Input depth: " + depth + ". Min depth is 1.");
		}
		List<Chord> chordList     = new ArrayList<Chord>();
		int         scaleSize = scale.getSize();
		if (depth == 1){
			for (int e = 0; e < scaleSize; e++){
				chordList.add(new Chord( new Note[]{scale.getNotes().get(e), scale.getNotes().get((e + 2) % scaleSize), 
						                            scale.getNotes().get((e + 4) % scaleSize)}));
			}
		}
		else if (depth == 2){
			for (int e = 0; e < scaleSize; e++){
				chordList.add(new Chord( new Note[]{scale.getNotes().get(e),                   scale.getNotes().get((e + 2) % scaleSize), 
						                            scale.getNotes().get((e + 4) % scaleSize), scale.getNotes().get((e + 6) % scaleSize)}));
			}
		}
		else if (depth == 3){
			for (int e = 0; e < scaleSize; e++){
				chordList.add(new Chord( new Note[]{scale.getNotes().get(e),                   scale.getNotes().get((e + 2) % scaleSize), 
						                            scale.getNotes().get((e + 4) % scaleSize), scale.getNotes().get((e + 6) % scaleSize), 
						                            scale.getNotes().get((e + 8) % scaleSize)}));
			}
		}
		else if (depth == 4){
			for (int e = 0; e < scaleSize; e++){
				chordList.add(new Chord( new Note[]{scale.getNotes().get(e),                   scale.getNotes().get((e + 2) % scaleSize), 
						                            scale.getNotes().get((e + 4) % scaleSize), scale.getNotes().get((e + 6) % scaleSize), 
						                            scale.getNotes().get((e + 8) % scaleSize), scale.getNotes().get((e + 10) % scaleSize)}));
			}
		}
		else if (depth == 5){
			for (int e = 0; e < scaleSize; e++){
				chordList.add(new Chord( new Note[]{scale.getNotes().get(e),                   scale.getNotes().get((e + 2) % scaleSize), 
						                            scale.getNotes().get((e + 4) % scaleSize), scale.getNotes().get((e + 6) % scaleSize), 
						                            scale.getNotes().get((e + 8) % scaleSize), scale.getNotes().get((e + 10) % scaleSize),
						                            scale.getNotes().get((e + 12) % scaleSize)}));
			}
		}
		return new Harmony(chordList);
	}
	// harmonize: Scale -> Harmony
	public Harmony harmonize(Scale scale){
		return harmonize(scale, 1);
	}
    // harmonize: StringArray, int -> Harmony
	public Harmony harmonize(String[] scale, int depth){
		return harmonize(new Scale(scale), depth);
	}
	// harmonize: StringArray -> Harmony
	public Harmony harmonize(String[] scale){
		return harmonize(new Scale(scale), 1);
	}
	// harmonize: NoteList, int -> Harmony
	public Harmony harmonize(List<Note> scale, int depth){
		return harmonize(new Scale(scale), depth);
	}
	// harmonize: NoteList -> Harmony
	public Harmony harmonize(List<Note> scale){
		return harmonize(new Scale(scale), 1);
	}
	// harmonize: NoteArray, int -> Harmony
	public Harmony harmonize(Note[] scale, int depth){
		return harmonize(new Scale(scale), depth);
	}
	// harmonize: NoteArray -> Harmony
	public Harmony harmonize(Note[] scale){
		return harmonize(new Scale(scale), 1);
	}
}