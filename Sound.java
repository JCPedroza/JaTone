public class Sound{
    
    // Instance variables
    private double frequency;
    private int    velocity;
    private int    attack;
    private int    decay;
    private int    sustain;
    private int    release;
    
    // Constructor
    public Sound(double freq, int vel, int att, int dec, int sus, int rel){
        frequency = freq;
        velocity  = vel;
        attack    = att;
        decay     = dec;
        sustain   = sus;
        release   = rel;
    }

    // Getters & Setters
    public void setFrequency(double freq){
        frequency = freq;
    }
    public double getFrequency(){
        return frequency;
    }

    public void setVelocity(int vel){
        velocity = vel;
    }
    public int getVelocity(){
        return velocity;
    }

    public void setAttack(int att){
        attack = att;
    }
    public int getAttack(){
        return attack;
    }

    public void setDecay(int dec){
        decay = dec;
    }
    public int getDecay(){
        return decay;
    }

    public void setSustain(int sus){
        sustain = sus;
    }
    public int getSustain(){
        return sustain;
    }

    public void setRelease(int rel){
        release = rel;
    }
    public int getRelease(){
        return release;
    }


}