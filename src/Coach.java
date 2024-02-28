public class Coach extends Person {
    //Attributes
    private String expertise;
    private boolean headCoach;

    //Constructor
    public Coach(String firstName, String lastName, String expertise, boolean headCoach) {
        //Pulls from parent class
        super(firstName, lastName);

        //New for this class
        setExpertise(expertise);
        setHeadCoach(headCoach);
    }

    //Mutators
    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public void setHeadCoach(boolean headCoach) {
        this.headCoach = headCoach;
    }

    //Accessors
    public String getExpertise() {
        return expertise;
    }

    public boolean getHeadCoach() {
        return headCoach;
    }

    public String toString(){
        String s = "";
        s += super.toString() + "\nExpertise: " + getExpertise();
        if (getHeadCoach()) {
            s += "\nHead Coach";
        }
        else {
            s += "\nAssistant Coach";
        }
        return s;
    }
}