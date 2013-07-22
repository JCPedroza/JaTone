public class Sound{
    
    private double frequency;
    private int    velocity;
    private int    attack;
    private int    decay;
    private int    sustain;
    private int    release;

    public Sound(double freq, int vel, int att, int dec, int sus, int rel){
        frequency = freq;
        velocity  = vel;
        attack    = att;
        decay     = dec;
        sustain   = sus;
        release   = rel;
    }

}