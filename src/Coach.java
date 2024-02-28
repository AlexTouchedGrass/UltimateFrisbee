public class Coach extends Person {
    //Attributes
    private String expertise;
    private boolean headCoach;

    //Constructor
    public Coach(String firstName, String lastName, String role, boolean headCoach) {
        //Pulls from parent class
        super(firstName, lastName);

        //New for this class
        setRole(role);
        setHeadCoach(headCoach);
    }

    //Mutators
    public void setRole(String role) {
        this.role = role;
    }

    public void setHeadCoach(boolean headCoach) {
        this.headCoach = headCoach;
    }

    //Accessors
    public String getRole() {
        return expertise;
    }

    public boolean getHeadCoach() {
        return headCoach;
    }

    public String toString(){
        String s = "";
        s += super.toString() + "\nExpertise: " + getRole();
        if (getHeadCoach()) {
            s += "\nHead Coach";
        }
        else {
            s += "\nAssistant Coach";
        }
        return s;
    }
}