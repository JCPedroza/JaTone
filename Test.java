import static org.junit.Assert.*;
import java.util.*;

public class Test{
	
	// Instance variables for use with testing
	Note         aNoteA       = new Note("A", 440, 60, 1, 1, 127, 1);
	Note         aNoteB       = new Note("B", 440, 60, 1, 1, 127, 1);
	Note         aNoteC       = new Note("C", 450, 61, 2, 4, 125, 6);
	Note         aNoteD       = new Note("D", 440, 60, 1, 1, 127, 1);
	Note         aNoteE       = new Note("E", 460, 62, 3, 5, 126, 7);
	Note         aNoteF       = new Note("F", 440, 60, 1, 1, 127, 1);
	Note         aNoteG       = new Note("G", 470, 66, 6, 6, 6, 6);
	Note[]       aNoteArray   = {aNoteA, aNoteC, aNoteE};
	Note[]       aNoteArray2  = {aNoteA, aNoteB, aNoteC, aNoteD, aNoteE, aNoteF, aNoteG};
	String[]     aStrNoteA    = {"A", "B", "C", "D", "E", "F", "G"};
	List<Note>   aNoteList    = Arrays.asList(aNoteA, aNoteC, aNoteE);
	List<Note>   aNoteList2   = Arrays.asList(aNoteA, aNoteB, aNoteC, aNoteD, aNoteE, aNoteF, aNoteG);
	List<Note>   aNoteList3   = Arrays.asList(aNoteC, aNoteE, aNoteG);
	List<String> aPool        = Arrays.asList("A", "B", "C", "D");
	String[]     aPool2       = {"Ab", "A", "Bb", "B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G"};
	List<String> aPool3       = new ArrayList<String>(Arrays.asList(aPool2));
	Chord        aChord1      = new Chord(aNoteArray, "Am");
	Chord        aChord2      = new Chord(aNoteArray);
	Chord        aChord3      = new Chord(aNoteList3);
	Scale        aScale1      = new Scale(aNoteList, "A aeolian");
	Scale        aScale2      = new Scale(aNoteList);
	Scale        aScale3      = new Scale(aNoteArray);
	Scale        aScale4      = new Scale(aStrNoteA);
	List<Chord>  aChList      = new ArrayList<Chord>(Arrays.asList(aChord1, aChord2));
	ChordGroup   aChG1        = new ChordGroup(aChList);
	// Instances
	Process      aProcess   = new Process();
	Formulas     formulas   = new Formulas();

