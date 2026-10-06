import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Represents a university student.
 */
class Student implements Comparable<Student>{;
    private int id;
    private String name;
    private String major;
    private double gpa;
    /**
     * Creates a new student.
     *
     * @param id    the unique student ID
     * @param name  the student's name
     * @param major the student's major
     * @param gpa   the student's grade point average
     */
    public Student(int id, String name, String major, double gpa){
        this.id = id;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }
    /** @param id the new student ID */
    public void setId(int id) {
        this.id = id;
    }
    /** @return the student ID */
    public int getId(){
        return id;
    }
    /** @param id the new student's name */
    public void setName(String name){
        this.name = name;
    }
    /** @return the student's name */
    public String getName(){
        return name;
    }
    /** @param id the new student's major */
    public void setMajor(String major){
        this.major = major;
    }
    /** @return the student's major */
    public String getMajor(){
        return major;
    }
    /** @param id the new student's gpa */
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    /** @return the student's gpa */
    public double getGpa(){
        return gpa;
    }

    /**
     * Natural ordering: by student name.
     *
     * @param other the student to compare to
     * @return negative, zero, or positive if this name comes before, equals, or comes after the other
     */
    @Override
    public int compareTo(Student other){
        return this.name.compareTo(other.name);
    }
    
     /**
     * Two students are equal if they have the same ID.
     *
     * @param obj the object to compare to
     * @return true if obj is a Student with the same ID
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (!(obj instanceof Student)) 
            return false;
        return this.id == ((Student) obj).id;
    }
    /**
     * Describes the student.
     *
     * @return a string with ID, name, major, and GPA
     */
    @Override
    public String toString() {
        return "Student[id=" + id + ", name=" + name + ", major=" + major + ", gpa=" + gpa + "]";
    }
}