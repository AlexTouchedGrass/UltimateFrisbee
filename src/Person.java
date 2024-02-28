public class Person {
    //Attributes
    private String firstName;
    private String lastName;

    //Constructors
    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    //Mutators (Setters)
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    //Accessors
    public String getFirstName () {return firstName;}

    public String getLastName () {return lastName;}

    public String toString () {return "Name: " + getFirstName() + " " + getLastName();}
}