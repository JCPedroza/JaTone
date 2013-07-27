import static org.junit.Assert.*;
import java.util.*;

public class Test{
	
	// Instance variables for use with testing
	Note         aNoteA     = new Note("A", 440, 60, 1, 1, 127, 1);
	Note         aNoteC     = new Note("C", 450, 61, 2, 4, 125, 6);
	Note         aNoteE     = new Note("E", 460, 62, 3, 5, 126, 7);
	Note         aNoteG     = new Note("G", 470, 66, 6, 6, 6, 6);
	Note[]       aNoteArray = {aNoteA, aNoteC, aNoteE};
	List<Note>   aNoteList  = Arrays.asList(aNoteA, aNoteC, aNoteE);
	List<String> aPool      = Arrays.asList("A", "B", "C", "D");
	String[]     aPool2     = {"Ab", "A", "Bb", "B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G"};
	List<String> aPool3     = new ArrayList<String>(Arrays.asList(aPool2));
	Chord        aChord1    = new Chord(aNoteArray, "Am");
	Scale        aScale1    = new Scale(aNoteList, "A aeolian");
	
	// Instances
	Process      aProcess   = new Process();
	Formulas     formulas   = new Formulas();

	public void runTests(){		
		// Class Tests
		assertEquals(aNoteA.getName(), "A");
		assertEquals(aScale1.getName(), "A aeolian");
		assertEquals(aChord1.getName(), "Am");
		
		// Process Tests
		
		//stepCount()
		assertEquals(aProcess.stepCount("C","Eb"), 3);
		assertEquals(aProcess.stepCount(aNoteA, aNoteC), 3);
		assertEquals(aProcess.stepCount(aNoteG, aNoteA), 2);
		assertEquals(aProcess.stepCount("C","Eb", aPool3), 3);
		assertEquals(aProcess.stepCount("Gb", "B", aPool2), 5);
		assertEquals(aProcess.stepCount(aNoteA, aNoteC, aPool), 2);
		assertEquals(aProcess.stepCount(aNoteA, aNoteC, aPool2), 3);
        
		//scalize()
		assertEquals(Arrays.toString(aProcess.scalize(aNoteA, formulas.aeolian).getNotesAsString()),
				     Arrays.toString(new String[] {"A", "B", "C", "D", "E", "F", "G"}));
		assertEquals(Arrays.toString(aProcess.scalize(aNoteA, formulas.aeolian, aPool2).getNotesAsString()),
			         Arrays.toString(new String[] {"A", "B", "C", "D", "E", "F", "G"}));
		assertEquals(Arrays.toString(aProcess.scalize(aNoteC, formulas.ionian).getNotesAsString()),
			         Arrays.toString(new String[] {"C", "D", "E", "F", "G", "A", "B"}));
		assertEquals(Arrays.toString(aProcess.scalize(aNoteC, formulas.ionian, aPool).getNotesAsString()),
		             Arrays.toString(new String[] {"C", "A", "C", "D", "B", "D", "B"}));
		assertEquals(Arrays.toString(aProcess.scalize("F", formulas.ionian).getNotesAsString()),
				     Arrays.toString(new String[] {"F", "G", "A", "Bb", "C", "D", "E"}));
		assertEquals(Arrays.toString(aProcess.scalize("D", formulas.aeolian, aPool2).getNotesAsString()),
				     Arrays.toString(new String[] {"D", "E", "F", "G", "A", "Bb", "C"}));
		 
		
		// :D
		System.out.println("All test passed! :D");
	}
}