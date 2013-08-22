// consider not using a Formulas class for your constants and add them to the class(es) that might need them instead, as suggested
// in: http://stackoverflow.com/questions/66066/what-is-the-best-way-to-implement-constants-in-java
// consider using other type other than primitive arrays, those can't be made not-mutable and constants need to be not-mutable
// as suggested: http://stackoverflow.com/questions/3700971/immutable-array-in-java
// you might also want to make these public if they are not implemented inside the class that needs them, as
// sugested here: http://stackoverflow.com/questions/10047802/public-static-final-or-private-static-final-with-getter
public class Formulas{
    
	//===================================================================
    //                      Instance Variables
    //===================================================================
	
    // Formulas for pentatonic scales
    private int[] MINOR_PENTATONIC = {3, 2, 2, 3, 2};  // minor pentatonic
    private int[] MAJOR_PENTATONIC = {2, 2, 3, 2, 3};  // major pentatonic
    
    // Formulas for hexatonic scales
    private int[] MINOR_BLUES          = {3, 2, 1, 1, 3, 2};  // minor blues 
    private int[] MAJOR_BLUES          = {2, 1, 1, 3, 2, 3};  // major blues
    private int[] PROMETHEUS           = {2, 2, 2, 3, 1, 2};  // prometheus - mystic
    private int[] ISTRIAN              = {1, 2, 1, 2, 1, 5};  // istrian
    private int[] WHOLE_TONE           = {2, 2, 2, 2, 2, 2};  // whole tone
    private int[] AUGMENTED            = {3, 1, 3, 1, 3, 1};  // augmented - symmetrical augmented
    private int[] TRITONE              = {1, 3, 2, 1, 3, 2};  // tritone 
    private int[] TWO_SEMITONE_TRITONE = {1, 1, 4, 1, 1, 4};  // two semitone tritone 
    
    // Major derived formulas
    private int[] LYDIAN     = {2, 2, 2, 1, 2, 2, 1};  // lydian
    private int[] IONIAN     = {2, 2, 1, 2, 2, 2, 1};  // ionian - major
    private int[] MIXOLYDIAN = {2, 2, 1, 2, 2, 1, 2};  // mixolydian
    private int[] DORIAN     = {2, 1, 2, 2, 2, 1, 2};  // dorian
    private int[] AEOLIAN    = {2, 1, 2, 2, 1, 2, 2};  // aeolian - minor
    private int[] PHRYGIAN   = {1, 2, 2, 2, 1, 2, 2};  // phrygian
    private int[] LOCRIAN    = {1, 2, 2, 1, 2, 2, 2};  // locrian
    
    // Melodic minor derived formulas
    private int[] MELODIC_MINOR     = {2, 1, 2, 2, 2, 2, 1}; // melodic minor
    private int[] DORIAN_FLAT9      = {1, 2, 2, 2, 2, 1, 2}; // dorian flat 9
    private int[] LYDIAN_AUGMENTED  = {2, 2, 2, 2, 1, 2, 1}; // lydian augmented
    private int[] LYDIAN_FLAT7      = {2, 2, 2, 1, 2, 1, 2}; // lydian flat 7
    private int[] MIXOLYDIAN_FLAT13 = {2, 2, 1, 2, 1, 2, 2}; // mixolydian flat 13
    private int[] SEMI_LOCRIAN      = {2, 1, 2, 1, 2, 2, 2}; // semilocrian
    private int[] SUPER_LOCRIAN     = {1, 2, 1, 2, 2, 2, 2}; // superlocrian
    
    // Harmonic minor derived formulas
    private int[] HARMONIC_MINOR   = {2, 1, 2, 2, 1, 3, 1}; // harmonic minor
    private int[] LOCRIAN_SHARP7   = {1, 2, 2, 1, 3, 1, 2}; // locrian sharp 7
    private int[] IONIAN_AUGMENTED = {2, 2, 1, 3, 1, 2, 1}; // ionian augmented
    
    //===================================================================
    //                            Getters 
    //===================================================================
    
    // Getters for pentatonic scale formulas
    public int[] getMinorPentatonic(){
    	return MINOR_PENTATONIC;
    }
    public int[] getMajorPentatonic(){
    	return MAJOR_PENTATONIC;
    }
    
    // Getters for hexatonic scale formulas
    public int[] getMinBlues(){
    	return MINOR_BLUES;
    }
    public int[] getMajBlues(){
    	return MAJOR_BLUES;
    }
    public int[] getTritone(){
    	return TRITONE;
    }
    public int[] getAugmented(){
    	return AUGMENTED;
    }
    public int[] getIstrian(){
    	return ISTRIAN;
    }
    public int[] getWholeTone(){
    	return WHOLE_TONE;
    }
    public int[] getPrometheus(){
    	return PROMETHEUS;
    }
    public int[] getTwoSemitoneTritone(){
    	return TWO_SEMITONE_TRITONE;
    }
    
    // Getters for melodic minor derived formulas
    public int[] getMelodicMinor(){
    	return MELODIC_MINOR;
    }
    public int[] getDorianFlat9(){
    	return DORIAN_FLAT9;
    }
    public int[] getLydianAugmented(){
    	return LYDIAN_AUGMENTED;
    }
    public int[] getLydianFlat7(){
    	return LYDIAN_FLAT7;
    }
    public int[] getMixolydianFlat13(){
    	return MIXOLYDIAN_FLAT13;
    }
    public int[] getSemiLocrian(){
    	return SEMI_LOCRIAN;
    }
    public int[] getSuperLocrian(){
    	return SUPER_LOCRIAN;
    }
    
    // Getters for major derived formulas
    public int[] getLydian(){
    	return LYDIAN;
    }
    public int[] getIonian(){
    	return IONIAN;
    }
    public int[] getMixolydian(){
    	return MIXOLYDIAN;
    }
    public int[] getDorian(){
    	return DORIAN;
    }
    public int[] getAeolian(){
    	return AEOLIAN;
    }
    public int[] getPhrygian(){
    	return PHRYGIAN;
    }
    public int[] getLocrian(){
    	return LOCRIAN;
    }
    
    // Getters for harmonic minor derived formulas
    public int[] getHarmonicMinor(){
    	return HARMONIC_MINOR;
    }
    public int[] getLocrianSharp7(){
    	return LOCRIAN_SHARP7;
    }
    public int[] getIonianAugmented(){
    	return IONIAN_AUGMENTED;
    }
   
}