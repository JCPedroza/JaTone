// !!! getters

public class Formulas{
    
	//===================================================================
    //                      Instance Variables
    //===================================================================
	
    // Formulas for pentatonic scales
    private int[] pentmin = {3, 2, 2, 3, 2};  // minor pentatonic
    private int[] pentmaj = {2, 2, 3, 2, 3};  // major pentatonic
    
    // Formulas for hexatonic scales
    private int[] minblues   = {3, 2, 1, 1, 3, 2};  // minor blues 
    private int[] majblues   = {2, 1, 1, 3, 2, 3};  // major blues
    private int[] prometheus = {2, 2, 2, 3, 1, 2};  // prometheus - mystic
    private int[] istrian    = {1, 2, 1, 2, 1, 5};  // istrian
    private int[] wholetone  = {2, 2, 2, 2, 2, 2};  // whole tone
    private int[] augmented  = {3, 1, 3, 1, 3, 1};  // augmented - symmetrical augmented
    private int[] tritone    = {1, 3, 2, 1, 3, 2};  // tritone 
    private int[] twosemitri = {1, 1, 4, 1, 1, 4};  // two semitone tritone 
    
    // Major derived formulas
    private int[] lydian     = {2, 2, 2, 1, 2, 2, 1};  // lydian
    private int[] ionian     = {2, 2, 1, 2, 2, 2, 1};  // ionian - major
    private int[] mixolydian = {2, 2, 1, 2, 2, 1, 2};  // mixolydian
    private int[] dorian     = {2, 1, 2, 2, 2, 1, 2};  // dorian
    private int[] aeolian    = {2, 1, 2, 2, 1, 2, 2};  // aeolian - minor
    private int[] phrygian   = {1, 2, 2, 2, 1, 2, 2};  // phrygian
    private int[] locrian    = {1, 2, 2, 1, 2, 2, 2};  // locrian
    
    // Melodic minor derived formulas
    private int[] melodicmin   = {2, 1, 2, 2, 2, 2, 1}; // melodic minor
    private int[] dorianb9     = {1, 2, 2, 2, 2, 1, 2}; // dorian flat 9
    private int[] lydianaug    = {2, 2, 2, 2, 1, 2, 1}; // lydian augmented
    private int[] lydianb7     = {2, 2, 2, 1, 2, 1, 2}; // lydian flat 7
    private int[] mixob13      = {2, 2, 1, 2, 1, 2, 2}; // mixolydian flat 13
    private int[] semilocrian  = {2, 1, 2, 1, 2, 2, 2}; // semilocrian
    private int[] superlocrian = {1, 2, 1, 2, 2, 2, 2}; // superlocrian
    
    // Harmonic minor derived formulas
    private int[] harmmin    = {2, 1, 2, 2, 1, 3, 1}; // harmonic minor
    private int[] locriansh7 = {1, 2, 2, 1, 3, 1, 2}; // locrian sharp 7
    private int[] ionianaug  = {2, 2, 1, 3, 1, 2, 1}; // ionian augmented
    
    //===================================================================
    //                            Getters 
    //===================================================================
    
    // Getters for major derived formulas
    public int[] getLydian(){
    	return lydian;
    }
    public int[] getIonian(){
    	return ionian;
    }
    public int[] getMixolydian(){
    	return mixolydian;
    }
    public int[] getDorian(){
    	return dorian;
    }
    public int[] getAeolian(){
    	return aeolian;
    }
    public int[] getPhrygian(){
    	return phrygian;
    }
    public int[] getLocrian(){
    	return locrian;
    }
   
}