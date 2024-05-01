import java.util.ArrayList;
public class StudentClass {
    private String name;
    private double grade;
    private ArrayList<String> courses;

    // Constructors
    public StudentClass() {
        this.courses = new ArrayList<>();
    }

    public StudentClass(String name, double grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<String>();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    // Method to add a course
    public void addCourse(String course) {
        courses.add(course);
    }

    // Method to remove a course
    public void removeCourse(String course) {
        courses.remove(course);
    }
    public void printdetails(){
        System.out.println("Student: " + this.getName() + ", Grade: " + this.getGrade() + ", Courses: " + this.getCourses());
    }

    // Main method for testing
    public static void main(String[] args) {
        StudentClass s1 = new StudentClass();
        StudentClass s2 = new StudentClass("Ashes", 9.4);

        s1.setName("Jenna");
        s1.setGrade(7.8);
        s1.addCourse("Maths");
        s1.addCourse("English");
        s1.addCourse("Geography");
        s1.removeCourse("English");

        ArrayList<String> newCourses = new ArrayList<>();
        newCourses.add("History");
        newCourses.add("IT");
        newCourses.add("Maths");

        s2.setCourses(newCourses);
        s1.printdetails();
        s2.printdetails();
    }
}
