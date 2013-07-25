import java.util.*;

public class Process{
	
	// Used as default pool (equal temperament 12 semi-tones):
	private List<String> et12Pool   = Arrays.asList("Ab", "A", "Bb", "B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G");
	private int          et12Length = 12;
	
	// stepCount: returns the distance between two notes using default pool
	public int stepCount(Note note1, Note note2){
		int result = et12Pool.indexOf(note2.getName()) - et12Pool.indexOf(note1.getName());
		if (result > 0){
			return result;
		}
		else{
			return result + et12Length;
		}
	}
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
	
	
}