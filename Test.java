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
	Chord        aChord1    = new Chord(aNoteArray, "Am");
	Scale        aScale1    = new Scale(aNoteList, "A aeolian");
	
	// Process instance
	Process    aProcess   = new Process();

	public void runTests(){		
		// Class Tests
		assertEquals(aNoteA.getName(), "A");
		assertEquals(aScale1.getName(), "A aeolian");
		assertEquals(aChord1.getName(), "Am");
		
		// Process Tests
		
		//stepCount()
		assertEquals(aProcess.stepCount(aNoteA, aNoteC), 3);
		assertEquals(aProcess.stepCount(aNoteG, aNoteA), 2);
		assertEquals(aProcess.stepCount(aNoteA, aNoteC, aPool), 2);
	}
}