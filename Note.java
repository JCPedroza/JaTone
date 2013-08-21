public class Note extends Sound{

	//===================================================================
    //                     Instance Variables
    //===================================================================
	
    private String name;
    
    //===================================================================
    //                       Constructors
    //===================================================================
    
    public Note(String startName, double freq, int vel, int att, int dec, int sus, int rel){
        super(freq, vel, att, dec, sus, rel);
        name = startName;
    }
    public Note(String startName){
    	this(startName, -1, 63, 1, 1, 127, 1);  	
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