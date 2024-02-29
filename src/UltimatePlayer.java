import java.util.ArrayList;

public class UltimatePlayer extends Person {
    //Attributes
    private int jerseyNumber; //Jersey number for the instance
    private static int jerseyNumberCounter; //Keeps track of how many jerseys have been assigned
    private String position; //Handler or Cutter

    //Constructors
    public UltimatePlayer(String firstName, String lastName, int jerseyNumber, int jerseyNumberCounter, boolean position) {
        //Wait until we make mutators - make interior last.
        super(firstName, lastName);
        setJerseyNumber(jerseyNumber);
        setJerseyNumberCounter(jerseyNumberCounter);
        setPosition(position);
    }

    //Mutators (Setters)
    public void setGradeLevel(int gradeLevel){
        if (gradeLevel >= 9 && gradeLevel <= 12) {
            this.gradeLevel = gradeLevel;
        } else {
            this.gradeLevel = 9;
        }
    }

    public void setPointsEarned(int pointsEarned) {
        if (pointsEarned >= 0) {
            this.pointsEarned = pointsEarned;
        } else {
            this.pointsEarned = 0;
        }
    }

    public void addPoints(int p){
        if (p >= 0) {
            pointsEarned += p;
        }
    }

    public void addEvent(String event) {
        events.add(event);
    }

    public void removeEvent(int indexOfEvent) {
        if (indexOfEvent >= 0 && indexOfEvent < events.size()) {
            events.remove(indexOfEvent);
        }
    }

    public void clearEvents(){
        events.clear();
    }

    //Accessors
    public int getGradeLevel(){return gradeLevel;}

    public int getPointsEarned(){return pointsEarned;}

    public ArrayList <String> getEvents() {return events;}

    public String toString(){
        return super.toString() + "\nGrade Level: " + getGradeLevel() + "\nPoints Earned: " //Continued on next line.
                + getPointsEarned() + "\nEvents: " + getEvents();
    }
}