	public void runTests(){		
		// Class Tests ---------------------------------
		assertEquals(aNoteA.getName(), "A");
		assertEquals(aScale1.getName(), "A aeolian");
		assertEquals(aChord1.getName(), "Am");
		assertEquals(aChord2.getName(), "ACE");
		assertEquals(aScale2.getName(), "ACE");
		assertEquals(aScale3.getName(), "ACE");
	    assertEquals(aScale4.getName(), "ABCDEFG");
		assertEquals(Arrays.toString(aChG1.getChordsAsStringArray()), Arrays.toString(new String[] {"Am", "ACE"}));
		// Chord invert() and NoteGoup rotateNotes(): aChord3 initial state = C E G
		aChord3.invert();
		System.out.println(Arrays.toString(aChord3.getNotesAsStringArray()));
		
		// Process Tests -------------------------------
		
		// stepCount()
		assertEquals(aProcess.stepCount("C","Eb"), 3);
		assertEquals(aProcess.stepCount(aNoteA, aNoteC), 3);
		assertEquals(aProcess.stepCount(aNoteG, aNoteA), 2);
		assertEquals(aProcess.stepCount("C","Eb", aPool3), 3);
		assertEquals(aProcess.stepCount("Gb", "B", aPool2), 5);
		assertEquals(aProcess.stepCount(aNoteA, aNoteC, aPool), 2);
		assertEquals(aProcess.stepCount(aNoteA, aNoteC, aPool2), 3);

        
		// scalize()
		assertEquals(Arrays.toString(aProcess.scalize(aNoteA, formulas.aeolian).getNotesAsStringArray()),
				     Arrays.toString(new String[] {"A", "B", "C", "D", "E", "F", "G"}));
		assertEquals(Arrays.toString(aProcess.scalize(aNoteA, formulas.aeolian, aPool2).getNotesAsStringArray()),
			         Arrays.toString(new String[] {"A", "B", "C", "D", "E", "F", "G"}));
		assertEquals(Arrays.toString(aProcess.scalize(aNoteC, formulas.ionian).getNotesAsStringArray()),
			         Arrays.toString(new String[] {"C", "D", "E", "F", "G", "A", "B"}));
		assertEquals(Arrays.toString(aProcess.scalize(aNoteC, formulas.ionian, aPool).getNotesAsStringArray()),
		             Arrays.toString(new String[] {"C", "A", "C", "D", "B", "D", "B"}));
		assertEquals(Arrays.toString(aProcess.scalize("F", formulas.ionian).getNotesAsStringArray()),
				     Arrays.toString(new String[] {"F", "G", "A", "Bb", "C", "D", "E"}));
		assertEquals(Arrays.toString(aProcess.scalize("D", formulas.aeolian, aPool2).getNotesAsStringArray()),
				     Arrays.toString(new String[] {"D", "E", "F", "G", "A", "Bb", "C"}));
		
		// harmonize() & scalize()
		assertEquals(Arrays.toString(aProcess.harmonize(aProcess.scalize(aNoteA, formulas.aeolian)).getChordsAsStringArray()), 
				     Arrays.toString(new String[] {"ACE", "BDF", "CEG", "DFA", "EGB", "FAC", "GBD"}));
		assertEquals(Arrays.toString(aProcess.harmonize(aProcess.scalize(aNoteC, formulas.ionian), 2).getChordsAsStringArray()), 
				     Arrays.toString(new String[] {"CEGB", "DFAC", "EGBD", "FACE", "GBDF", "ACEG", "BDFA"}));
		assertEquals(Arrays.toString(aProcess.harmonize(aProcess.scalize(aNoteC, formulas.ionian), 3).getChordsAsStringArray()),
				     Arrays.toString(new String[] {"CEGBD", "DFACE", "EGBDF", "FACEG", "GBDFA", "ACEGB", "BDFAC"}));
		assertEquals(Arrays.toString(aProcess.harmonize(aProcess.scalize(aNoteC, formulas.ionian), 4).getChordsAsStringArray()),
			         Arrays.toString(new String[] {"CEGBDF", "DFACEG", "EGBDFA", "FACEGB", "GBDFAC", "ACEGBD", "BDFACE"}));
		assertEquals(Arrays.toString(aProcess.harmonize(aProcess.scalize(aNoteC, formulas.ionian), 5).getChordsAsStringArray()),
		             Arrays.toString(new String[] {"CEGBDFA", "DFACEGB", "EGBDFAC", "FACEGBD", "GBDFACE", "ACEGBDF", "BDFACEG"}));
		// harmonize()
		assertEquals(Arrays.toString(aProcess.harmonize(aStrNoteA).getChordsAsStringArray()), 
				     Arrays.toString(new String[] {"ACE", "BDF", "CEG", "DFA", "EGB", "FAC", "GBD"}));
		assertEquals(Arrays.toString(aProcess.harmonize(aNoteList2).getChordsAsStringArray()),
				     Arrays.toString(new String[] {"ACE", "BDF", "CEG", "DFA", "EGB", "FAC", "GBD"}));
		assertEquals(Arrays.toString(aProcess.harmonize(aNoteList2, 2).getChordsAsStringArray()),
			         Arrays.toString(new String[] {"ACEG", "BDFA", "CEGB", "DFAC", "EGBD", "FACE", "GBDF"}));
		assertEquals(Arrays.toString(aProcess.harmonize(aNoteArray2, 2).getChordsAsStringArray()),
		             Arrays.toString(new String[] {"ACEG", "BDFA", "CEGB", "DFAC", "EGBD", "FACE", "GBDF"}));
		assertEquals(Arrays.toString(aProcess.harmonize(aNoteArray2).getChordsAsStringArray()),
		             Arrays.toString(new String[] {"ACE", "BDF", "CEG", "DFA", "EGB", "FAC", "GBD"}));
		

		// :D
		System.out.println("All test passed! :D :D :D");
	}
}