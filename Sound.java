// !!! Needs more constructors!

/**
* Superclass for everything that produces a sound. The instance variables include only the most basic characteristics of a sound:
* the frequency, the velocity, and the envelope (attack, decay sustain, release). Other classes that extend Sound implement other
* characteristics, like name. 
*/
public class Sound{
    
	//===================================================================
    //                     Instance Variables
    //===================================================================
	
    private double frequency;
    private int    velocity;
    private int    attack;
    private int    decay;
    private int    sustain;
    private int    release;
    
    //===================================================================
    //                       Constructors
    //===================================================================
    
    public Sound(double frequency, int velocity, int attack, int decay, int sustain, int release){
        this.frequency = frequency;
        this.velocity  = velocity;
        this.attack    = attack;
        this.decay     = decay;
        this.sustain   = sustain;
        this.release   = release;
    }
    
    //===================================================================
    //                          Methods
    //===================================================================
    
    /**
    * @return the current state of the Sound as a string
    */
    @Override
    public String toString(){
    	return  "frequency: " + frequency + " velocity: " + velocity + " attack: "  + attack +
    			" decay: "    + decay     + " sustain: "  + sustain  + " release: " + release;
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
    
    //===================================================================
    //                          Setters
    //===================================================================
    
    public void setFrequency(double freq){
        frequency = freq;
    }
    
    public void setVelocity(int vel){
        velocity = vel;
    }
    
    public void setAttack(int att){
        attack = att;
    }
    
    public void setDecay(int dec){
        decay = dec;
    }
    
    public void setSustain(int sus){
        sustain = sus;
    }
    
    public void setRelease(int rel){
        release = rel;
    }

}