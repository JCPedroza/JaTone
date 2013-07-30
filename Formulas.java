public class Formulas{

    // Formulas for pentatonic scales
    public int[] pentmin = {3, 2, 2, 3, 2};  // minor pentatonic
    public int[] pentmaj = {2, 2, 3, 2, 3};  // major pentatonic
    
    // Formulas for hexatonic scales
    public int[] minblues   = {3, 2, 1, 1, 3, 2};  // minor blues 
    public int[] majblues   = {2, 1, 1, 3, 2, 3};  // major blues
    public int[] prometheus = {2, 2, 2, 3, 1, 2};  // prometheus - mystic
    public int[] istrian    = {1, 2, 1, 2, 1, 5};  // istrian
    public int[] wholetone  = {2, 2, 2, 2, 2, 2};  // whole tone
    public int[] augmented  = {3, 1, 3, 1, 3, 1};  // augmented - symmetrical augmented
    public int[] tritone    = {1, 3, 2, 1, 3, 2};  // tritone 
    public int[] twosemitri = {1, 1, 4, 1, 1, 4};  // two semitone tritone 
    
    // Major derived formulas
    public int[] lydian     = {2, 2, 2, 1, 2, 2, 1};  // lydian
    public int[] ionian     = {2, 2, 1, 2, 2, 2, 1};  // ionian - major
    public int[] mixolydian = {2, 2, 1, 2, 2, 1, 2};  // mixolydian
    public int[] dorian     = {2, 1, 2, 2, 2, 1, 2};  // dorian
    public int[] aeolian    = {2, 1, 2, 2, 1, 2, 2};  // aeolian - minor
    public int[] phrygian   = {1, 2, 2, 2, 1, 2, 2};  // phrygian
    public int[] locrian    = {1, 2, 2, 1, 2, 2, 2};  // locrian
    
    // Melodic minor derived formulas
    public int[] semilocrian  = {2, 1, 2, 1, 2, 2, 2}; // semilocrian
    public int[] superlocrian = {1, 2, 1, 2, 2, 2, 2}; // superlocrian
}