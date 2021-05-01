public class Instructor extends User {
    private String[] coursesGiven;

    public Instructor(int id, String firstName, String lasName, String email, String password) {
        super(id, firstName, lasName, email, password);
    }

    public String[] getCoursesTaught() {
        return coursesGiven;
    }

    public void setCoursesGiven(String[] coursesGiven) {
        this.coursesGiven = coursesGiven;

    }
}
