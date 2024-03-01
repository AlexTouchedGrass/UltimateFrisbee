import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UltimatePlayer extends Person {
    //Attributes
    private int jerseyNumber; //Jersey number for the instance
    private static int jerseyNumberCounter; //Keeps track of how many jerseys have been assigned
    private String position; //Handler or Cutter

    //Constructors
    public UltimatePlayer(String firstName, String lastName, int jerseyNumber, String position) {
        //Wait until we make mutators - make interior last.
        super(firstName, lastName);
        setJerseyNumber(jerseyNumber);
        setPosition(position);
    }

    //Mutators (Setters)
    public void setJerseyNumber(int jerseyNumber){
        Random rand = new Random(); //This was unnecessary but I wanted to add it.
        boolean done = false;

        if (jerseyNumber >= 1 && jerseyNumber <= 100) {
            this.jerseyNumber = jerseyNumber;
        } else {
            while (!done) {
                this.jerseyNumber = rand.nextInt(100);
                if (jerseyNumber > 0) {
                    done = true;
                }
            }
        }
    }

    public static int setJerseyNumberCounter(int jerseyNumberCounter) {
        jerseyNumberCounter++;
        return jerseyNumberCounter;
    }

    public void setPosition(String position) {
        Scanner scan = new Scanner(System.in);

        position = scan.nextLine();
        if (position.equalsIgnoreCase("Cutter" || position.equalsIgnoreCase("Handler"))) {

        }

        this.position = position;
    }

    //Accessors
    public int getJerseyNumber(){return jerseyNumber;}

    public int getJerseyNumberCounter(){return jerseyNumberCounter;}

    public String getPosition() {return getPosition();}

    public String toString(){
        return super.toString() + "\nJersey #: " + getJerseyNumber() + "\nPosition: " + getPosition();  //Continued on next line.
    }
}
