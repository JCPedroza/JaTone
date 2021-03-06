// !!! Needs more constructors! (wait until you read about factories though)
package sounds;

/**
* Superclass for everything that produces a sound. The instance variables include only the most basic characteristics of a sound:
* the frequency, the velocity, is it active?, and the envelope (attack, decay sustain, release). Other classes that extend Sound implement other
* characteristics, like name.
*/
public class Sound{
    
	//===================================================================
    //                     Instance Variables
    //===================================================================
	
	/**
	* The frequency of the sound in no particular unit. A frequency of -1 means that the value was not set, and it is the default value. 
	* Hertz are recommended as unit for compatibility with other devices, programs, and dynamics. 
	*/
    private double  frequency;
    
    /**
    * The velocity of the sound in no particular unit. MIDI range (0 to 127) is recommended for compatibility with MIDI dynamics. 
    */
    private int     velocity;
    
    /**
    * The time it takes the sound to reach its highest amplitude. It has no particular unit, and MIDI range (0 to 127) is recommended 
    * for compatibility with MIDI dynamics.
    */
    private int     attack;
    
    /**
    * The time it takes the sound to reach the sustain level after the highest amplitude was reached. It has no particular unit, 
    * and MIDI range (0 to 127) is recommended for compatibility with MIDI dynamics.
    */
    private int     decay;
    
    /**
    * The amplitude of the sound will keep while true. It has no particular unit, and MIDI range (0 to 127) is recommended for 
    * compatibility with MIDI dynamics.
    */
    private int     sustain;
    
    /**
    * The time it takes the sound to reach zero amplitude from its current amplitude, it's triggered by soundOn = false.
    */
    private int     release;
    
    /**
    * Represents if the sound is active (true) or not active (false).
    */
    private boolean isActive;
    
    //===================================================================
    //                         Constructors
    //===================================================================
    
    public Sound(double frequency, int velocity, int attack, int decay, int sustain, int release){
        this.frequency = frequency;
        this.velocity  = velocity;
        this.attack    = attack;
        this.decay     = decay;
        this.sustain   = sustain;
        this.release   = release;
        this.isActive  = true;
    }
    
    /**
    * Copy constructor. Use this to make copies of Sound objects. 
    * @param newSound The Sound object to be copied.
    */
    public Sound(Sound newSound){
        this(newSound.getFrequency(), newSound.getVelocity(), newSound.getAttack(), newSound.getDecay(), 
        	 newSound.getSustain(),   newSound.getRelease());
        isActive = newSound.getIsActive();
    }
    
    //===================================================================
    //                           Methods
    //===================================================================
 
    
    //===================================================================
    //                           Setters
    //===================================================================
    
    public void setFrequency(double frequency){
        this.frequency = frequency;
    }
    
    public void setVelocity(int velocity){
        this.velocity = velocity;
    }
    
    public void setAttack(int attack){
        this.attack = attack;
    }
    
    public void setDecay(int decay){
        this.decay = decay;
    }
    
    public void setSustain(int sustain){
        this.sustain = sustain;
    }
    
    public void setRelease(int release){
        this.release = release;
    }
    
    public void setIsActive(boolean isActive){
    	this.isActive = isActive;
    }

    //===================================================================
    //                          Getters
    //===================================================================
    
    public double getFrequency(){
        return frequency;
    }
    
    public int getVelocity(){
        return velocity;
    }
    
    public int getAttack(){
        return attack;
    }
    
    public int getDecay(){
        return decay;
    }
    
    public int getSustain(){
        return sustain;
    }
    
    public int getRelease(){
        return release;
    }
    
    public boolean getIsActive(){
    	return isActive;
    }
    
    //===================================================================
    //                       Special Getters
    //===================================================================
    
     /**
     * Builds a String with the values of the object. 
     * @return The state of the Sound as a String.
     */
     @Override
     public String toString(){
     	return  "frequency: " + frequency + " velocity: " + velocity + " attack: "  + attack  +
     			" decay: "    + decay     + " sustain: "  + sustain  + " release: " + release +
     			" isActive: " + String.valueOf(isActive);
     }
}