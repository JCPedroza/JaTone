public class Note extends Sound{

    // Instance variables
    private String name;
    
    // Constructor
    public Note(String startName, double freq, int vel, int att, int dec, int sus, int rel){
        super(freq, vel, att, dec, sus, rel);
        name = startName;
    }

    // Setters & Getters
    public void setName(String startName){
        name = startName;
    }
    public String getName(){
        return name;
    }
}