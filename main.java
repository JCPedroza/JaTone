import java.util.Arrays;

public class main{

    public static void main(String args[]){
        Sound    aSound   = new Sound(440.03, 60, 1, 1, 127, 1);
        Note     aNote    = new Note("A", 440.00, 60, 1, 1, 127, 1);
        Formulas aFormula = new Formulas();

        System.out.println(aSound.getFrequency());
        System.out.println(aNote.getName());
        System.out.println(Arrays.toString(aFormula.pentmin));
    }
}