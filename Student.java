public class Student {
    //private variables, no one can access this information outside of the class
    private String firstName;
    private String lastName;
    private String major;
    private double gpa;
    
    // set the value of the variables
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //get the value of the variables from user or object 
    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public String getMajor() {
        return major;
    }
     
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    //default constructor method, initialize the value of the object
    public Student() {
        this("", "", "", 0.0);
    }
    
    // constructor with parameters, initialize the value of the object after getting the input from user
    public Student(String firstName, String lastName, String major, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.gpa = gpa;
    }
    
    public static void main(String[] args) {
        // creating new object name student1
        Student student1 = new Student();
        System.out.println("First name: " + student1.getFirstName());
        System.out.println("Last name: " + student1.getLastName());
        System.out.println("Major: " + student1.getMajor());
        System.out.println("GPA: " + student1.getGpa());
        // creating new object name student2 and initializing its value
        Student student2 = new Student("Peter", "Parker", "CS", 3.5);
        System.out.println("First name: " + student2.getFirstName());
        System.out.println("Last name: " + student2.getLastName());
        System.out.println("Major: " + student2.getMajor());
        System.out.println("GPA: " + student2.getGpa());
        // creating new object name student3 and initializing its value
        Student student3 = new Student("Harry", "Potter", "CS", 3.9);
        System.out.println("First name: " + student3.getFirstName());
        System.out.println("Last name: " + student3.getLastName());
        System.out.println("Major: " + student3.getMajor());
        System.out.println("GPA: " + student3.getGpa());
    }
}
