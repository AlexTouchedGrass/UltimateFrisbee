import java.util.Random;
import java.util.Scanner;

public class UltimateCaptain extends UltimatePlayer {

    private boolean type;

    

    //Constructor
    public UltimateCaptain(String firstName, String lastName, int jerseyNumber, String position) {
        //Wait until we make mutators - make interior last.
        super(firstName, lastName, jerseyNumber, position);
    }

    //Accessors
    public String toString(){
        return super.toString();
    }
}
