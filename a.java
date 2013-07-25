import java.util.ArrayList;
import java.util.List;

public class a{

    public static void main(String args[]){
        Note            aNoteA      = new Note("A", 440.00, 60, 1, 1, 127, 1);
        Note            aNoteC      = new Note("C", 500.12, 60, 1, 1, 127, 1);
        Note            aNoteE      = new Note("E", 510.33, 60, 1, 1, 127, 1);
        Note[]          aNoteArray  = {aNoteA, aNoteC, aNoteE};
        List<Note>      aNoteAL     = new ArrayList<Note>();
        aNoteAL.add(aNoteA); aNoteAL.add(aNoteC); aNoteAL.add(aNoteE);
 
        Chord           aChord1     = new Chord(aNoteArray, "name1");
        Chord           aChord2     = new Chord(aNoteAL, "name2");

        System.out.println(aChord1.getSize());
        System.out.println(aChord1.getName());
        System.out.println(aChord2.getName());
        for (Note note : aChord2.getNotes()){
            System.out.println(note.getName());
        }
    }
}