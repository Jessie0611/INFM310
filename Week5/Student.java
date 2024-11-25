// Student.java inherit from the Person class.
public class Student extends Person {
    private String studentID;

    // Default constructor
    public Student() {
        super();  // Calls the default constructor of the Person class
        this.studentID = "";
    }

    // Non-default constructor that accepts lastName as a parameter
    public Student(String lastName) {
        super(); // Calls the default constructor of the Person class
        setLastName(lastName);  // Set the last name from the parameter
        this.studentID = "";
    }

    // Get studentID
    public String getStudentID() {
        return studentID;
    }
    //Set studentID
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
