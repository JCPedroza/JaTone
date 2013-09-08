/**
* A Note is a Sound that belongs to a system, and has a name. Like the notes in the twelve-tone equal temperament system, and the notes
* in a scale and a chord. 
*/

public class Note extends Sound{

	//===================================================================
    //                     Instance Variables
    //===================================================================
	
	/**
	* The name of the note.
	*/
    private String name;
    
    //===================================================================
    //                       Constructors
    //===================================================================
    
    public Note(String name, double frequency, int velocity, int attack, int decay, int sustain, int release){
        super(frequency, velocity, attack, decay, sustain, release);
        this.name = name;
    }
    
    public Note(String name){
    	this(name, -1, 63, 1, 1, 127, 1);  	
    }
    
    /**
    * Copy constructor. Use this to make copies of Sound objects. 
    * @param newNote The Sound object to be copied.
    */
     public Note(Note newNote){
         this(newNote.getName(),  newNote.getFrequency(), newNote.getVelocity(), newNote.getAttack(),  
              newNote.getDecay(), newNote.getSustain(),   newNote.getRelease());
         setIsActive(newNote.getIsActive());
     }

    //===================================================================
    //                          Methods
    //===================================================================
    
    
    //===================================================================
    //                          Setters
    //===================================================================
    
    public void setName(String startName){
        name = startName;
    }
    
    //===================================================================
    //                          Getters
    //===================================================================
    
    public String getName(){
        return name;
    }
    
    //===================================================================
    //                       Special Getters
    //===================================================================
    
     /**
     * Builds a String with the values of the object.
     * @return The state of the Note as a String.
     */
     @Override
     public String toString(){
     	return  "name: "     + name         + " frequency: " + getFrequency() + " velocity: " + getVelocity() + 
     			" attack: "  + getAttack()  + " decay: "     + getDecay()     + " sustain: "  + getSustain()  + 
     			" release: " + getRelease() + " isActive: "  + String.valueOf(getIsActive());
     }
}