public class Note extends Sound{

	//===================================================================
    //                     Instance Variables
    //===================================================================
	
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

    //===================================================================
    //                          Methods
    //===================================================================
    
    @Override
    public String toString(){
    	return  "name: "     + name        + " frequency: " + getFrequency() + " velocity: " + getVelocity() + 
    			" attack: "  + getAttack() + " decay: "     + getDecay()     + " sustain: "  + getSustain()  + 
    			" release: " + getRelease();
    }
    
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
}