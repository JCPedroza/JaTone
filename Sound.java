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
    
    public Sound(double freq, int vel, int att, int dec, int sus, int rel){
        frequency = freq;
        velocity  = vel;
        attack    = att;
        decay     = dec;
        sustain   = sus;
        release   = rel;
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